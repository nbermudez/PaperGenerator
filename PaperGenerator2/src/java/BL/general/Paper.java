/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.general;

import java.util.ArrayList;

/**
 *
 * @author alejandro
 */
public class Paper{
    private String titulo;
    
    private String resumen;
    
    private int idPaper;

    public int getIdPaper() {
        return idPaper;
    }

    public void setIdPaper(int idPaper) {
        this.idPaper = idPaper;
    }    

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }    
    
    private ArrayList<String> frases_clave = new ArrayList<String>();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<String> getFrases_clave() {
        return frases_clave;
    }

    public void setFrases_clave(ArrayList<String> frases_clave) {
        this.frases_clave = frases_clave;
    }
    
    public Paper(){        
    }
    
    public Paper(String titulo){        
        this.titulo = titulo;
        this.frases_clave = AppSingleton.getInstance().getFrasesClave(titulo);
        this.resumen = AppSingleton.getInstance().getResumen(titulo);
        this.idPaper = AppSingleton.getInstance().getIdFromTitulo(titulo);
    }
}
