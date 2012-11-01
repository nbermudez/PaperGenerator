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

/**
 *
 * @author Alejandro
 */
@ManagedBean(name="resumen")
@RequestScoped
public class resumenBean {
    private Paper paper;

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }
    
    public void setPaper(String titulo){
        this.paper = AppSingleton.getInstance().getPaper(titulo);
    }
    
    public resumenBean(){
        FacesContext context = FacesContext.getCurrentInstance();
        Map<String, String> paramMap = context.getExternalContext().getRequestParameterMap();
        String doc = paramMap.get("doc");
        paper = AppSingleton.getInstance().getPaper(Integer.parseInt(doc));
        //AppSingleton.getInstance().addMessage(paper.getResumen());
    }
}
