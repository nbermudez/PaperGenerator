/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.login;

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
    public void registrarse(){
        addMessage("Registrandose...");
    }
    
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
