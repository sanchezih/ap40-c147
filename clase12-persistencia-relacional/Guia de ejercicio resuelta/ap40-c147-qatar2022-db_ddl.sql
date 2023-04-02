

DROP DATABASE IF EXISTS qatar2022;

CREATE DATABASE IF NOT EXISTS qatar2022;
 
USE `qatar2022`;

CREATE TABLE DEPARTAMENTO (
 cd_departamento INT, 
 nombre CHAR(100) NOT NULL,
 presupuesto int,
PRIMARY KEY (cd_departamento)
);


CREATE TABLE EMPLEADO (
 cd_empleado int,
 nombre CHAR(6), 
 apellido CHAR(100),
 presupuesto int,
PRIMARY KEY (cd_empleado)
);