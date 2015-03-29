
package Dao;

import java.util.List;
import model.Persona;


public interface PersonaDao {
public List<Persona> list();
public List<Persona> list2();
public boolean edit(Persona persona);
public boolean save(Persona persona);
public boolean delete(String id);   
}
