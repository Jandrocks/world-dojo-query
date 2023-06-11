<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- c:out ; c:forEach etc. -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Formatting (dates) -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WORLD DataBase</title>
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="/css/main.css">
<!-- change to match your file/naming structure -->
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/app.js"></script>
<!-- change to match your file/naming structure -->
</head>
<body>

	<h1>WORLD DATABASE</h1>

	<h3>Consulta 1 - HABLA SLOVEN</h3>
	<table>
		<thead>
			<tr>
				<th>Country</th>
				<th>Language</th>
				<th>Percentage</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="paisesSloven" items="${paisesHablaSloveno}">
				<tr>
					<td><c:out value="${paisesSloven[0]}" /></td>
					<td><c:out value="${paisesSloven[1]}" /></td>
					<td><c:out value="${paisesSloven[2]}" /></td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
	<hr>
	<h3>Consulta 2- CIUDADES POR PAIS</h3>
	<table class=table>
		<thead>
			<tr>
				<th>City</th>
				<th>Total City</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="ciudadesPorPais" items="${numeroCiudadesPorPais}">
				<tr>
					<td><c:out value="${ciudadesPorPais[0]}" /></td>
					<td><c:out value="${ciudadesPorPais[1]}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<hr>
	<h3>Consulta 3 - MEXICO CIUDADES MAYOR 500K</h3>
	<table class=table>
		<thead>
			<tr>
				<th>City Name</th>
				<th>Poblacion</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="poblacionMexicoMayo500k"
				items="${poblacionMexicoMayo500k}">
				<tr>
					<td><c:out value="${poblacionMexicoMayo500k[0]}" /></td>
					<td><c:out value="${poblacionMexicoMayo500k[1]}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<hr>

	<h3>Consulta 4 - LENGUAJES POR PAIS MAYOR A 89%</h3>
	<table class=table>
		<thead>
			<tr>
				<th>Country Name</th>
				<th>Lenguage</th>
				<th>percentage</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="lenguajesPorPaisMayor89"
				items="${lenguajesPorPaisMayor89}">
				<tr>
					<td><c:out value="${lenguajesPorPaisMayor89[0]}" /></td>
					<td><c:out value="${lenguajesPorPaisMayor89[1]}" /></td>
					<td><c:out value="${lenguajesPorPaisMayor89[2]}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<hr>

	<h3>Consulta 5 - SUPERFICIE MENOR A 501 Y POBLACION MAYOR A 100K</h3>
	<table class=table>
		<thead>
			<tr>
				<th>Country Name</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach var="superficieMenor500MayorPoblacion100k"
				items="${superficieMenor500MayorPoblacion100k}">
				<tr>
					<td><c:out value="${superficieMenor500MayorPoblacion100k[0]}" /></td>

				</tr>
			</c:forEach>
		</tbody>
	</table>

	<hr>

	<h3>Consulta 6 - SOLO MONARCHY</h3>
	<table class=table>
		<thead>
			<tr>
				<th>Country Name</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach var="soloMonarchy" items="${soloMonarchy}">
				<tr>
					<td><c:out value="${soloMonarchy[0]}" /></td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
	<hr>

	<h3>Consulta 7 - CITY ARGENTINA</h3>
	<table class=table>
		<thead>
			<tr>
				<th>Country</th>
				<th>City</th>
				<th>Distric</th>
				<th>Population</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="ciudadesBA500"
				items="${ciudadesBuenosAiresPoblacion}">
				<tr>
					<td><c:out value="${ciudadesBA500[0]}" /></td>
					<td><c:out value="${ciudadesBA500[1]}" /></td>
					<td><c:out value="${ciudadesBA500[2]}" /></td>
					<td><c:out value="${ciudadesBA500[3]}" /></td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
	<hr>


	<h3>Consulta 8 - PAISES POR REGION</h3>
	<table class=table>
		<thead>
			<tr>
				<th>Region</th>
				<th>Number Country</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach var="numeroPaisesPorRegion"
				items="${numeroPaisesPorRegion}">
				<tr>
					<td><c:out value="${numeroPaisesPorRegion[0]}" /></td>
					<td><c:out value="${numeroPaisesPorRegion[1]}" /></td>


				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>