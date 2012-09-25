package domain;

public class GrupoFactory {
  public Grupo Create(int id,int numero,String sigla, String nombre,String horario,String aula,int id_profesor) {
    try {
      Grupo grupo = new Grupo();
	  grupo.setId(id);
	  grupo.setNumero(numero);
	  grupo.setSigla(sigla);
	  grupo.setNombre(nombre);
	  grupo.setHorario(horario);
	  grupo.setAula(aula);
	  grupo.setIdProfesor(id_profesor);	
      return grupo;
    } catch (Exception e) {
      return null;
    }
  }
}