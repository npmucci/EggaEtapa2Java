-- Candado A -- 
select count(*) from estadisticas where Asistencias_por_partido = (select max(Asistencias_por_partido) from estadisticas);
-- Posicion: 2
select sum(jugadores.Peso) from jugadores join equipos on equipos.Nombre = jugadores.Nombre_equipo where Conferencia = 'EAST' and Posicion like '%C%';
-- Clave: 14043 


-- Candado B -- 
select count(*) from estadisticas where Asistencias_por_partido > (select count(*) from jugadores where Nombre_equipo Like '%Heat%');
-- Posicion: 3
select count(*) from partidos where temporada like '%99%';
-- Clave: 3480


-- Candado C --
SELECT ROUND((COUNT(*) / (SELECT COUNT(*) FROM jugadores WHERE Peso >= 195) + 0.9945)) AS Posicion_Candado_C
FROM jugadores
WHERE Procedencia = 'Michigan' AND Nombre_equipo IN (SELECT Nombre FROM
equipos WHERE Conferencia = 'West');
-- Posicion: 1

select floor((avg(Puntos_por_partido) + count(asistencias_por_partido) + sum(Tapones_por_partido))) as Clave_C from estadisticas 
join jugadores on estadisticas.jugador = jugadores.codigo
join equipos on jugadores.Nombre_equipo = equipos.Nombre
where Division = "Central" ;
-- Clave: 631


-- Candado D --
select Round(Tapones_por_partido) from 
estadisticas join jugadores 
on estadisticas.jugador = jugadores.codigo
where Nombre = "Corey Maggette" and temporada = '00/01'; 
-- Posicion: 4

select floor(Sum(a.Puntos_por_partido)) from estadisticas a join jugadores j 
on a.jugador = j.codigo 
where Procedencia = 'Argentina';
-- Clave: 191

