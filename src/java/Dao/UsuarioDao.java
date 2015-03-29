/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Dao;
import java.sql.ResultSet;
import model.Usuario;

/**
 *
 * @author SAMUEL
 */
public interface UsuarioDao {
public ResultSet ValidaUser(String user,String pwd);
public boolean edit(Usuario usuario);
public boolean save(Usuario usuario);
public boolean delete(String id);   
}
