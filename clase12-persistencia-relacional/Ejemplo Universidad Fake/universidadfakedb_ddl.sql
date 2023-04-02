-- -----------------------------------------------------------------------------
-- Creacion de la base de datos
-- -----------------------------------------------------------------------------
DROP DATABASE IF EXISTS `universidadfakedb`;
CREATE DATABASE IF NOT EXISTS `universidadfakedb`;
-- -----------------------------------------------------------------------------
USE `universidadfakedb`;
-- -----------------------------------------------------------------------------
-- Creacion de la tabla PLAN_ESTUDIO
-- -----------------------------------------------------------------------------
CREATE TABLE PLAN_ESTUDIO (
    cd_plan_estudio CHAR(6),
    titulo CHAR(100) NOT NULL,
    PRIMARY KEY (cd_plan_estudio)
);
-- -----------------------------------------------------------------------------
-- Creacion de la tabla MATERIA
-- -----------------------------------------------------------------------------
CREATE TABLE MATERIA (
    cd_materia CHAR(6),
    desc_materia CHAR(100) UNIQUE NOT NULL,
    PRIMARY KEY (cd_materia)
);
-- -----------------------------------------------------------------------------
-- Creacion de la tabla PLAN_MATERIA_CUATRIMESTRE
-- -----------------------------------------------------------------------------
CREATE TABLE PLAN_MATERIA_CUATRIMESTRE (
    cd_plan_estudio CHAR(6),
    cd_materia CHAR(6),
    cuatrimestre_carrera INT CHECK (cuatrimestre_carrera IN (1 , 2, 3, 4, 5, 6)),
    PRIMARY KEY (cd_plan_estudio , cd_materia , cuatrimestre_carrera),
    FOREIGN KEY (cd_plan_estudio)
        REFERENCES PLAN_ESTUDIO (cd_plan_estudio),
    FOREIGN KEY (cd_materia)
        REFERENCES MATERIA (cd_materia)
);
-- -----------------------------------------------------------------------------
-- Creacion de la tabla CURSO
-- -----------------------------------------------------------------------------
CREATE TABLE CURSO (
    cd_curso INT,
    cd_materia CHAR(6),
    cd_plan_estudio CHAR(6),
    semestre INT CHECK (semestre = 1 OR semestre = 2),
    anio INT CHECK (anio BETWEEN 2005 AND 3000),
    PRIMARY KEY (cd_curso),
    FOREIGN KEY (cd_materia)
        REFERENCES MATERIA (cd_materia),
    FOREIGN KEY (cd_plan_estudio)
        REFERENCES PLAN_ESTUDIO (cd_plan_estudio)
);
-- -----------------------------------------------------------------------------
-- Creacion de la tabla ALUMNO
-- -----------------------------------------------------------------------------
CREATE TABLE ALUMNO (
    cd_alumno INT NOT NULL AUTO_INCREMENT,
    nombre_alumno CHAR(100) NOT NULL,
    apellido_alumno CHAR(100) NOT NULL,
    tipo_doc_alumno CHAR(3) CHECK (tipo_doc_alumno IN ('DNI' , 'CI')),
    nro_doc_alumno INT CHECK (nro_doc_alumno BETWEEN 1000 AND 999999999),
    email_alumno CHAR(100) NOT NULL,
    PRIMARY KEY (cd_alumno)
); ALTER TABLE 
 `ALUMNO` ADD UNIQUE `tipo_nro_doc_UNIQUE` (tipo_doc_alumno, nro_doc_alumno); ALTER TABLE 
 `ALUMNO` AUTO_INCREMENT = 150;
