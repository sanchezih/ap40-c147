DROP DATABASE IF EXISTS qatar2022;
CREATE DATABASE IF NOT EXISTS qatar2022;
USE `qatar2022`;
-- -----------------------------------------------------------------------------
CREATE TABLE DEPARTAMENTO (
    cd_departamento INT NOT NULL AUTO_INCREMENT,
    nombre CHAR(100) NOT NULL,
    presupuesto INT,
    PRIMARY KEY (cd_departamento)
);
-- -----------------------------------------------------------------------------
CREATE TABLE EMPLEADO (
    cd_empleado INT NOT NULL AUTO_INCREMENT,
    dni CHAR(10),
    nombre CHAR(6),
    apellido CHAR(100),
    nacionalidad CHAR(100),
    cd_departamento INT,
    FOREIGN KEY (cd_departamento)
        REFERENCES DEPARTAMENTO (cd_departamento),
    PRIMARY KEY (cd_empleado)
);
-- -----------------------------------------------------------------------------
INSERT INTO DEPARTAMENTO (nombre, presupuesto) VALUES ('Legales', 200000);
INSERT INTO DEPARTAMENTO (nombre, presupuesto) VALUES ('Finanzas', 300000);
INSERT INTO DEPARTAMENTO (nombre, presupuesto) VALUES ('Marketing', 180000);
INSERT INTO DEPARTAMENTO (nombre, presupuesto) VALUES ('Sistemas', 150000);
-- -----------------------------------------------------------------------------
INSERT INTO EMPLEADO (dni, nombre, apellido, nacionalidad, cd_departamento) VALUES ('31300291', 'Juan', 'Perez', 'Argentino', 1);
