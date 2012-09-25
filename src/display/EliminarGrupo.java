package display;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import org.springframework.web.context.*;

import domain.GrupoRepository;
import domain.Grupo;

import util.GrupoDTO;
import util.GrupoAssembler;

public class EliminarGrupo extends PageController {

  public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
  {
      GrupoRepository grupoRepo = (GrupoRepository) context.getBean("grupoRepository");
    try
	{
		Grupo grupo = grupoRepo.findGrupo(Integer.parseInt(request.getParameter("txtGrupoId")));
		grupoRepo.deleteGrupo(grupo);
		response.sendRedirect("listaProfesores");
    }
	catch (Exception e)
	{
        request.setAttribute("mensaje",e.getMessage());
        forward("/paginaError.jsp",request,response);
    }
  }
}