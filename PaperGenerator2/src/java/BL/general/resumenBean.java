/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.general;

import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import tablas.Papers;

/**
 *
 * @author Alejandro
 */
@ManagedBean(name="resumen")
@RequestScoped
public class resumenBean {
    private Papers paper;

    public Papers getPaper() {
        return paper;
    }

    public void setPaper(Papers paper) {
        this.paper = paper;
    }
    
    public void setPaper(String titulo){
        this.paper = AppSingleton.getInstance().getPaper(titulo);
    }
    
    public resumenBean(){
        FacesContext context = FacesContext.getCurrentInstance();
        Map<String, String> paramMap = context.getExternalContext().getRequestParameterMap();
        String doc = paramMap.get("doc");
        paper = AppSingleton.getInstance().getPaper(doc);
    }
}
