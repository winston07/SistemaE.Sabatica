/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import Dao.PersonaDao;
import Dao.PersonaDaoImpl;
import java.sql.Date;
import java.util.List;
import model.Persona;

public class Test {
    public static void main(String[] args){
    Test test=new Test();
    //test.listOracle();
    //
      test.deleteOracle();
      test.listOracle();
    }
    
    public void listOracle(){
    PersonaDao grupo_pequeDao=new PersonaDaoImpl();
    List<Persona> list=grupo_pequeDao.list2();
        for (Persona grupo_peque : list) {
            System.out.println("---Con Oracle");
            System.out.println("Id: "+grupo_peque.getId_persona()+"Nombre: "+grupo_peque.getPer_nombres()+"Apellido Paterno: "+grupo_peque.getPer_apell_pat()+"Apellido Materno: "+grupo_peque.getPer_apell_mat()+"Dni: "+grupo_peque.getPer_dni()+"Direccion: "+grupo_peque.getPer_direccion()+"Cumple: "+grupo_peque.getPer_cumple()+"Telefono: "+grupo_peque.getPer_telefono()+"Correo: "+grupo_peque.getPer_correo());
                       
        }
    }
    public void saveOracle(){
        PersonaDao pd=new PersonaDaoImpl();
        Persona persona=new Persona();
        persona.setId_persona("P007");
        persona.setPer_nombres("Lui");
        persona.setPer_apell_pat("Cast");
        persona.setPer_apell_mat("Taip");
        persona.setPer_dni("47896356");
        persona.setPer_direccion("Vitarte");
        persona.setPer_cumple(Date.valueOf("1996-02-12"));
        persona.setPer_telefono("963528741");
        persona.setPer_correo("lim@homail.com");
        pd.save(persona);
       
}
    

    public void editOracle(){
    
        PersonaDao pd=new PersonaDaoImpl();
        Persona persona=new Persona();
        persona.setPer_nombres("Lucho");
        persona.setPer_apell_pat("Cast");
        persona.setPer_apell_mat("Taip");
        persona.setPer_dni("47896356");
        persona.setPer_direccion("Vitarte");
        persona.setPer_cumple(Date.valueOf("2000-02-12"));
        persona.setPer_telefono("963528741");
        persona.setPer_correo("lim@homail.com");
        persona.setId_persona("P007");
        pd.edit(persona);
        
    }
    public void deleteOracle()
    {
        PersonaDao pd=new PersonaDaoImpl();
        pd.delete("P004");
    }
}
    
    /*public void saveMysql(){
        Grupo_pequeDao grupo_pequeDao=new Grupo_pequeDaoImpl();
        GRUPO_PEQUE grupo_peque = new GRUPO_PEQUE();
        grupo_peque.setId_grupo("GP002");
        grupo_peque.setGrup_nombre("ADRA abs 123");
        grupo_peque.setGrup_lema("dj");
        grupo_peque.setGrup_vers_mem("12");
        grupo_peque.setGrup_canto_tema("dios");
        grupo_pequeDao.save(grupo_peque);
        
}
    
}*/
   
