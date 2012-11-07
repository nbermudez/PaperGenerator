/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.general;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alejandro
 */
public class Paper implements Serializable{
    private String titulo;
    
    private String resumen;
    
    private int idPaper;
    
    private List<String> autores;
    
    private String resumen_eng;

    public String getResumen_eng() {
        return resumen_eng;
    }

    public void setResumen_eng(String resumen_eng) {
        this.resumen_eng = resumen_eng;
    }    

    public List<String> getAutores() {
        return autores;
    }

    public void setAutores(List<String> autores) {
        this.autores = autores;
    }   

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
        this.resumen_eng = AppSingleton.getInstance().getResumen_Eng(titulo);
        this.idPaper = AppSingleton.getInstance().getIdFromTitulo(titulo);
        this.autores = AppSingleton.getInstance().getAutores(idPaper);
    }
}
