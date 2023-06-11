package com.alemeza.world.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.alemeza.world.models.PaisModel;

public interface PaisRepo extends CrudRepository<PaisModel, Long> {

	// Consulta 1. Todos los países que hablan Sloveno? Su consulta debe retornar el
	// nombre del país, lenguaje y porcentaje del lenguaje. Su consulta debe
	// organizar los resultados por porcentaje en orden descendente.
	@Query(value = "SELECT name, language, percentage FROM countries JOIN languages "
			+ "ON countries.id = languages.country_id"
			+ " WHERE language = 'Slovene' ORDER BY percentage DESC;", nativeQuery = true)

	List<Object[]> paisesHablaSloveno();

	// Consulta 2. ¿Qué consulta ejecutarías para mostrar el número total de
	// ciudades de cada país? Su consulta debe retornar el nombre del país y el
	// número total de ciudades. Su consulta debe organizar los resultados por
	// número de ciudades en orden descendente.
	@Query(value = "SELECT c.name AS country_name, COUNT(ct.id) AS total_cities\r\n" + "FROM countries AS c\r\n"
			+ "JOIN cities AS ct ON c.id = ct.country_id\r\n" + "GROUP BY c.id, c.name\r\n"
			+ "ORDER BY total_cities DESC;", nativeQuery = true)

	List<Object[]> numeroCiudadesPorPais();

	// Consulta 3. ¿Qué consulta ejecutarías para obtener todas las ciudades en
	// México con una población mayor a 500.000? Su consulta debe organizar los
	// resultados por población en orden descendente.

	@Query(value = "SELECT cities.name, cities.population\r\n" + "FROM cities\r\n"
			+ "JOIN countries ON cities.country_id = countries.id\r\n"
			+ "WHERE countries.name = 'Mexico' AND cities.population > 500000\r\n"
			+ "ORDER BY cities.population DESC;", nativeQuery = true)

	List<Object[]> poblacionMexicoMayo500k();

	// Consulta 4. ¿Qué consulta ejecutarías para obtener todos los lenguajes en
	// cada país con un porcentaje mayor al 89%? Su consulta debe organizar los
	// resultados por porcentaje en orden descendente.

	@Query(value = "SELECT countries.name, languages.language, languages.percentage\r\n" + "FROM countries\r\n"
			+ "JOIN languages ON countries.id = languages.country_id\r\n" + "WHERE languages.percentage > 89\r\n"
			+ "ORDER BY languages.percentage DESC;", nativeQuery = true)

	List<Object[]> lenguajesPorPaisMayor89();

	// Consulta 5. ¿Qué consulta ejecutarías para obtener todos los países con un
	// superficie de área inferior a 501 y una población mayor a 100.000?

	@Query(value = "SELECT name\r\n" + "FROM countries\r\n"
			+ "WHERE surface_area < 501 AND population > 100000;", nativeQuery = true)

	List<Object[]> superficieMenor500MayorPoblacion100k();

	// Consulta 6. ¿Qué consulta ejecutarías para obtener todos los países que
	// tienen solo Constitutional Monarchy (Monarquía) y una superficie de área
	// mayor a 200 y una expectativa de vida superior a los 75 años?

	@Query(value = "SELECT name\r\n" + "		FROM countries\r\n"
			+ "		WHERE government_form = 'Constitutional Monarchy' AND surface_area > 200 AND life_expectancy > 75;", nativeQuery = true)

	List<Object[]> soloMonarchy();

	// Consulta 7. ¿Qué consulta ejecutarías para obtener todas las ciudades de
	// Argentina dentro del distrito de Buenos Aires y que tengan una población
	// mayor a 500.000? La consulta debe retornar el nombre del país, nombre de la
	// ciudad, distrito y población.
	@Query(value = "SELECT  countries.name, cities.name, cities.district, cities.population FROM countries\r\n"
			+ "INNER JOIN cities ON countries.id = cities.country_id\r\n"
			+ "WHERE countries.name =\"Argentina\" AND district =\"Buenos Aires\" AND cities.population > 500000\r\n"
			+ "ORDER BY cities.population DESC;", nativeQuery = true)

	List<Object[]> ciudadesBuenosAiresPoblacion();

	// Consulta 8.¿Qué consulta ejecutarías para sumar el número de países en cada región? La
	// consulta debe mostrar el nombre de la región y el número de países. Además,
	// la consulta debe organizar los resultados por el número de países en orden
	// descendente.
	@Query(value = "SELECT region, COUNT(*) AS num_paises\r\n" + "	FROM countries\r\n" + "	GROUP BY region\r\n"
			+ "	ORDER BY num_paises DESC;", nativeQuery = true)

	List<Object[]> numeroPaisesPorRegion();


}