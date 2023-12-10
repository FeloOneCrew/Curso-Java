USE JUGOS;
UPDATE tabla_de_vendedores SET porcentaje_comision = 0.10
WHERE nombre = 'Joan Geraldo de la Fonseca';

SELECT * FROM tabla_de_vendedores;SELECT * FROM tabla_de_vendedores;

UPDATE tabla_de_vendedores SET porcentaje_comision = 0.11
WHERE matricula = '00236';

UPDATE tabla_de_vendedores SET nombre = "Jhoan Geraldo de la Fonseca"
WHERE matricula = '00233';

SELECT * FROM tabla_de_vendedores;

DELETE FROM tabla_de_vendedores WHERE matricula = '00233' ;

ALTER TABLE tbproductos ADD PRIMARY KEY(producto);

SELECT * FROM tbproductos;

ALTER TABLE tbclientes ADD COLUMN(FECHA_NACIMIENTO DATE);

INSERT INTO tbclientes (
DNI,
NOMBRE,
DIRECCION1,
DIRECCION2,
BARRIO,
CIUDAD,
ESTADO,
CP,
EDAD,
SEXO,
LIMITE_CREDITO,
VOLUMEN_COMPRA,
PRIMERA_COMPRA,
FECHA_NACIMIENTO) VALUES('1035853362', 'FELO', 'CLL 76', '', 'ROBLEDO', 'MEDELLIN', 'ANTIOQUIA', '00541', 34, 'M', 100000000 , 2000, 0, '1988-09-17');

SELECT * FROM tbclientes;
DROP TABLE tabla_de_vendedores;

CREATE TABLE tabla_de_vendedores(
matricula varchar(5),
nombre varchar(100),
porcentaje_comision float,
fecha_admision DATE,
de_vacaciones VARCHAR(2));

ALTER TABLE tabla_de_vendedores ADD PRIMARY KEY(matricula);

INSERT INTO tabla_de_vendedores (
matricula, nombre, porcentaje_comision, fecha_admision, de_vacaciones) VALUES('00235', 'Márcio Almeida Silva', 0.08, '2014-08-15', 'No');

INSERT INTO tabla_de_vendedores (
matricula, nombre, porcentaje_comision, fecha_admision, de_vacaciones) VALUES('00236', 'Cláudia Morais', 0.08, '2013-09-17', 'Si');

INSERT INTO tabla_de_vendedores (
matricula, nombre, porcentaje_comision, fecha_admision, de_vacaciones) VALUES('00237', 'Roberta Martins', 0.11, '217-03-18', 'Si');

INSERT INTO tabla_de_vendedores (
matricula, nombre, porcentaje_comision, fecha_admision, de_vacaciones) VALUES('00238', 'Péricles Alves', 0.11, '2016-08-21', 'No');

SELECT * FROM tabla_de_vendedores;
