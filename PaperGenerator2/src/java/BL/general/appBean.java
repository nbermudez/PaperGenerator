/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.general;

import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import tablas.Papers;

/**
 *
 * @author alejandro
 */
@ManagedBean(name="app")
@ApplicationScoped
public class appBean {
    //<editor-fold defaultstate="collapsed" desc="Biografias Related">
    private boolean bioVisible = false;
    private String nombre;
    private String bio;

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }    

    public boolean isBioVisible() {
        return bioVisible;
    }

    public void setBioVisible(boolean bioVisible) {
        this.bioVisible = bioVisible;
    }
    
    public void setBioInfo(String nombre){
        if(nombre.equals("Manuel")){
            this.nombre = "Manuel Zelaya";
            this.bio = "Resize helper is the element used to provide visual feedback during resizing. By default actual\n"+
"element itself is the helper and two options are available to customize the way feedback is provided.\n"+
"Enabling ghost option displays the element itself with a lower opacity, in addition enabling proxy\n"+
"option adds a css class called .ui-resizable-proxy which you can override to customize.";
        }
        this.nombre = nombre;
        if(nombre.equals("Jared")){
        
        }
        if(nombre.equals("Jose")){
        
        }
        if(nombre.equals("Jacobo")){
        
        }
        this.bioVisible = true;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Paper Related">
    public Papers getPaper(String titulo){
        return AppSingleton.getInstance().getPaper(titulo);
    }
    //</editor-fold>
}
