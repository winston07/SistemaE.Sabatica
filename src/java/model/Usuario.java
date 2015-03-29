/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author SAMUEL
 */
public class Usuario {
private String id_usuario;
private String usuario;
private String password;
private String id_persona;

    public Usuario() {
        this.id_usuario="";
        this.usuario="";
        this.password="";
        this.id_persona="";
    }

    public Usuario(String id_usuario, String usuario, String password, String id_persona) {
        this.id_usuario = id_usuario;
        this.usuario = usuario;
        this.password = password;
        this.id_persona = id_persona;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }
    
 }
