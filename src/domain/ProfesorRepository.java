package domain;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;

public interface ProfesorRepository {
  public boolean insertProfesor(Profesor prof);
  public boolean deleteProfesor(Profesor prof);
  public Profesor findProfesor(int id);
  public boolean updateProfesor(Profesor prof);
  public Collection findAllProfesor();
}