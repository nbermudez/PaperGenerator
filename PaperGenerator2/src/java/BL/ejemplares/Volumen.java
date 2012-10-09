/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.ejemplares;

import java.util.ArrayList;

/**
 *
 * @author alejandro
 */
public class Volumen {
    private String nombre;
    private ArrayList<Numero> numeros;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Numero> getNumeros() {
        return numeros;
    }

    public void setNumeros(ArrayList<Numero> numeros) {
        this.numeros = numeros;
    }
    
    public void agregarNumero(Numero n){
        this.numeros.add(n);
    }

    public Volumen() {
        this.numeros = new ArrayList<Numero>();
    }
    
    
    
}
