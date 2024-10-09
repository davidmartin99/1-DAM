CREATE DATABASE juegoNumero;

use juegoNumero;

CREATE TABLE jugador (
	dni VARCHAR(9),
	nombre VARCHAR(50),
	fecha DATE,
	puntuacion DECIMAL(10, 2),
	intentos INT
);


INSERT INTO jugador VALUES 
('48484848R', 'Pepe', '2023-09-12', 2.5, 10);


