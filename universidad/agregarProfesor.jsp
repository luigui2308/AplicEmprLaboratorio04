<%@ page import="java.util.Map" %>
<%@ page import="display.*" %>

<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Sistema Universitario</title>
  </head>
  <!--
  <h1>Sistema Universitario</h1>
  <h2>Agregar Profesor</h2>
  -->
  <form name="AgregarProfesor" action="/universidad/agregarProfesor" method="get">
  <input type="hidden" name="id"/>
  <table>
    <tr><td>Nombre:</td><td><input type="text" name="nombre"/></td></tr>
    <tr><td>C&eacute;dula:</td><td><input type="text" name="cedula"/></td></tr>
    <tr><td>T&iacute;tulo:</td><td><input type="text" name="titulo"/></td></tr>
    <tr><td>Area:</td><td><input type="text" name="area"/></td></tr>
    <tr><td>Tel&eacute;fono:</td><td><input type="text" name="telefono"/></td></tr>
    <tr><td></td><td><input type="submit" value="Actualizar"/></td></tr>
  </table>
  </form>
</html>