-- -----------------------------------------------------------------------------
-- Creacion de la tabla INSCRIPCION_PLAN
-- -----------------------------------------------------------------------------
CREATE TABLE INSCRIPCION_PLAN (
    cd_alumno INT,
    cd_plan_estudio CHAR(6),
    fc_alta DATETIME NOT NULL,
    PRIMARY KEY (cd_alumno , cd_plan_estudio),
    FOREIGN KEY (cd_alumno)
        REFERENCES ALUMNO (cd_alumno),
    FOREIGN KEY (cd_plan_estudio)
        REFERENCES PLAN_ESTUDIO (cd_plan_estudio)
);
-- -----------------------------------------------------------------------------
-- Creacion de la tabla INSCRIPCION_CURSO
-- -----------------------------------------------------------------------------
CREATE TABLE INSCRIPCION_CURSO (
    cd_alumno INT,
    cd_curso INT,
    fc_alta DATETIME NOT NULL,
    PRIMARY KEY (cd_alumno , cd_curso),
    FOREIGN KEY (cd_alumno)
        REFERENCES ALUMNO (cd_alumno),
    FOREIGN KEY (cd_curso)
        REFERENCES CURSO (cd_curso)
);
-- -----------------------------------------------------------------------------
-- Creacion de la tabla CORRELATIVIDAD
-- -----------------------------------------------------------------------------
CREATE TABLE CORRELATIVIDAD (
    cd_plan_estudio CHAR(6),
    cd_materia CHAR(6),
    cd_materia_correlativa CHAR(6),
    PRIMARY KEY (cd_plan_estudio , cd_materia , cd_materia_correlativa),
    FOREIGN KEY (cd_plan_estudio)
        REFERENCES PLAN_ESTUDIO (cd_plan_estudio),
    FOREIGN KEY (cd_materia)
        REFERENCES MATERIA (cd_materia),
    FOREIGN KEY (cd_materia_correlativa)
        REFERENCES MATERIA (cd_materia)
);
-- -----------------------------------------------------------------------------
-- INSERTS
-- -----------------------------------------------------------------------------
INSERT INTO ALUMNO (
 nombre_alumno, apellido_alumno, tipo_doc_alumno, 
 nro_doc_alumno, email_alumno
) VALUES 
 (
 'MARIA', 'PEREZ', 'DNI', 11111111, 
 'MPEREZ@MAIL.COM'
);
INSERT INTO ALUMNO (
 nombre_alumno, apellido_alumno, tipo_doc_alumno, 
 nro_doc_alumno, email_alumno
) VALUES 
 (
 'FERNANDO', 'LOPEZ', 'DNI', 22222222, 
 'FLOPEZ@MAIL.COM'
);
INSERT INTO ALUMNO (
 nombre_alumno, apellido_alumno, tipo_doc_alumno, 
 nro_doc_alumno, email_alumno
) VALUES 
 (
 'CECILIA', 'RUIZ', 'DNI', 33333333, 
 'CRUIZ@MAIL.COM'
);
INSERT INTO ALUMNO (
 nombre_alumno, apellido_alumno, tipo_doc_alumno, 
 nro_doc_alumno, email_alumno
) VALUES 
 (
 'EDUARDO', 'VENTURA', 'DNI', 44444444, 
 'EVENTURA@MAIL.COM'
);
-- -----------------------------------------------------------------------------
INSERT INTO PLAN_ESTUDIO VALUES 
 (
 'II2009', 'INGENIERIA INFORMATICA'
);
-- -----------------------------------------------------------------------------
INSERT INTO MATERIA VALUES 
 ('1023', 'Analisis Matematico I');
INSERT INTO MATERIA VALUES 
 (
 '1024', 'Elementos de Programacion'
);
INSERT INTO MATERIA VALUES 
 (
 '1025', 'Sistemas de Representacion'
);
INSERT INTO MATERIA VALUES 
 (
 '1026', 'Tecnologia, Ingenieria y Sociedad'
);
INSERT INTO MATERIA VALUES 
 (
 '1027', 'Algebra y Geometria Analitica I'
);
INSERT INTO MATERIA VALUES 
 ('1028', 'Matematica Discreta');
INSERT INTO MATERIA VALUES 
 ('1029', 'Quimica General');
INSERT INTO MATERIA VALUES 
 ('1030', 'Fundamentos de TICs');
INSERT INTO MATERIA VALUES 
 ('1031', 'Fisica I');
INSERT INTO MATERIA VALUES 
 (
 '1032', 'Algebra y Geometria analitica II'
);
INSERT INTO MATERIA VALUES 
 (
 '1033', 'Analisis Matematico II'
);
INSERT INTO MATERIA VALUES 
 ('1035', 'Fisica II');
