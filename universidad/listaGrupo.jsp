<%@ page import="java.util.*" %>
<%@ page import="display.*" %>
<html>
  <head>
    <title>Sistema Universitario</title>
  </head>
  <!--
  <h1>Sistema Universitario</h1>
  <h2>Listado de profesores</h2>
  -->
  <table>
	<tr><th>Numero</th><th>Sigla</th><th>Nombre</th><th>Horario</th><th>Aula</th><th>Profesor</th><th/></tr>
    <% for (GrupoDTO grupo : (List)request.getAttribute("grupos")) { %>
	<tr>
		<td><%= grupo.numero%></td>
		<td><%= grupo.sigla%></td>
		<td><%= grupo.nombre%></td>
		<td><%= grupo.horario%></td>
		<td><%= grupo.aula%></td>
		<td><%= grupo.id_profesor%></td>
		<td>
			<a href="/universidad/detalleGrupo?id=<%= grupo.id%>">Detalle</a>
			<a href="/universidad/eliminarGrupo?id=<%= grupo.id%>">Eliminar</a>
		</td>
	</tr>
  </table>
	<a href="../agregarGrupo.jsp">Agregar</a><br/>
	<a href="/universidad/listaProfesores">Administracion de profesores</a>
</html>