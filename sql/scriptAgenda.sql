CREATE DATABASE `agenda`;
USE agenda;
CREATE TABLE `personas`
(
  `idPersona` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  `Telefono` varchar(20) NOT NULL,
  PRIMARY KEY (`idPersona`)
);

CREATE TABLE `domicilio`
(
	`idDomicilio` varchar(45) NOT NULL AUTO_INCREMENT,
     `calle` varchar(45) NOT NULL,
     `altura` int(5) NOT NULL, 
     `piso` int(10) NOT NULL,
     `depto` int(10) NOT NULL, 
     `localidad` varchar(45) NOT NULL,
	 `Provincia` varchar(50) NOT NULL,
     `Pais` varchar(50) NOT NULL,
			PRIMARY KEY (`idDomicilio`)
);

CREATE TABLE `localidades` 
(
	`idLocalidad` int(11) NOT NULL AUTO_INCREMENT,
	`Nombre` varchar(45) NOT NULL,
			PRIMARY KEY (`idLocalidad`)
);

CREATE TABLE `provincias` (
  `idProvincia` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  `idLocalidad` int(11) NOT NULL,
    FOREIGN KEY (`idLocalidad`) REFERENCES `localidades`(`idLocalidad`) ON UPDATE CASCADE ,
          PRIMARY KEY (`idProvincia`)
);

CREATE TABLE `paises` (
  `idPais` int(11) NOT NULL  AUTO_INCREMENT,
  `Nombre` varchar(45) NOT NULL,
  `idProvincia` int(11) NOT NULL,
        FOREIGN KEY (`idProvincia`) REFERENCES `provincias`(`idProvincia`) ON UPDATE CASCADE ,
              PRIMARY KEY (`idPais`)
) 