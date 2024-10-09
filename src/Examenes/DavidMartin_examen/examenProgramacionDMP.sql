CREATE DATABASE prueba;
USE prueba;

CREATE TABLE jugador (DNI VARCHAR(9), nombre VARCHAR(50) );
CREATE TABLE puntuacion (DNI VARCHAR(9), fecha DATE, puntuacion DECIMAL(10, 2), intentos INT);


GRANT ALL PRIVILEGES ON juego.* TO 'david4'@'%';

FLUSH PRIVILEGES;