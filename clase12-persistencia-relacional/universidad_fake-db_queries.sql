USE universidad_fake_db;
-- -----------------------------------------------------------------------------
SELECT CONCAT_WS(' - ', cd_plan_estudio, titulo) AS cd_plan_estudio_y_titulo, 
 cd_plan_estudio, 
 titulo
FROM 
 PLAN_ESTUDIO;
-- -----------------------------------------------------------------------------
SELECT 
 m.cd_materia, 
 m.desc_materia
FROM 
 MATERIA m, 
 PLAN_MATERIA_CUATRIMESTRE pmc
WHERE 
 m.cd_materia = pmc.cd_materia AND pmc.cd_plan_estudio = 'II2009';
-- -----------------------------------------------------------------------------
SELECT m.cd_materia,
 m.nombre_materia
FROM MATERIA m
WHERE m.cd_materia IN (
SELECT pmc.cd_materia
FROM PLAN_MATERIA_CUATRIMESTRE pmc
WHERE pmc.cuatrimestre_carrera > 1 AND pmc.cd_plan_estudio = 'II2009');
-- -----------------------------------------------------------------------------
SET @cd_plan_estudio = 'II2009'; SET @cd_materia = 1031;
SELECT m.cd_materia,
 m.desc_materia
FROM MATERIA m
WHERE m.cd_materia IN(
SELECT m.cd_materia
FROM MATERIA m,
 PLAN_MATERIA_CUATRIMESTRE pmc
WHERE m.cd_materia = pmc.cd_materia AND @cd_plan_estudio = pmc.cd_plan_estudio AND pmc.cuatrimestre_carrera < (
SELECT pmc.cuatrimestre_carrera
FROM PLAN_MATERIA_CUATRIMESTRE pmc
WHERE @cd_plan_estudio = pmc.cd_plan_estudio AND @cd_materia = pmc.cd_materia)) AND m.cd_materia NOT IN(
SELECT c.cd_materia_correlativa
FROM CORRELATIVIDAD c
WHERE @cd_plan_estudio = c.cd_plan_estudio AND @cd_materia = c.cd_materia);
