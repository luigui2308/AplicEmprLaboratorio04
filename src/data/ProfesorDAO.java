package data;
import java.util.Collection;
import util.ProfesorDTO;
import util.ProfesorAssembler;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class ProfesorDAO extends HibernateDaoSupport {
 public boolean insert(ProfesorDTO profDTO) {
   getHibernateTemplate().saveOrUpdate(profDTO);
   return true;
 }
 public boolean delete(ProfesorDTO profDTO) {
   getHibernateTemplate().delete(profDTO);
   return true;
 }
 public ProfesorDTO findById(int id) {
   ProfesorDTO prof;
   prof = (ProfesorDTO)getHibernateTemplate().get(ProfesorDTO.class,new Integer(id));
   return prof;
 }
 public boolean update(ProfesorDTO profDTO) {
   getHibernateTemplate().saveOrUpdate(profDTO);
   return true;
 }
 public Collection findAll() {
   return getHibernateTemplate().find("from ProfesorDTO");
 }
}