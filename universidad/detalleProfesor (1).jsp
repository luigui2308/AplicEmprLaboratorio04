<%@ page import="java.util.Map" %>
<%@ page import="display.*" %>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Sistema Universitario</title>
  </head>
  <!--
  <h1>Sistema Universitario</h1>
  <h2>Detalle de Profesor</h2>
  -->
  <% ProfesorDTO prof = (ProfesorDTO)request.getAttribute("profesor"); %>
  <form name="ActualizarProfesor" action="/universidad/actualizarProfesor" method="get">
  <input type="hidden" name="id" value="<%= prof.id %>"/>
  <table>
    <tr><td>Nombre:</td><td><input type="text" name="nombre" value="<%= prof.nombre %>"/></td></tr>
    <tr><td>C&eacute;dula:</td><td><input type="text" name="cedula" value="<%= prof.cedula %>"/></td></tr>
    <tr><td>T&iacute;tulo:</td><td><input type="text" name="titulo" value="<%= prof.titulo %>"/></td></tr>
    <tr><td>Area:</td><td><input type="text" name="area" value="<%= prof.area %>"/></td></tr>
    <tr><td>Tel&eacute;fono:</td><td><input type="text" name="telefono" value="<%= prof.telefono %>"/></td></tr>
    <tr><td></td><td><input type="submit" value="Actualizar" /></td></tr>
  </table>
  <hr/>
  </form>
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
</html>