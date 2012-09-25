package data;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import domain.ProfesorRepository;
import util.ProfesorDTO;
import util.ProfesorAssembler;
import domain.Profesor;

public class ProfesorRepositoryDAOImpl implements ProfesorRepository {
 private ProfesorDAO profDAO;
 ProfesorRepositoryDAOImpl(ProfesorDAO profDAO) {
   this.profDAO = profDAO;
 }
 public boolean insertProfesor(Profesor prof) {
   ProfesorDTO profDTO = ProfesorAssembler.CreateDTO(prof);
   return (profDAO.insert(profDTO));
 }
 public boolean deleteProfesor(Profesor prof) {
   ProfesorDTO profDTO = ProfesorAssembler.CreateDTO(prof);
   return (profDAO.delete(profDTO));
 }
 public Profesor findProfesor(int id) {
   ProfesorDTO profDTO = profDAO.findById(id);
   if (profDTO!=null) {
     Profesor prof = new Profesor();
     System.out.println(profDTO.getNombre());
     ProfesorAssembler.Update(prof,profDTO);
     return prof;
   }
   return null;
 }
 public boolean updateProfesor(Profesor prof) {
   ProfesorDTO profDTO = ProfesorAssembler.CreateDTO(prof);
   return (profDAO.update(profDTO));
 }
 public Collection findAllProfesor() {
   Collection profsDTO = profDAO.findAll();
   List profList = new ArrayList();
   Iterator itr = profsDTO.iterator();
   while (itr.hasNext()) {
     Profesor prof = new Profesor();
     ProfesorDTO profDTO = (ProfesorDTO)itr.next();
     ProfesorAssembler.Update(prof,profDTO);
     profList.add(prof);
   }
   return profList;
 }
}