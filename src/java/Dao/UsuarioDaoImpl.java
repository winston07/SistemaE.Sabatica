/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;

import Factory.ConnectionDB;
import Factory.FactoryConnectionDB;
import java.sql.ResultSet;
import model.Usuario;

/**
 *
 * @author SAMUEL
 */
public class UsuarioDaoImpl implements UsuarioDao{

    ConnectionDB conn;
    ResultSet rs=null;
    public UsuarioDaoImpl() {
    }
    @Override
    public ResultSet ValidaUser(String user, String pwd) {
    this.conn=FactoryConnectionDB.open(FactoryConnectionDB.ORACLE);
    StringBuilder sql= new StringBuilder();
    sql.append("select u.id_usuario,p.per_nombres,p.per_apell_pat,p.per_apell_mat from usuario u, persona p where p.id_persona=u.id_persona and u.usuario='").append(user);
    sql.append("' and u.password='").append(pwd).append("'");
    rs=conn.query(sql.toString());
    return this.rs;
 }

    @Override
    public boolean edit(Usuario usuario) {
    this.conn= FactoryConnectionDB.open(FactoryConnectionDB.ORACLE);
    boolean save= false;
                try {
            StringBuilder sql=new StringBuilder();  
            sql.append("UPDATE USUARIO SET usuario= '").append(usuario.getUsuario());
            sql.append("',password= '").append(usuario.getPassword());
            sql.append("',id_persona= '").append(usuario.getId_persona()).append("' where id_usuario= '").append(usuario.getId_usuario()).append("'");
            this.conn.execute(sql.toString());
            save=true;
            } catch (Exception e) {
        }finally{
        this.conn.close();
        }
        return save;        
    }

    @Override
    public boolean save(Usuario usuario) {
    this.conn= FactoryConnectionDB.open(FactoryConnectionDB.ORACLE);
        boolean save=false;
        try {
         
             StringBuilder sql=new StringBuilder();
             sql.append("INSERT INTO USUARIO (ID_USUARIO,USUARIO,PASSWORD,ID_PERSONA) VALUES('").append( usuario.getId_usuario());
             sql.append("', '").append(usuario.getUsuario());
             sql.append("', '").append(usuario.getPassword());
             sql.append("', '").append(usuario.getId_persona()).append("')");
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 }
