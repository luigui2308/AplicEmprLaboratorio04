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

import domain.GrupoRepository;
import domain.Grupo;
import util.GrupoDTO;
import util.GrupoAssembler;

public class DetalleGrupo extends PageController
{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
	{
		ProfesorRepository profesores = (ProfesorRepository)context.getBean("profesorRepository");
		GrupoRepository grupos = (GrupoRepository)context.getBean("grupoRepository");
		try
		{
			int id = Integer.parseInt(request.getParameter("id"));
			Profesor prof = profesores.findProfesor(id);
			ProfesorDTO dto = ProfesorAssembler.CreateDTO(prof);
			request.setAttribute("profesor",dto);
			
			Collection lista = grupos.findGrupoByProfesorId(id);
			List data = new ArrayList();
			Iterator itr = lista.iterator();
			while (itr.hasNext()) {
				Grupo grupo = (Grupo)itr.next();
				GrupoDTO dto = GrupoAssembler.CreateDTO(grupo);
				data.add(dto);
			}
			
			forward("/detalleProfesor.jsp",request,response);
		}
		catch (Exception e)
		{
			request.setAttribute("mensaje",e.getMessage());
			forward("/paginaError.jsp",request,response);
		}
	}
}