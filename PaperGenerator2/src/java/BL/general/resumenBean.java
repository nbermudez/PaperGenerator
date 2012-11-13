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
@ManagedBean(name = "resumen")
@RequestScoped
public class resumenBean {

    private Paper paper;
    private String autoresString;
    private String palabrasClaveString;

    public String getPalabrasClaveString() {
        return palabrasClaveString;
    }

    public void setPalabrasClaveString(String palabrasClaveString) {
        this.palabrasClaveString = palabrasClaveString;
    }

    public String getAutoresString() {
        return autoresString;
    }

    public void setAutoresString(String autoresString) {
        this.autoresString = autoresString;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void setPaper(String titulo) {
        this.paper = AppSingleton.getInstance().getPaper(titulo);
    }

    public resumenBean() {
        FacesContext context = FacesContext.getCurrentInstance();
        Map<String, String> paramMap = context.getExternalContext().getRequestParameterMap();
        String doc = paramMap.get("doc");
        paper = AppSingleton.getInstance().getPaper(Integer.parseInt(doc));
        //AppSingleton.getInstance().addMessage(paper.getResumen());
        autoresString = "";
        for (String s : paper.getAutores()) {
            autoresString += s + ", ";
        }
        if (autoresString.length() > 1) {
            autoresString = autoresString.substring(0, autoresString.length() - 2) + ".";
        }

        palabrasClaveString = "";
        for (String s : paper.getFrases_clave()) {
            palabrasClaveString += s + ", ";
        }
        if (palabrasClaveString.length() > 1) {
            palabrasClaveString = palabrasClaveString.substring(0, palabrasClaveString.length() - 2) + ".";
        }
    }
}
