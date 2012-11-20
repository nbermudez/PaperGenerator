/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.login;

import BL.general.AppSingleton;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author alejandro
 */
@ManagedBean(name="registrar")
@SessionScoped
public class registrarseBean {
    
    Helperclass helper;
    private String nombre;
    private String apellidos;
    private String correo;
    private String pw1;
    private String pw2;
    private boolean terminos;
    public void registrarse(){
       // AppSingleton.getInstance().addMessage("Registrandose...");
        helper = new Helperclass();
        
        if (helper.getUser(getCorreo()) == null)
                {
        helper.registrar(getNombre(), getApellidos(), getCorreo(), getPw1(), getPw2(), isTerminos());
      //  tableController.redirect();
                }
        else
        {
            AppSingleton.getInstance().addMessage("Correo ya está en uso.");
          //  tableController.redirect();
        }
        
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @param apellidos the apellidos to set
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    /**
     * @return the pw1
     */
    public String getPw1() {
        return pw1;
    }

    /**
     * @param pw1 the pw1 to set
     */
    public void setPw1(String pw1) {
        this.pw1 = pw1;
    }

    /**
     * @return the pw2
     */
    public String getPw2() {
        return pw2;
    }

    /**
     * @param pw2 the pw2 to set
     */
    public void setPw2(String pw2) {
        this.pw2 = pw2;
    }

    /**
     * @return the terminos
     */
    public boolean isTerminos() {
        return terminos;
    }

    /**
     * @param terminos the terminos to set
     */
    public void setTerminos(boolean terminos) {
        this.terminos = terminos;
    }
    
    
}
