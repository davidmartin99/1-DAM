/**
 * Author:  david
 * Created: 25 may 2024
 */

CREATE DATABASE cajero;

USE cajero;

CREATE TABLE cliente(
         nombre VARCHAR(50), 
         apellidos VARCHAR(50), 
         cuenta INT(10), 
         saldo DECIMAL(10, 2) 
);
