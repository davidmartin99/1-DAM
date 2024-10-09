/**
 * Author:  david
 * Created: 27 may 2024
 */

CREATE DATABASE loteria;

USE  loteria;

CREATE TABLE apuesta2 (
         fecha DATE,
         dni VARCHAR(9),
         nombre VARCHAR(50),
         aciertos INT,
         categoria VARCHAR(20),
         premio INT
);


GRANT ALL PRIVILEGES ON loteria.* TO 'david4'@'%';

FLUSH PRIVILEGES;

/*
CREATE TABLE apuesta (
         dni VARCHAR(9),
         nombre VARCHAR(50),
         aciertos INT,
         categoria VARCHAR(20),
         premio INT
);
*/
