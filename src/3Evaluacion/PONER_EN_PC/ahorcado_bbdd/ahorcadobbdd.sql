/**
 * Author:  david
 * Created: 26 may 2024
 */

CREATE DATABASE ahorcado;

USE ahorcado;

CREATE TABLE jugador (
          nombre VARCHAR(50),
          intentos INT,
          puntuacion DECIMAL(10,2)
);


GRANT ALL PRIVILEGES ON ahorcado.* TO 'david4'@'%';

FLUSH PRIVILEGES;