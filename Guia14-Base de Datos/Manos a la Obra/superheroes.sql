DROP DATABASE IF EXISTS superheroes;
CREATE DATABASE superheroes CHARACTER SET utf8mb4;
USE superheroes;

CREATE TABLE creador (
id_creador INT UNSIGNED AUTO_INCREMENT PRIMARY KEY, 
  nombre VARCHAR(20) NOT NULL
);


CREATE TABLE personajes (
  id_personaje INT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
  nombre_real VARCHAR(20) NOT NULL,
  personaje VARCHAR(20) NOT NULL,
  inteligencia INT(10) NOT NULL,
  fuerza VARCHAR(10) NOT NULL,
  velocidad INT(11) NOT NULL,
  poder INT(11) NOT NULL,
  aparicion INT(11) NOT NULL,
  ocupacion VARCHAR(30) NULL,
  id_creador INT UNSIGNED NOT NULL,
  FOREIGN KEY (id_creador) REFERENCES creador(id_creador)
  );

INSERT INTO creador VALUE (1, "MARVEL");
INSERT INTO creador VALUE  (2, "DC Comics");
INSERT INTO personajes VALUE  (1,"Bruce Banner", "Hulk", 160, "600 mil",75,98,1962, "Físico Nuclear",1);
INSERT INTO personajes VALUE  (2,"Tony Stark", "Iron Man", 170, "200 mil",70,123,1963, "Inventor Industrial",1);
INSERT INTO personajes VALUE  (3,"Thor Odinson", "Thor", 145, "infinita",100,235,1962, "Rey de Asgard",1);
INSERT INTO personajes VALUE  (4,"Wanda Maximoff", "Bruja Escarlata", 170, "100 mil",90,345,1964, "Bruja",1);
INSERT INTO personajes VALUE  (5,"Carol Danvers", "Capitana Marvel", 157, "250 mil",85,128,1968, "Oficial de Inteligencia",1);
INSERT INTO personajes VALUE  (6,"Thanos", "Thanos", 170, "infinita",40,306,1973, "Adorador de la muerte",1);
INSERT INTO personajes VALUE  (7,"Peter Parker", "Spiderman", 165, "25 mil",80,74,1962, "Fotógrafo",1);
INSERT INTO personajes VALUE  (8,"Steve Roger", "Capitán América", 145, "600",45,60,1941, "Oficial Federal",1);
INSERT INTO personajes VALUE  (9,"Boby Drake", "Ice Man", 140, "2 mil",64,122,1963, "Contador",1);
INSERT INTO personajes VALUE  (10,"Barry Allen", "Flash", 160, "10 mil",120,168,1956, "Científico Forense",1);
INSERT INTO personajes VALUE  (11,"Bruce Wayne", "Batman", 170, "500",32,47,1939, "Hombre de Negocios",2);
INSERT INTO personajes VALUE  (12,"Clarck Kent", "Superman", 165, "infinita",120,182,1948, "Reportero",2);
INSERT INTO personajes VALUE  (13,"Daiana Pierce", "Mujer Maravilla", 160, "infinita",95,127,1949, "Princesa Guerrera",2);

select * from personajes;

/* modificar valor de un atributo*/
update personajes set aparicion= 1938 where id_personaje=12;

/* Eliminar un registro*/
DELETE FROM personajes WHERE personaje="Flash";

/*devolver todos los valores de la columna nombre_real*/
SELECT nombre_real FROM personajes;

/* devolver todos los nombres_reales que empiezen con B*/
SELECT nombre_real FROM personajes WHERE nombre_real LIKE 'b%';

/* ordenar la tabala de personajes por inteligencia*/

SELECT * FROM personajes ORDER BY inteligencia; 



