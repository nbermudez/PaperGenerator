/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.ejemplares;

import BL.general.AppSingleton;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import tablas.Papers;

/**
 *
 * @author alejandro
 */
@ManagedBean(name="ejemplares")
@SessionScoped
public class ejemplaresBean {
    
    private List<Papers> papers;

    public List<Papers> getPapers() {
        return papers;
    }

    public void setPapers(List<Papers> papers) {
        this.papers = papers;
    }
    //----------------------------------------
    

    public ejemplaresBean() {
        this.papers = AppSingleton.getInstance().getPapers();
    }
    
    
}
