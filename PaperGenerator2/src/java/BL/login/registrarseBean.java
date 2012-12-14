/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.login;

import BL.general.AppSingleton;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import tablas.UsuariosNoAprobados;

/**
 *
 * @author alejandro
 */
@ManagedBean(name="registrar")
@SessionScoped
public class registrarseBean {
    
    Helperclass helper = new Helperclass();
    private String nombre;
    private String apellidos;
    private String correo;
    private String pw1;
    private String pw2;
    private boolean terminos;
    private String correonoap;
    public void registrarse(){
       // AppSingleton.getInstance().addMessage("Registrandose...");
        
        
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
    public ArrayList<String> getUsersNoAprobados(){
        ArrayList<String> lol = new ArrayList<String>();
        if(helper.getUsuariosNoAprobados()!=null){
        ArrayList<UsuariosNoAprobados> temp = helper.getUsuariosNoAprobados();
        for(int i=0;i<temp.size();i++){
            lol.add(temp.get(i).getCorreo());
        }
        return lol;
        }
        else{
            lol.add("");
            return lol;
        }
      /*  lol.add("lol");
        lol.add("lol2");
        lol.add("lol3");
        lol.add("lol4");*/
        
        
    }
    
    public void aprobar(){
        helper.Aprobar(this.correonoap);
         
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

    /**
     * @return the correonoap
     */
    public String getCorreonoap() {
        return correonoap;
    }

    /**
     * @param correonoap the correonoap to set
     */
    public void setCorreonoap(String correonoap) {
        this.correonoap = correonoap;
    }
    
    
}
