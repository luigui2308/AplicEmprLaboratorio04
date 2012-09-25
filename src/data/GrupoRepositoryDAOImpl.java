package data;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import domain.GrupoRepository;
import util.GrupoDTO;
import util.GrupoAssembler;
import domain.Grupo;

public class GrupoRepositoryDAOImpl implements GrupoRepository {
 private GrupoDAO grupoDAO;
 GrupoRepositoryDAOImpl(GrupoDAO grupoDAO) {
   this.grupoDAO = grupoDAO;
 }
 public boolean insertGrupo(Grupo grupo) {
   GrupoDTO grupoDTO = GrupoAssembler.CreateDTO(grupo);
   return (grupoDAO.insert(grupoDTO));
 }
 public boolean deleteGrupo(Grupo grupo) {
   GrupoDTO grupoDTO = GrupoAssembler.CreateDTO(grupo);
   return (grupoDAO.delete(grupoDTO));
 }
 public Grupo findGrupo(int id) {
   GrupoDTO grupoDTO = grupoDAO.findById(id);
   if (grupoDTO!=null) {
     Grupo grupo = new Grupo();
     //System.out.println(grupoDTO.getNombre());
     GrupoAssembler.Update(grupo,grupoDTO);
     return grupo;
   }
   return null;
 }
 public boolean updateGrupo(Grupo grupo) {
   GrupoDTO grupoDTO = GrupoAssembler.CreateDTO(grupo);
   return (grupoDAO.update(grupoDTO));
 }
 public Collection findAllGrupo() {
   Collection gruposDTO = grupoDAO.findAll();
   List grupoList = new ArrayList();
   Iterator itr = gruposDTO.iterator();
   while (itr.hasNext()) {
     Grupo grupo = new Grupo();
     GrupoDTO grupoDTO = (GrupoDTO)itr.next();
     GrupoAssembler.Update(grupo,grupoDTO);
     grupoList.add(grupo);
   }
   return grupoList;
 }
 public Collection findGrupoByProfesorId(int id) {
   Collection gruposDTO = grupoDAO.findGrupoByProfesorId();
   List grupoList = new ArrayList();
   Iterator itr = gruposDTO.iterator();
   while (itr.hasNext()) {
     Grupo grupo = new Grupo();
     GrupoDTO grupoDTO = (GrupoDTO)itr.next();
     GrupoAssembler.Update(grupo,grupoDTO);
	 if (id == grupo.getProfesorId())
	 {
		grupoList.add(grupo);
	 }
   }
   return grupoList;
 }
}