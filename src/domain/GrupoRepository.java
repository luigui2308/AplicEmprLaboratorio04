package domain;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public interface GrupoRepository {
  public boolean insertGrupo(Grupo grupo);
  public boolean deleteGrupo(Grupo grupo);
  public Grupo findGrupo(int id);
  public boolean updateGrupo(Grupo grupo);
  public Collection findAllGrupo();
  public Collection findGrupoByProfesorId(int id);
}