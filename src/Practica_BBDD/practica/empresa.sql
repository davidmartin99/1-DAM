/**
 * Author:  david
 * Base de Datos llamada empresa
 * Created: 10 may 2024
 */

sudo mysql -u root -p 

CREATE DATABASE empresa;

GRANT ALL PRIVILEGES ON empresa.* TO ‘david4’@’%’;

FLUSH PRIVILEGES;

EXIT;


mysql -u david4 -p 

SHOW DATABASES;

USE empresa;

CREATE TABLE empleados (
    nombre VARCHAR(50),
    apellidos VARCHAR(50),
    fechaNacimiento DATE,
    fechaIngreso DATE,
    puesto VARCHAR(50),
    salario DECIMAL(10, 2)
);

CREATE TABLE empleadosAntiguos (
    nombre VARCHAR(50),
    apellidos VARCHAR(50),
    fechaNacimiento DATE,
    fechaIngreso DATE,
    fechaFinalizacion TIMESTAMP
);

INSERT INTO empleados VALUES ('Juan', 'Torres', '1960-01-01', '1980-05-24', 'Jefe', 60000.00);

INSERT INTO empleados VALUES ('Sara', 'Gonzalez', '1980-05-02', '1999-06-03', 'Secretaria', 25000.00);

INSERT INTO empleados VALUES ('Elena', 'Sanchez', '1990-09-03', '2010-11-02', 'TecnicoFP', 30000.00);

INSERT INTO empleados VALUES ('Pepe', 'Uriel', '1991-10-04', '2015-10-01', 'Administrativo', 24000.00);

INSERT INTO empleados VALUES (‘David’, ‘Martin’, ‘1999-04-17’, ‘2025-06-13’, ‘Programador’, 26000.00);
