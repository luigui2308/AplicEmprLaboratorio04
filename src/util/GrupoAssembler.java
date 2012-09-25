package util;
import domain.Grupo;

public class GrupoAssembler {
  public static GrupoDTO CreateDTO(Grupo grupo) {
    GrupoDTO dto = new GrupoDTO();
	dto.setId(grupo.getId());
	dto.setNumero(grupo.getNumero());
	dto.setSigla(grupo.getSigla());
	dto.setNombre(grupo.getNombre());
	dto.setHorario(grupo.getHorario());
	dto.setAula(grupo.getAula());
	dto.setIdProfesor(grupo.getIdProfesor());	
    return dto;
  }
  public static void Update(Grupo grupo, GrupoDTO dto) {
    try {
		grupo.setId(dto.getId());
		grupo.setNumero(dto.getNumero());
		grupo.setSigla(dto.getSigla());
		grupo.setNombre(dto.getNombre());
		grupo.setHorario(dto.getHorario());
		grupo.setAula(dto.getAula());
		grupo.setIdProfesor(dto.getIdProfesor());
    } catch (Exception e) {
    }
  }
}