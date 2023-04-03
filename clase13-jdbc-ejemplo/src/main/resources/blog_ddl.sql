-- -----------------------------------------------------------------------------
-- Creacion de la base de datos
-- -----------------------------------------------------------------------------
DROP DATABASE IF EXISTS blog;
CREATE DATABASE IF NOT EXISTS blog;
-- -----------------------------------------------------------------------------
USE blog;
-- -----------------------------------------------------------------------------
-- Creacion de la tabla PUBLICACION
-- -----------------------------------------------------------------------------
CREATE TABLE PUBLICACION (
    cd_publicacion INT NOT NULL AUTO_INCREMENT,
    titulo CHAR(100) NOT NULL,
    cuerpo CHAR(100) NOT NULL,
    PRIMARY KEY (cd_publicacion)
);
-- -----------------------------------------------------------------------------
-- Creacion de la tabla COMENTARIO
-- -----------------------------------------------------------------------------
CREATE TABLE COMENTARIO (
    cd_comentario INT NOT NULL AUTO_INCREMENT,
    nombre CHAR(100) NOT NULL,
    cuerpo CHAR(100) NOT NULL,
    cd_publicacion INT NOT NULL,
    PRIMARY KEY (cd_comentario),
    FOREIGN KEY (cd_publicacion)
        REFERENCES PUBLICACION (cd_publicacion)
);
-- -----------------------------------------------------------------------------
INSERT INTO PUBLICACION (titulo, cuerpo) VALUES ('Herramientas No Code', 'El movimiento No Code esta impulsado por la creciente demanda...');
INSERT INTO PUBLICACION (titulo, cuerpo) VALUES ('Qué es ChatGPT', 'ChatGPT es un modelo de lenguaje de gran escala...');
INSERT INTO PUBLICACION (titulo, cuerpo) VALUES ('Para que sirve un servidor VPS?', 'Cuando se trata de planificar un buen contexto para...');
-- -----------------------------------------------------------------------------
INSERT INTO COMENTARIO (nombre, cuerpo, cd_publicacion) VALUES ('Fernanda', 'Buen articulo!', 1);