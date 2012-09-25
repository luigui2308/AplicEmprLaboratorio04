package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.ProfesorRepository;
import domain.Profesor;

import util.ProfesorDTO;
import util.ProfesorAssembler;

public class AgregarProfesor extends PageController {

  public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException, IOException
  {
      ProfesorRepository profesores = (ProfesorRepository) context.getBean("profesorRepository");
    try {
        //String id = request.getParameter("id");
        //int idProf = Integer.parseInt(id);
        String cedula = request.getParameter("cedula");
        String nombre = request.getParameter("nombre");
        String titulo = request.getParameter("titulo");
        String area = request.getParameter("area");
        String telefono = request.getParameter("telefono");
        Profesor prof = profesores.findProfesor(idProf);
        try {
            prof.setCedula(cedula);
            prof.setNombre(nombre);
            prof.setTitulo(titulo);
            prof.setArea(area);
            prof.setTelefono(telefono);
            profesores.insertProfesor(prof);
        } catch (Exception e) {}
        response.sendRedirect("listaProfesores");
    } catch (Exception e) {
        request.setAttribute("mensaje",e.getMessage());
        forward("/paginaError.jsp",request,response);
    }
  }
}