INSERT INTO MATERIA VALUES 
 (
 '1108', 'Requerimientos para la Ingenieria'
);
INSERT INTO MATERIA VALUES 
 (
 '1109', 'Arquitectura de Computadoras'
);
INSERT INTO MATERIA VALUES 
 (
 '1110', 'Programacion / Incluye TCP'
);
-- -----------------------------------------------------------------------------
INSERT INTO PLAN_MATERIA_CUATRIMESTRE VALUES 
 ('II2009', '1023', 1);
INSERT INTO PLAN_MATERIA_CUATRIMESTRE VALUES 
 ('II2009', '1024', 1);
INSERT INTO PLAN_MATERIA_CUATRIMESTRE VALUES 
 ('II2009', '1025', 1);
INSERT INTO PLAN_MATERIA_CUATRIMESTRE VALUES 
 ('II2009', '1026', 1);
INSERT INTO PLAN_MATERIA_CUATRIMESTRE VALUES 
 ('II2009', '1027', 2);
INSERT INTO PLAN_MATERIA_CUATRIMESTRE VALUES 
 ('II2009', '1028', 2);
INSERT INTO PLAN_MATERIA_CUATRIMESTRE VALUES 
 ('II2009', '1029', 2);
INSERT INTO PLAN_MATERIA_CUATRIMESTRE VALUES 
 ('II2009', '1030', 2);
INSERT INTO PLAN_MATERIA_CUATRIMESTRE VALUES 
 ('II2009', '1031', 3);
INSERT INTO PLAN_MATERIA_CUATRIMESTRE VALUES 
 ('II2009', '1032', 3);
INSERT INTO PLAN_MATERIA_CUATRIMESTRE VALUES 
 ('II2009', '1033', 3);
INSERT INTO PLAN_MATERIA_CUATRIMESTRE VALUES 
 ('II2009', '1035', 3);
INSERT INTO PLAN_MATERIA_CUATRIMESTRE VALUES 
 ('II2009', '1108', 4);
INSERT INTO PLAN_MATERIA_CUATRIMESTRE VALUES 
 ('II2009', '1109', 4);
INSERT INTO PLAN_MATERIA_CUATRIMESTRE VALUES 
 ('II2009', '1110', 4);
-- -----------------------------------------------------------------------------
INSERT INTO CORRELATIVIDAD VALUES 
 ('II2009', '1031', '1023');
INSERT INTO CORRELATIVIDAD VALUES 
 ('II2009', '1032', '1027');
INSERT INTO CORRELATIVIDAD VALUES 
 ('II2009', '1033', '1023');
INSERT INTO CORRELATIVIDAD VALUES 
 ('II2009', '1035', '1031');
INSERT INTO CORRELATIVIDAD VALUES 
 ('II2009', '1108', '1030');
INSERT INTO CORRELATIVIDAD VALUES 
 ('II2009', '1109', '1028');
INSERT INTO CORRELATIVIDAD VALUES 
 ('II2009', '1109', '1030');
INSERT INTO CORRELATIVIDAD VALUES 
 ('II2009', '1110', '1024');
INSERT INTO CORRELATIVIDAD VALUES 
 ('II2009', '1110', '1028');
-- -----------------------------------------------------------------------------
INSERT INTO INSCRIPCION_PLAN VALUES 
 (150, 'II2009', '2021/03/01');
INSERT INTO INSCRIPCION_PLAN VALUES 
 (151, 'II2009', '2021/03/01');
INSERT INTO INSCRIPCION_PLAN VALUES 
 (152, 'II2009', '2021/03/01');
INSERT INTO INSCRIPCION_PLAN VALUES 
 (153, 'II2009', '2021/03/01');
-- -----------------------------------------------------------------------------
INSERT INTO CURSO VALUES 
 (5018, '1023', 'II2009', 1, 2021);
INSERT INTO CURSO VALUES 
 (5019, '1024', 'II2009', 1, 2021);
INSERT INTO CURSO VALUES 
 (5020, '1025', 'II2009', 1, 2021);
INSERT INTO CURSO VALUES 
 (5021, '1026', 'II2009', 1, 2021);
