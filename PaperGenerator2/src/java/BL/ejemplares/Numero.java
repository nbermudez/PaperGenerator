/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.ejemplares;

import BL.general.AppSingleton;
import java.util.ArrayList;
import java.util.List;
import tablas.Papers;

/**
 *
 * @author alejandro
 */
public class Numero {
    private String nombre;
    private List<Papers> papers;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Papers> getPapers() {
        return papers;
    }

    public void setPapers(List<Papers> papers) {
        this.papers = papers;
    }
    
    public Numero(String nomb){
        this.nombre = nomb;
        if (nomb.equals("Numero 1")){
            this.papers = AppSingleton.getInstance().getPapers();
        }else{
            this.papers = new ArrayList<Papers>();
        }
    }
    
}
