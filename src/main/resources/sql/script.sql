 create database bdcibertec;

use bdcibertec;

CREATE TABLE Medico
(
 IdMedico 		INT NOT NULL AUTO_INCREMENT,
 NomMedico		VARCHAR(50) NOT NULL,
 ApeMedico 		VARCHAR(50) NOT NULL,
 FechNacMedico	DATE NOT NULL,
 PRIMARY KEY (IdMedico)
);


INSERT INTO Medico (NomMedico, ApeMedico, FechNacMedico)
VALUES
    ('Juan', 'Pérez', '1980-05-15'),
    ('María', 'Gómez', '1975-08-22'),
    ('Carlos', 'López', '1990-03-10'),
    ('Ana', 'Martínez', '1988-11-27'),
    ('Pedro', 'Sánchez', '1982-07-18');




CREATE TABLE Especialidad
(
 IdEspecialidad 		INT NOT NULL AUTO_INCREMENT,
 Titulo 			VARCHAR(250) NOT NULL,
 Funcion 			VARCHAR(250) NOT NULL,
 FechGraduacion	DATE NOT NULL,
 IdMedico 			INT NOT NULL,
 PRIMARY KEY (IdEspecialidad),
 FOREIGN KEY (IdMedico) REFERENCES Medico(IdMedico)
 );



INSERT INTO Especialidad (Titulo, Funcion, FechGraduacion, IdMedico)
VALUES
    ('Cardiología', 'Especialista en enfermedades del corazón', '2010-06-30', 1),
    ('Dermatología', 'Especialista en enfermedades de la piel', '2008-04-25', 2),
    ('Pediatría', 'Especialista en atención médica infantil', '2012-09-15', 3),
    ('Oftalmología', 'Especialista en problemas de la vista', '2005-11-20', 4),
    ('Neurología', 'Especialista en enfermedades del sistema nervioso', '2007-08-12', 5);