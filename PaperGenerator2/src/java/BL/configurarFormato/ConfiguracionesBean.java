/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.configurarFormato;

import java.util.ArrayList;
import java.util.List;
import javax.faces.model.SelectItem;
import org.primefaces.component.selectonelistbox.SelectOneListbox;

/**
 *
 * @author alejandro
 */
public class ConfiguracionesBean {

    /**
     * Las posibles secciones que formarán el paper
     */
    public enum Secciones {

        Título, Resumen, PalabrasClave, Introducción,
        Autores, Metodología, Resultados, Conclusiones, Agradecimiento,
        Referencias, Anexo, RevisionLiteraria, TablasC2, TablasC1, SubtituloN1, SubtituloN2,
        SubtituloN3, Imagenes, General
    }
    
    //<editor-fold defaultstate="collapsed" desc="Renders">
    private boolean render_min_palabras;
    private boolean render_max_palabras;
    private boolean render_columnas_seccion;
    private boolean render_opcional;
    private boolean render_cant_minima;
    private boolean render_cant_maxima;
    private boolean render_enumerable;
    private boolean render_norma;
    private boolean render_minimo_autores;
    private boolean render_maximo_autores;
    private boolean render_en_mayusculas;
    private boolean render_min_palabras_enumerable;
    private boolean render_max_palabras_enumerable;
    private boolean render_auto_ordenable;
    private boolean render_sangria_francesa;
    private boolean render_seccion_actual;

    public boolean isRender_en_mayusculas() {
        return render_en_mayusculas;
    }

    public void setRender_en_mayusculas(boolean render_en_mayusculas) {
        this.render_en_mayusculas = render_en_mayusculas;
    }

    public boolean isRender_min_palabras_enumerable() {
        return render_min_palabras_enumerable;
    }

    public void setRender_min_palabras_enumerable(boolean render_min_palabras_enumerable) {
        this.render_min_palabras_enumerable = render_min_palabras_enumerable;
    }

    public boolean isRender_max_palabras_enumerable() {
        return render_max_palabras_enumerable;
    }

    public void setRender_max_palabras_enumerable(boolean render_max_palabras_enumerable) {
        this.render_max_palabras_enumerable = render_max_palabras_enumerable;
    }

    public boolean isRender_auto_ordenable() {
        return render_auto_ordenable;
    }

    public void setRender_auto_ordenable(boolean render_auto_ordenable) {
        this.render_auto_ordenable = render_auto_ordenable;
    }

    public boolean isRender_seccion_actual() {
        return render_seccion_actual;
    }

    public void setRender_seccion_actual(boolean render_seccion_actual) {
        this.render_seccion_actual = render_seccion_actual;
    }

    public boolean isRender_sangria_francesa() {
        return render_sangria_francesa;
    }

    public void setRender_sangria_francesa(boolean render_sangria_francesa) {
        this.render_sangria_francesa = render_sangria_francesa;
    }

    public boolean isRender_min_palabras() {
        return render_min_palabras;
    }

    public void setRender_min_palabras(boolean render_min_palabras) {
        this.render_min_palabras = render_min_palabras;
    }

    public boolean isRender_max_palabras() {
        return render_max_palabras;
    }

    public void setRender_max_palabras(boolean render_max_palabras) {
        this.render_max_palabras = render_max_palabras;
    }

    public boolean isRender_columnas_seccion() {
        return render_columnas_seccion;
    }

    public void setRender_columnas_seccion(boolean render_columnas_seccion) {
        this.render_columnas_seccion = render_columnas_seccion;
    }

    public boolean isRender_opcional() {
        return render_opcional;
    }

    public void setRender_opcional(boolean render_opcional) {
        this.render_opcional = render_opcional;
    }

    public boolean isRender_cant_minima() {
        return render_cant_minima;
    }

    public void setRender_cant_minima(boolean render_cant_minima) {
        this.render_cant_minima = render_cant_minima;
    }

    public boolean isRender_cant_maxima() {
        return render_cant_maxima;
    }

