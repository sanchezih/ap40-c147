-- -----------------------------------------------------------------------------
-- Creacion de la base de datos
-- -----------------------------------------------------------------------------
DROP DATABASE IF EXISTS blog;
CREATE DATABASE blog;
-- -----------------------------------------------------------------------------
USE blog;
-- -----------------------------------------------------------------------------
-- Creacion de la tabla PUBLICACION
-- -----------------------------------------------------------------------------
CREATE TABLE PUBLICACION (
    cd_publicacion INT NOT NULL AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    cuerpo VARCHAR(500) NOT NULL,
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
    FOREIGN KEY (cd_publicacion) REFERENCES PUBLICACION (cd_publicacion)
);
