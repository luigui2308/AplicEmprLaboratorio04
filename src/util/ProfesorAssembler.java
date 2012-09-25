package util;
import domain.Profesor;

public class ProfesorAssembler {
  public static ProfesorDTO CreateDTO(Profesor prof) {
    ProfesorDTO dto = new ProfesorDTO();
    dto.setId(prof.getId());
    dto.setCedula(prof.getCedula());
    dto.setNombre(prof.getNombre());
    dto.setTitulo(prof.getTitulo());
    dto.setArea(prof.getArea());
    dto.setTelefono(prof.getTelefono());
    return dto;
  }
  public static void Update(Profesor prof, ProfesorDTO dto) {
    try {
      prof.setId(dto.getId());
      prof.setCedula(dto.getCedula());
      prof.setNombre(dto.getNombre());
      prof.setTitulo(dto.getTitulo());
      prof.setArea(dto.getArea());
      prof.setTelefono(dto.getTelefono());
    } catch (Exception e) {
    }
  }
}