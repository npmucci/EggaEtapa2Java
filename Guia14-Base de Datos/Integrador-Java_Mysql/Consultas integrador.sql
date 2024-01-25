/*
CANDADO A
Posición: El candado A está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)*/
SELECT COUNT(*) 
FROM estadisticas 
WHERE Asistencias_por_partido = (
    SELECT MAX(Asistencias_por_partido) 
    FROM estadisticas
); -- CANDADO A POSICION 2

/*Clave: La clave del candado A estará con formada por la/s siguientes consulta/s a la base de
datos:
Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea
centro o esté comprendida en otras posiciones.*/

SELECT SUM(peso) AS Peso_Jugadores
FROM jugadores
JOIN equipos ON jugadores.Nombre_equipo = equipos.Nombre
WHERE equipos.Conferencia = 'East'
AND jugadores.Posicion LIKE "%C%"; -- clave 14043

/*
CANDADO B
Posición: El candado B está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de
jugadores que tiene el equipo Heat.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)*/
SELECT COUNT(*)
FROM  jugadores
JOIN estadisticas on jugadores.codigo = estadisticas.jugador
where estadisticas.Asistencias_por_partido > (SELECT COUNT(*) AS NumJugadoresHeat
    FROM jugadores
    WHERE Nombre_equipo = 'Heat'
); -- POSICION CANDADO B = 3
/*
Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
datos:
La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.*/

SELECT COUNT(*)
FROM partidos
WHERE temporada LIKE '%99%'; -- CLAVE B 3480

/*CANDADO C
Posición: El candado C está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman
parte de equipos de la conferencia oeste.
Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a
195, y a eso le vamos a sumar 0.9945.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)*/

SELECT COUNT(*)
FROM jugadores
JOIN equipos ON jugadores.Nombre_equipo = equipos.Nombre
WHERE equipos.Conferencia = 'West'
AND jugadores.Procedencia = 'Michigan'; -- 2

SELECT COUNT(*)
FROM jugadores
WHERE peso >= 195; -- 362

-- POSICION CANDADO C = (2 / 362) + 0.9945 = 1

/*
Clave: La clave del candado C estará con formada por la/s siguientes consulta/s a la base de
datos:
Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de
sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de
tapones por partido. Además, este resultado debe ser, donde la división sea central.*/
SELECT FLOOR(AVG(estadisticas.Puntos_por_partido) + COUNT(estadisticas.Asistencias_por_partido) + SUM(estadisticas.Tapones_por_partido)) AS Clave_Candado_C
FROM estadisticas
JOIN jugadores ON jugadores.codigo = estadisticas.jugador
JOIN equipos ON jugadores.Nombre_equipo = equipos.Nombre
WHERE equipos.Division = 'Central'; -- CLAVE CANDADO C = 631

/*
CANDADO D
Posición: El candado D está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este
resultado debe ser redondeado. Nota: el resultado debe estar redondeado
Este resultado nos dará la posición del candado (1, 2, 3 o 4)*/

SELECT ROUND(estadisticas.Tapones_por_partido) AS POSICION_D
FROM estadisticas
JOIN jugadores ON estadisticas.jugador = jugadores.codigo
JOIN equipos ON jugadores.Nombre_equipo = equipos.Nombre
JOIN partidos ON equipos.Nombre = partidos.equipo_local
WHERE jugadores.Nombre LIKE 'Corey Maggette'
AND partidos.temporada = '00/01';

