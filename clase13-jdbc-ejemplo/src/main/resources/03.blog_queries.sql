USE blog;
-- -----------------------------------------------------------------------------
SELECT * FROM PUBLICACION;
-- -----------------------------------------------------------------------------
SELECT 	*
FROM	PUBLICACION
WHERE	cd_publicacion = 1;
-- -----------------------------------------------------------------------------
SELECT 
    c.cd_comentario AS codigo_de_comentario,
    c.nombre,
    c.cuerpo,
    p.titulo
FROM
    COMENTARIO AS c,
    PUBLICACION AS p
WHERE
    p.cd_publicacion = c.cd_publicacion
        AND p.cd_publicacion = 1;
-- -----------------------------------------------------------------------------
SELECT * FROM COMENTARIO;
-- -----------------------------------------------------------------------------
UPDATE COMENTARIO 
SET 
    nombre = 'Fernanda',
    cuerpo = 'Muy buen articulo!'
WHERE
    cd_comentario = 3;
-- -----------------------------------------------------------------------------
