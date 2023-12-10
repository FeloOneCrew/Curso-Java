CREATE DATABASE control_de_stock;
USE control_de_stock;
CREATE TABLE producto(
id INT AUTO_INCREMENT,
nombre VARCHAR(50) NOT NULL,
descripcion VARCHAR(255),
cantidad INT NOT NULL DEFAULT 0,
PRIMARY KEY(id)) Engine=InnoDB;

INSERT INTO producto(nombre, descripcion, cantidad) VALUES('mesa', 'mesa de 4 lugares', 10);

SELECT * FROM producto;

INSERT INTO producto(nombre, descripcion, cantidad) VALUES('Celular', 'Samsung', 50);