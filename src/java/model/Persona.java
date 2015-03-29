
package model;

import java.sql.Date;


public class Persona {
private String id_persona;
private String per_nombres;	
private String per_apell_pat;
private String per_apell_mat;	
private String per_dni;	
private String per_direccion;	
private Date per_cumple;
private String per_telefono;
private String per_correo; 

    public Persona() {
        this.id_persona="";
        this.per_nombres="";
        this.per_apell_pat="";
        this.per_apell_mat="";
        this.per_dni="";
        this.per_direccion="";
        this.per_cumple=null;
        this.per_telefono="";
        this.per_correo="";
    }

    public Persona(String id_persona, String per_nombres, String per_apell_pat, String per_apell_mat, String per_dni, String per_direccion, Date per_cumple, String per_telefono, String per_correo) {
        this.id_persona = id_persona;
        this.per_nombres = per_nombres;
        this.per_apell_pat = per_apell_pat;
        this.per_apell_mat = per_apell_mat;
        this.per_dni = per_dni;
        this.per_direccion = per_direccion;
        this.per_cumple = per_cumple;
        this.per_telefono = per_telefono;
        this.per_correo = per_correo;
    }

    public String getId_persona() {
        return id_persona;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    public String getPer_nombres() {
        return per_nombres;
    }

    public void setPer_nombres(String per_nombres) {
        this.per_nombres = per_nombres;
    }

    public String getPer_apell_pat() {
        return per_apell_pat;
    }

    public void setPer_apell_pat(String per_apell_pat) {
        this.per_apell_pat = per_apell_pat;
    }

    public String getPer_apell_mat() {
        return per_apell_mat;
    }

    public void setPer_apell_mat(String per_apell_mat) {
        this.per_apell_mat = per_apell_mat;
    }

    public String getPer_dni() {
        return per_dni;
    }

    public void setPer_dni(String per_dni) {
        this.per_dni = per_dni;
    }

    public String getPer_direccion() {
        return per_direccion;
    }

    public void setPer_direccion(String per_direccion) {
        this.per_direccion = per_direccion;
    }

    public Date getPer_cumple() {
        return per_cumple;
    }

    public void setPer_cumple(Date per_cumple) {
        this.per_cumple = per_cumple;
    }

    public String getPer_telefono() {
        return per_telefono;
    }

    public void setPer_telefono(String per_telefono) {
        this.per_telefono = per_telefono;
    }

    public String getPer_correo() {
        return per_correo;
    }

    public void setPer_correo(String per_correo) {
        this.per_correo = per_correo;
    }
  

}
