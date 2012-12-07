/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.login;

import BL.general.AppSingleton;
import java.io.IOException;
import java.util.List;
import javax.faces.application.ConfigurableNavigationHandler;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import tablas.Permisos;
import tablas.Usuarios;

/**
 *
 * @author edraza
 */
@ManagedBean(name = "user")
@SessionScoped
public class tableController {

    DataModel losusers;
    Helperclass helper;
    private int recordCount = 1000;
    private int pageSize = 10;
    private Usuarios current;
    private int selectedItemIndex;
    
    private List<Permisos> permisos;

    public tableController() {

        helper = new Helperclass();
        fallo = false;
        logged = false;

    }

    public Usuarios getSelected() {
        if (current == null) {
            current = new Usuarios();
            selectedItemIndex = -1;
        }
        return current;
    }

    public DataModel getUsuarios() {

        if (losusers == null) {
            losusers = new ListDataModel(helper.getUsuarios());
        }
        return losusers;
    }

    private void recreateModel() {
        losusers = null;
    }//

    public String prepareView() {
        current = (Usuarios) getUsuarios().getRowData();
        return "browse";
    }
    private String user, pass;

    public void setUser(String u) {
        user = u;
    }

    public void setPass(String p) {
        pass = p;
    }

    public String getUser() {
        return user;
    }

    public String getPass() {
        return pass;
    }

    public String getNombre() {
        return name;
    }
    String name;
    boolean logged;

    public boolean isFallo() {
        return fallo;
    }

    public void setFallo(boolean fallo) {
        this.fallo = fallo;
    }
    boolean fallo;

    public void validar() {
        Usuarios usuario = helper.getUser(user);
        if (usuario != null) {
            if (usuario.getPassword().equals(pass)) {
                if (helper.isAprobado(usuario.getCorreo())) {
                    name = "Bienvenido, " + usuario.getNombres() + " " + usuario.getApellidos();
                    permisos = AppSingleton.getInstance().getPermisos(usuario.getCorreo());
                    logged = true;
                    fallo = false;
                    AppSingleton.getInstance().addMessage(name);
                }else{
                    AppSingleton.getInstance().addMessage("Su correo aun no ha sido aprobado por el administrador");
                }
            } else {
                fallo = true;
                AppSingleton.getInstance().addMessage("Contraseña incorrecta");
            }
        } else {
            fallo = true;
            AppSingleton.getInstance().addMessage("Este correo no está registrado en el sistema");
        }
        this.redirect();
    }

    public boolean isLogged() throws IOException {

        return logged;


    }

    
    public static void redirect() {
        FacesContext fc = FacesContext.getCurrentInstance();
        ConfigurableNavigationHandler nav = (ConfigurableNavigationHandler) fc.getApplication().getNavigationHandler();

        //if(logged)
        //	nav.performNavigation("main");
        //else
        nav.performNavigation("main");

    }

    public void logout() {
        logged = false;
        this.user = "";
        //name="";
        redirect();
        //return 0;

    }
}