    public void setRender_cant_maxima(boolean render_cant_maxima) {
        this.render_cant_maxima = render_cant_maxima;
    }

    public boolean isRender_enumerable() {
        return render_enumerable;
    }

    public void setRender_enumerable(boolean render_enumerable) {
        this.render_enumerable = render_enumerable;
    }

    public boolean isRender_norma() {
        return render_norma;
    }

    public void setRender_norma(boolean render_norma) {
        this.render_norma = render_norma;
    }

    public boolean isRender_minimo_autores() {
        return render_minimo_autores;
    }

    public void setRender_minimo_autores(boolean render_minimo_autores) {
        this.render_minimo_autores = render_minimo_autores;
    }

    public boolean isRender_maximo_autores() {
        return render_maximo_autores;
    }

    public void setRender_maximo_autores(boolean render_maximo_autores) {
        this.render_maximo_autores = render_maximo_autores;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Valores">
    private int valor_min_palabras;
    private int valor_max_palabras;
    private int valor_columnas_seccion;
    private boolean valor_opcional;
    private int valor_cant_minima;
    private int valor_cant_maxima;
    private boolean valor_enumerable;
    private String valor_norma;
    private int valor_min_autores;
    private int valor_max_autores;
    private boolean valor_indentacion;

    public boolean isValor_indentacion() {
        return valor_indentacion;
    }

    public void setValor_indentacion(boolean valor_indentacion) {
        this.valor_indentacion = valor_indentacion;
    }

    public int getValor_min_palabras() {
        return valor_min_palabras;
    }

    public void setValor_min_palabras(int valor_min_palabras) {
        this.valor_min_palabras = valor_min_palabras;
    }

    public int getValor_max_palabras() {
        return valor_max_palabras;
    }

    public void setValor_max_palabras(int valor_max_palabras) {
        this.valor_max_palabras = valor_max_palabras;
    }

    public int getValor_columnas_seccion() {
        return valor_columnas_seccion;
    }

    public void setValor_columnas_seccion(int valor_columnas_seccion) {
        this.valor_columnas_seccion = valor_columnas_seccion;
    }

    public boolean isValor_opcional() {
        return valor_opcional;
    }

    public void setValor_opcional(boolean valor_opcional) {
        this.valor_opcional = valor_opcional;
    }

    public int getValor_cant_minima() {
        return valor_cant_minima;
    }

    public void setValor_cant_minima(int valor_cant_minima) {
        this.valor_cant_minima = valor_cant_minima;
    }

    public int getValor_cant_maxima() {
        return valor_cant_maxima;
    }

    public void setValor_cant_maxima(int valor_cant_maxima) {
        this.valor_cant_maxima = valor_cant_maxima;
    }

    public boolean isValor_enumerable() {
        return valor_enumerable;
    }

    public void setValor_enumerable(boolean valor_enumerable) {
        this.valor_enumerable = valor_enumerable;
    }

    public String getValor_norma() {
        return valor_norma;
    }

    public void setValor_norma(String valor_norma) {
        this.valor_norma = valor_norma;
    }

    public int getValor_min_autores() {
        return valor_min_autores;
    }

    public void setValor_min_autores(int valor_min_autores) {
        this.valor_min_autores = valor_min_autores;
    }

    public int getValor_max_autores() {
        return valor_max_autores;
    }

    public void setValor_max_autores(int valor_max_autores) {
        this.valor_max_autores = valor_max_autores;
    }
    //</editor-fold> 
    
    //<editor-fold defaultstate="collapsed" desc="Manejo de Requisitos">
    
    public ArrayList<String> getRequisitos() {
        return requisitos;
    }

    public void setRequisitos(ArrayList<String> requisitos) {
        this.requisitos = requisitos;
    }

    public void agregarRequisito() {
        if (!requisito.isEmpty()) {
            if (!this.requisitos.contains(requisito)) {
                this.requisitos.add(requisito);
                this.requisito = "";
            }
        }
    }

    public void quitarRequisito() {
        if (!requisito_eliminar.isEmpty()) {
            if (this.requisitos.contains(requisito_eliminar)) {
                this.requisitos.remove(requisito_eliminar);
            }
        }
    }
    
    private String requisito;
    private String requisito_eliminar;

    public String getRequisito_eliminar() {
        return requisito_eliminar;
    }

    public void setRequisito_eliminar(String requisito_eliminar) {
        this.requisito_eliminar = requisito_eliminar;
    }

    public String getRequisito() {
        return requisito;
    }

    public void setRequisito(String requisito) {
        this.requisito = requisito;
    }

    //</editor-fold>
    
    private Secciones config_seleccionada;

    public Secciones getConfig_seleccionada() {
        return config_seleccionada;
    }

    public void setConfig_seleccionada(Secciones config_seleccionada) {
        this.config_seleccionada = config_seleccionada;
        if (config_seleccionada == Secciones.Agradecimiento || config_seleccionada == Secciones.Anexo
                || config_seleccionada == Secciones.Autores || config_seleccionada == Secciones.Conclusiones
                || config_seleccionada == Secciones.Introducción || config_seleccionada == Secciones.Metodología
                || config_seleccionada == Secciones.Título || config_seleccionada == Secciones.Resumen
                || config_seleccionada == Secciones.Imagenes || config_seleccionada == Secciones.General) {
            this.setCurrentSeccion(config_seleccionada.toString());
        }
        if (config_seleccionada == Secciones.PalabrasClave) {
            this.setCurrentSeccion("Palabras Clave");
        }
        if (config_seleccionada == Secciones.Referencias) {
            this.setCurrentSeccion("Referencias Bibliográficas");
        }
        if (config_seleccionada == Secciones.Resultados) {
            this.setCurrentSeccion("Resultados y Análisis");
        }
        if (config_seleccionada == Secciones.RevisionLiteraria) {
            this.setCurrentSeccion("Revisión Literaria");
        }
        if (config_seleccionada == Secciones.TablasC1) {
            this.setCurrentSeccion("Tablas a 1 columna");
        }
        if (config_seleccionada == Secciones.TablasC2) {
            this.setCurrentSeccion("Tablas a 2 columnas");
        }
        if (config_seleccionada == Secciones.SubtituloN1) {
            this.setCurrentSeccion("Subtítulo de Nivel 1");
        }
        if (config_seleccionada == Secciones.SubtituloN2) {
            this.setCurrentSeccion("Subtítulo de Nivel 2");
        }
        if (config_seleccionada == Secciones.SubtituloN3) {
            this.setCurrentSeccion("Subtítulo de Nivel 3");
        }
        this.setRender_seccion_actual(true);
    }
    private String currentSeccion;

    public String getCurrentSeccion() {
        return currentSeccion;
    }

    public void setCurrentSeccion(String currentSeccion) {
        this.currentSeccion = currentSeccion;
    }
    private ArrayList<String> requisitos = new ArrayList<String>();

    private void cargarConfiguracionPrevia() {
        ConfiguracionFormatoHelper configHelper = new ConfiguracionFormatoHelper();
        switch(this.config_seleccionada){
            case Agradecimiento:
                break;
            case Anexo:
                break;
            case Autores:
                break;
            case Conclusiones:
                break;
            case General:
                break;
            case Imagenes:
                break;
            case Introducción:
                break;
            case Metodología:
                break;
            case PalabrasClave:
                break;
            case Referencias:
                break;
            case Resultados:
                break;
            case Resumen:
                break;
            case RevisionLiteraria:
                break;
            case SubtituloN1:
                break;
            case SubtituloN2:
                break;
            case SubtituloN3:
                break;
            case TablasC1:
                break;
            case TablasC2:
                break;
            case Título:
                break;
        }
    }

    public ConfiguracionesBean() {
        requisitos.add("Se definió la metodologia");
        requisitos.add("Se cubrieron los objetivos planteados");
        this.config_seleccionada = Secciones.General;
        cargarConfiguracionPrevia();
    }
}
