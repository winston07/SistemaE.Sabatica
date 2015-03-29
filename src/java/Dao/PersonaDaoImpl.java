
package Dao;

import Factory.ConnectionDB;
import Factory.FactoryConnectionDB;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Persona;


public class PersonaDaoImpl implements PersonaDao{

    ConnectionDB conn;

    public PersonaDaoImpl() {
    }
    
    
    @Override
    public List<Persona> list() {
    this.conn=FactoryConnectionDB.open(FactoryConnectionDB.MYSQL);
        StringBuilder sql= new StringBuilder();
        sql.append("select * from persona");
        List<Persona> list=new ArrayList<Persona>();
        try {
            ResultSet rs=this.conn.query(sql.toString());
            while(rs.next()){
            Persona gp=new Persona();
            gp.setId_persona(rs.getString("id_persona"));
            gp.setPer_nombres(rs.getString("per_nombres"));
            gp.setPer_apell_pat(rs.getString("per_apell_pat"));
            gp.setPer_apell_mat(rs.getString("per_apell_mat"));
            gp.setPer_dni(rs.getString("per_dni"));
            gp.setPer_direccion(rs.getString("per_direccion"));
            gp.setPer_cumple(rs.getDate("per_cumple"));
            gp.setPer_telefono(rs.getString("per_telefono"));
            gp.setPer_correo(rs.getString("per_correo"));
            list.add(gp);
            }
        } catch (Exception e) {
        } finally{
         this.conn.close();
        }
       return list;        
    }

    @Override
    public List<Persona> list2() {
        this.conn=FactoryConnectionDB.open(FactoryConnectionDB.ORACLE);
        StringBuilder sql= new StringBuilder();
        sql.append("select * from persona order by id_persona");
        List<Persona> list=new ArrayList<Persona>();
        try {
            ResultSet rs=this.conn.query(sql.toString());
            while(rs.next()){
            Persona gp=new Persona();
            gp.setId_persona(rs.getString("id_persona"));
            gp.setPer_nombres(rs.getString("per_nombres"));
            gp.setPer_apell_pat(rs.getString("per_apell_pat"));
            gp.setPer_apell_mat(rs.getString("per_apell_mat"));
            gp.setPer_dni(rs.getString("per_dni"));
            gp.setPer_direccion(rs.getString("per_direccion"));
            gp.setPer_cumple(rs.getDate("per_cumple"));
            gp.setPer_telefono(rs.getString("per_telefono"));
            gp.setPer_correo(rs.getString("per_correo"));
            list.add(gp);
            }
        } catch (Exception e) {
        } finally{
         this.conn.close();
        }
       return list;        
    }

    @Override
    public boolean edit(Persona persona) {
    this.conn= FactoryConnectionDB.open(FactoryConnectionDB.ORACLE);
    boolean save= false;
                try {
            StringBuilder sql=new StringBuilder();  
            sql.append("UPDATE PERSONA SET per_nombres= '").append(persona.getPer_nombres());
            sql.append("',per_apell_pat= '").append(persona.getPer_apell_pat());
            sql.append("',per_apell_mat= '").append(persona.getPer_apell_mat());
            sql.append("',per_dni= '").append(persona.getPer_dni());
            sql.append("',per_direccion= '").append(persona.getPer_direccion());
            sql.append("',per_cumple= to_date('").append(persona.getPer_cumple());
            sql.append("','yyyy-mm-dd'),per_telefono= '").append(persona.getPer_telefono());
            sql.append("',per_correo= '").append(persona.getPer_correo()).append("' where id_persona= '").append(persona.getId_persona()).append("'");
            this.conn.execute(sql.toString());
            save=true;
            } catch (Exception e) {
        }finally{
        this.conn.close();
        }
        return save;
    }

    @Override
    public boolean save(Persona persona) {
    this.conn= FactoryConnectionDB.open(FactoryConnectionDB.ORACLE);
        boolean save=false;
        try {
         
             StringBuilder sql=new StringBuilder();
             sql.append("INSERT INTO PERSONA (ID_PERSONA,PER_NOMBRES,PER_APELL_PAT,PER_APELL_MAT,PER_DNI,PER_DIRECCION,PER_CUMPLE,PER_TELEFONO,PER_CORREO) VALUES('").append( persona.getId_persona());
             sql.append("', '").append(persona.getPer_nombres());
             sql.append("', '").append(persona.getPer_apell_pat());
             sql.append("', '").append(persona.getPer_apell_mat());
             sql.append("', '").append(persona.getPer_dni());
             sql.append("', '").append(persona.getPer_direccion());
             sql.append("',to_date('").append(persona.getPer_cumple());             
             sql.append("','yyyy-mm-dd'), '").append(persona.getPer_telefono()).append("', '").append(persona.getPer_correo()).append("')");
             this.conn.execute(sql.toString());
             save=true;
                  
        } catch (Exception e) {
        }finally{
        this.conn.close();
        }
    return save;
    }       
    

    @Override
    public boolean delete(String id) {
    this.conn= FactoryConnectionDB.open(FactoryConnectionDB.ORACLE);
    boolean delete=false;
        try {
           StringBuilder sql=new StringBuilder();
           sql.append("DELETE FROM persona WHERE id_persona= '").append(id).append("'");
           this.conn.execute(sql.toString());
        } catch (Exception e) {
        }finally{
        this.conn.close();
        }
    return delete;        
    }
    
}
