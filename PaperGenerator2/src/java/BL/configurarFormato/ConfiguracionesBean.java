/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.configurarFormato;

import BL.general.AppSingleton;
import java.util.ArrayList;
import java.util.List;
import javax.faces.model.SelectItem;
import org.primefaces.component.selectonelistbox.SelectOneListbox;
import tablas.*;


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
    
       
    //<editor-fold defaultstate="collapsed" desc="Primer SubMenu">
    private int min_palabrasAutores;
    private int min_palabrasTitulo;
    private int min_palabrasResumen;
    private int min_palabrasClave;
    private int max_palabrasAutores;
    private int max_palabrasTitulo;
    private int max_palabrasResumen;
    private int max_palabrasClave;
    private int NumColumnasResumen;
    private String FormatoAutores;
    private String FormatoTitulo;
    private String FormatoResumen;
    private String FormatoPalabrasClave;

    public int getMin_palabrasAutores() {
        return min_palabrasAutores;
    }

    public void setMin_palabrasAutores(int min_palabrasAutores) {
        this.min_palabrasAutores = min_palabrasAutores;
    }

    public int getMin_palabrasTitulo() {
        return min_palabrasTitulo;
    }

    public void setMin_palabrasTitulo(int min_palabrasTitulo) {
        this.min_palabrasTitulo = min_palabrasTitulo;
    }

    public int getMin_palabrasResumen() {
        return min_palabrasResumen;
    }

    public void setMin_palabrasResumen(int min_palabrasResumen) {
        this.min_palabrasResumen = min_palabrasResumen;
    }

    public int getMin_palabrasClave() {
        return min_palabrasClave;
    }

    public void setMin_palabrasClave(int min_palabrasClave) {
        this.min_palabrasClave = min_palabrasClave;
    }

    public int getMax_palabrasAutores() {
        return max_palabrasAutores;
    }

    public void setMax_palabrasAutores(int max_palabrasAutores) {
        this.max_palabrasAutores = max_palabrasAutores;
    }

    public int getMax_palabrasTitulo() {
        return max_palabrasTitulo;
    }

    public void setMax_palabrasTitulo(int max_palabrasTitulo) {
        this.max_palabrasTitulo = max_palabrasTitulo;
    }

    public int getMax_palabrasResumen() {
        return max_palabrasResumen;
    }

    public void setMax_palabrasResumen(int max_palabrasResumen) {
        this.max_palabrasResumen = max_palabrasResumen;
    }

    public int getMax_palabrasClave() {
        return max_palabrasClave;
    }

    public void setMax_palabrasClave(int max_palabrasClave) {
        this.max_palabrasClave = max_palabrasClave;
    }

    public int getNumColumnasResumen() {
        return NumColumnasResumen;
    }

    public void setNumColumnasResumen(int NumColumnasResumen) {
        this.NumColumnasResumen = NumColumnasResumen;
    }

    public String getFormatoAutores() {
        return FormatoAutores;
    }

    public void setFormatoAutores(String FormatoAutores) {
        this.FormatoAutores = FormatoAutores;
    }

    public String getFormatoTitulo() {
        return FormatoTitulo;
    }

    public void setFormatoTitulo(String FormatoTitulo) {
        this.FormatoTitulo = FormatoTitulo;
    }

    public String getFormatoResumen() {
        return FormatoResumen;
    }

    public void setFormatoResumen(String FormatoResumen) {
        this.FormatoResumen = FormatoResumen;
    }

    public String getFormatoPalabrasClave() {
        return FormatoPalabrasClave;
    }

    public void setFormatoPalabrasClave(String FormatoPalabrasClave) {
        this.FormatoPalabrasClave = FormatoPalabrasClave;
    }
    
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Introduccion">
    private int min_palabrasIntroduccion;
    private int max_Introduccion;
    private String FormatoIntroducion;
    private int NumColumnasIntroduccion;

    public int getMin_palabrasIntroduccion() {
        return min_palabrasIntroduccion;
    }

    public void setMin_palabrasIntroduccion(int min_palabrasIntroduccion) {
        this.min_palabrasIntroduccion = min_palabrasIntroduccion;
    }

    public int getMax_Introduccion() {
        return max_Introduccion;
    }

    public void setMax_Introduccion(int max_Introduccion) {
        this.max_Introduccion = max_Introduccion;
    }

    public String getFormatoIntroducion() {
        return FormatoIntroducion;
    }

    public void setFormatoIntroducion(String FormatoIntroducion) {
        this.FormatoIntroducion = FormatoIntroducion;
    }

    public int getNumColumnasIntroduccion() {
        return NumColumnasIntroduccion;
    }

    public void setNumColumnasIntroduccion(int NumColumnasIntroduccion) {
        this.NumColumnasIntroduccion = NumColumnasIntroduccion;
    }
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Revision Literaria">
    
    private int min_palabrasRevision;
    private int max_palabrasRevision;
    private String FormatoRevision;
    private int NumColumnasRevision;
    private boolean OpcionalRevision;

    public int getMin_palabrasRevision() {
        return min_palabrasRevision;
    }

    public void setMin_palabrasRevision(int min_palabrasRevision) {
        this.min_palabrasRevision = min_palabrasRevision;
    }

    public int getMax_palabrasRevision() {
        return max_palabrasRevision;
    }

    public void setMax_palabrasRevision(int max_palabrasRevision) {
        this.max_palabrasRevision = max_palabrasRevision;
    }

    public String getFormatoRevision() {
        return FormatoRevision;
    }

    public void setFormatoRevision(String FormatoRevision) {
        this.FormatoRevision = FormatoRevision;
    }

    public int getNumColumnasRevision() {
        return NumColumnasRevision;
    }

    public void setNumColumnasRevision(int NumColumnasRevision) {
        this.NumColumnasRevision = NumColumnasRevision;
    }

    public boolean isOpcionalRevision() {
        return OpcionalRevision;
    }

    public void setOpcionalRevision(boolean OpcionalRevision) {
        this.OpcionalRevision = OpcionalRevision;
    }
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Formato">
    private int min_palabrasFormato;
    private int max_palabrasFormato;
    private String FormatoFormato;
    private int NumColumnasFormato;

    public int getMin_palabrasFormato() {
        return min_palabrasFormato;
    }

    public void setMin_palabrasFormato(int min_palabrasFormato) {
        this.min_palabrasFormato = min_palabrasFormato;
    }

    public int getMax_palabrasFormato() {
        return max_palabrasFormato;
    }

    public void setMax_palabrasFormato(int max_palabrasFormato) {
        this.max_palabrasFormato = max_palabrasFormato;
    }

    public String getFormatoFormato() {
        return FormatoFormato;
    }

    public void setFormatoFormato(String FormatoFormato) {
        this.FormatoFormato = FormatoFormato;
    }

    public int getNumColumnasFormato() {
        return NumColumnasFormato;
    }

    public void setNumColumnasFormato(int NumColumnasFormato) {
        this.NumColumnasFormato = NumColumnasFormato;
    }
    
    //</editor-fold>
        
    //<editor-fold defaultstate="collapsed" desc="Metodologia">
    private int min_palabrasMetodologia;
    private int max_palabrasMetodologia;
    private String FormatoMetodologia;
    private int NumColumnasMetodologia;

    public int getMin_palabrasMetodologia() {
        return min_palabrasMetodologia;
    }

    public void setMin_palabrasMetodologia(int min_palabrasMetodologia) {
        this.min_palabrasMetodologia = min_palabrasMetodologia;
    }

    public int getMax_palabrasMetodologia() {
        return max_palabrasMetodologia;
    }

    public void setMax_palabrasMetodologia(int max_palabrasMetodologia) {
        this.max_palabrasMetodologia = max_palabrasMetodologia;
    }

    public String getFormatoMetodologia() {
        return FormatoMetodologia;
    }

    public void setFormatoMetodologia(String FormatoMetodologia) {
        this.FormatoMetodologia = FormatoMetodologia;
    }

    public int getNumColumnasMetodologia() {
        return NumColumnasMetodologia;
    }

    public void setNumColumnasMetodologia(int NumColumnasMetodologia) {
        this.NumColumnasMetodologia = NumColumnasMetodologia;
    }
    
    //</editor-fold>
   
    //<editor-fold defaultstate="collapsed" desc="Conclusiones">
    private int min_palabrasConclusiones;
    private int max_palabrasConclusiones;
    private String FormatoConclusiones;
    private int NumColumnasConclusiones;
    private boolean EnumerableConclusiones;
    
    

    public int getMin_palabrasConclusiones() {
        return min_palabrasConclusiones;
    }

    public void setMin_palabrasConclusiones(int min_palabrasConclusiones) {
        this.min_palabrasConclusiones = min_palabrasConclusiones;
    }

    public int getMax_palabrasConclusiones() {
        return max_palabrasConclusiones;
    }

    public void setMax_palabrasConclusiones(int max_palabrasConclusiones) {
        this.max_palabrasConclusiones = max_palabrasConclusiones;
    }

    public String getFormatoConclusiones() {
        return FormatoConclusiones;
    }

    public void setFormatoConclusiones(String FormatoConclusiones) {
        this.FormatoConclusiones = FormatoConclusiones;
    }

    public int getNumColumnasConclusiones() {
        return NumColumnasConclusiones;
    }

    public void setNumColumnasConclusiones(int NumColumnasConclusiones) {
        this.NumColumnasConclusiones = NumColumnasConclusiones;
    }

    public boolean isEnumerableConclusiones() {
        return EnumerableConclusiones;
    }

    public void setEnumerableConclusiones(boolean EnumerableConclusiones) {
        this.EnumerableConclusiones = EnumerableConclusiones;
    }

    //</editor-fold>
         
    //<editor-fold defaultstate="collapsed" desc="Agradecimiento">
    private int min_palabrasAgradecimiento;
    private int max_palabrasAgradecimiento;
    private String FormatoAgradecimiento;
    private int NumColumnasAgradecimiento;
    private boolean OpcionalAgradecimiento;

    public int getMin_palabrasAgradecimiento() {
        return min_palabrasAgradecimiento;
    }

    public void setMin_palabrasAgradecimiento(int min_palabrasAgradecimiento) {
        this.min_palabrasAgradecimiento = min_palabrasAgradecimiento;
    }

    public int getMax_palabrasAgradecimiento() {
        return max_palabrasAgradecimiento;
    }

    public void setMax_palabrasAgradecimiento(int max_palabrasAgradecimiento) {
        this.max_palabrasAgradecimiento = max_palabrasAgradecimiento;
    }

    public String getFormatoAgradecimiento() {
        return FormatoAgradecimiento;
    }

    public void setFormatoAgradecimiento(String FormatoAgradecimiento) {
        this.FormatoAgradecimiento = FormatoAgradecimiento;
    }

    public int getNumColumnasAgradecimiento() {
        return NumColumnasAgradecimiento;
    }

    public void setNumColumnasAgradecimiento(int NumColumnasAgradecimiento) {
        this.NumColumnasAgradecimiento = NumColumnasAgradecimiento;
    }

    public boolean isOpcionalAgradecimiento() {
        return OpcionalAgradecimiento;
    }

    public void setOpcionalAgradecimiento(boolean OpcionalAgradecimiento) {
        this.OpcionalAgradecimiento = OpcionalAgradecimiento;
    }
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Anexos">
    private int min_palabrasAnexo;
    private int max_palabrasAnexo;
    private String FormatoAnexo;
    private int NumColumnasAnexo;
    private boolean OpcionalAnexo;

    public int getMin_palabrasAnexo() {
        return min_palabrasAnexo;
    }

    public void setMin_palabrasAnexo(int min_palabrasAnexo) {
        this.min_palabrasAnexo = min_palabrasAnexo;
    }

    public int getMax_palabrasAnexo() {
        return max_palabrasAnexo;
    }

    public void setMax_palabrasAnexo(int max_palabrasAnexo) {
        this.max_palabrasAnexo = max_palabrasAnexo;
    }

    public String getFormatoAnexo() {
        return FormatoAnexo;
    }

    public void setFormatoAnexo(String FormatoAnexo) {
        this.FormatoAnexo = FormatoAnexo;
    }

    public int getNumColumnasAnexo() {
        return NumColumnasAnexo;
    }

    public void setNumColumnasAnexo(int NumColumnasAnexo) {
        this.NumColumnasAnexo = NumColumnasAnexo;
    }

    public boolean isOpcionalAnexo() {
        return OpcionalAnexo;
    }

    public void setOpcionalAnexo(boolean OpcionalAnexo) {
        this.OpcionalAnexo = OpcionalAnexo;
    }
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Referencias">
    private String FormatoReferencia;
    private int NumColumnasReferencia;

    public String getFormatoReferencia() {
        return FormatoReferencia;
    }

    public void setFormatoReferencia(String FormatoReferencia) {
        this.FormatoReferencia = FormatoReferencia;
    }

    public int getNumColumnasReferencia() {
        return NumColumnasReferencia;
    }

    public void setNumColumnasReferencia(int NumColumnasReferencia) {
        this.NumColumnasReferencia = NumColumnasReferencia;
    }
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Imagen">
    private String FormatoImagen;

    public String getFormatoImagen() {
        return FormatoImagen;
    }

    public void setFormatoImagen(String FormatoImagen) {
        this.FormatoImagen = FormatoImagen;
    }
    
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Subtitulos">
    private String FormatoSubtitulo1;
    private String FormatoSubtitulo2;
    private String FormatoSubtitulo3;

    public String getFormatoSubtitulo1() {
        return FormatoSubtitulo1;
    }

    public void setFormatoSubtitulo1(String FormatoSubtitulo1) {
        this.FormatoSubtitulo1 = FormatoSubtitulo1;
    }

    public String getFormatoSubtitulo2() {
        return FormatoSubtitulo2;
    }

    public void setFormatoSubtitulo2(String FormatoSubtitulo2) {
        this.FormatoSubtitulo2 = FormatoSubtitulo2;
    }

    public String getFormatoSubtitulo3() {
        return FormatoSubtitulo3;
    }

    public void setFormatoSubtitulo3(String FormatoSubtitulo3) {
        this.FormatoSubtitulo3 = FormatoSubtitulo3;
    }
    
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Tablas">
    private String FormatoTabla1;
    private String FormatoTabla2;
    
    

    public String getFormatoTabla1() {
        return FormatoTabla1;
    }

    public void setFormatoTabla1(String FormatoTabla1) {
        this.FormatoTabla1 = FormatoTabla1;
    }

    public String getFormatoTabla2() {
        return FormatoTabla2;
    }

    public void setFormatoTabla2(String FormatoTabla2) {
        this.FormatoTabla2 = FormatoTabla2;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Variables para los Controles">
    private int min_palabras;
    private int max_palabras;
    private String Formato;
    private int NumColumnas;
    private boolean Opcional;
    private boolean Enumerable;
    
    public int getMin_palabras() {
        return min_palabras;
    }

    public void setMin_palabras(int min_palabras) {
        this.min_palabras = min_palabras;
    }
    
    
    public int getMax_palabras() {
        return max_palabras;
    }

    public void setMax_palabras(int max_palabras) {
        this.max_palabras = max_palabras;
    }

    public String getFormato() {
        return Formato;
    }

    public void setFormato(String Formato) {
        this.Formato = Formato;
    }

    public int getNumColumnas() {
        return NumColumnas;
    }

    public void setNumColumnas(int NumColumnas) {
        this.NumColumnas = NumColumnas;
    }

    public boolean isOpcional() {
        return Opcional;
    }

    public void setOpcional(boolean Opcional) {
        this.Opcional = Opcional;
    }

    public boolean isEnumerable() {
        return Enumerable;
    }

    public void setEnumerable(boolean Enumerable) {
        this.Enumerable = Enumerable;
    }
    
    //</editor-fold>
     
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
                
                            ArrayList<FormatoAgradecimiento> List = AppSingleton.getInstance().Agradecimientos();
                            if(!List.isEmpty())
                            {
                                FormatoAgradecimiento tAgre = List.get(0);
                                FormatoAgradecimiento = tAgre.getMuestra();
                                max_palabrasAgradecimiento = tAgre.getMaximoPalabras();
                                min_palabrasAgradecimiento = tAgre.getMinimoPalabras();
                                NumColumnasAgradecimiento = tAgre.getColumnasSeccion();
                                OpcionalAgradecimiento = tAgre.isOpcional();
                                
                            }
                            
                            
                            ArrayList<FormatoAnexo> ListA = AppSingleton.getInstance().Anexo();
                            if(!ListA.isEmpty())
                            {
                                FormatoAnexo tAgre = ListA.get(0);
                                FormatoAnexo = tAgre.getMuestra();
                                max_palabrasAnexo = tAgre.getMaximoPalabras();
                                min_palabrasAnexo = tAgre.getMinimoPalabras();
                                NumColumnasAnexo = tAgre.getColumnasSeccion();
                                
                                
                            }
                            
                            ArrayList<FormatoConclusiones> ListC = AppSingleton.getInstance().Conclusiones();
                            if(!ListC.isEmpty())
                            {
                                FormatoConclusiones tAgre = ListC.get(0);
                                FormatoConclusiones = tAgre.getMuestra();
                                max_palabrasConclusiones = tAgre.getMaximoPalabrasBloque();
                                min_palabrasConclusiones = tAgre.getMinimoPalabrasBloque();
                                NumColumnasConclusiones = tAgre.getColumnasSeccion();
                                EnumerableConclusiones = tAgre.isEnumerables();
                                
                                
                            }
                            
                            ArrayList<FormatoIntroduccion> ListI = AppSingleton.getInstance().Introduccion();
                            if(!ListI.isEmpty())
                            {
                                FormatoIntroduccion tAgre = ListI.get(0);
                                min_palabrasIntroduccion=tAgre.getMinimoPalabras();
                                max_Introduccion=tAgre.getMaximoPalabras();
                                FormatoIntroducion=tAgre.getMuestra();
                                NumColumnasIntroduccion=tAgre.getColumnasSeccion();

                                
                                
                            }
                            
                            ArrayList<FormatoMetodologia> ListM = AppSingleton.getInstance().Metodologia();
                            if(!ListM.isEmpty())
                            {
                                FormatoMetodologia tAgre = ListM.get(0);
                                min_palabrasMetodologia=tAgre.getMinimoPalabras();
                                max_palabrasMetodologia=tAgre.getMaximoPalabras();
                                FormatoMetodologia=tAgre.getMuestra();
                                NumColumnasMetodologia=tAgre.getColumnasSeccion();

                                
                                
                            }
                            
                            ArrayList<FormatoPalabrasClave> ListPC = AppSingleton.getInstance().PalabrasClave();
                            if(!ListPC.isEmpty())
                            {
                                FormatoPalabrasClave tAgre = ListPC.get(0);
                                FormatoPalabrasClave =tAgre.getMuestra();
                                max_palabrasClave=tAgre.getCantidadMaximo();
                                min_palabrasClave = tAgre.getCantidadMinima();

                                
                                
                            }
                            
                            ArrayList<FormatoReferencias> ListFR = AppSingleton.getInstance().Referencias();
                            if(!ListFR.isEmpty())
                            {
                                FormatoReferencias tAgre = ListFR.get(0);
                                FormatoReferencia = tAgre.getMuestra();
                                NumColumnasReferencia = tAgre.getColumnasSeccion();

                                
                                
                            }
                            
                            ArrayList<FormatoResultados> ListRes = AppSingleton.getInstance().Results();
                            if(!ListRes.isEmpty())
                            {
                                FormatoResultados tAgre = ListRes.get(0);
                                min_palabrasFormato=tAgre.getMinimoPalabras();
                                max_palabrasFormato=tAgre.getMaximoPalabras();
                                FormatoFormato=tAgre.getMuestra();
                                NumColumnasFormato=tAgre.getColumnasSeccion();

                                
                                
                            }
                            
                            ArrayList<FormatoResumen> ListResum = AppSingleton.getInstance().Resumen();
                            if(!ListResum.isEmpty())
                            {
                                FormatoResumen tAgre = ListResum.get(0);
                                min_palabrasResumen=tAgre.getMinimoPalabras();
                                max_palabrasResumen=tAgre.getMaximoPalabras();
                                FormatoResumen=tAgre.getMuestra();
                              

                                
                                
                            }
                            
                             ArrayList<FormatoRevisionLiteratura> ListRev = AppSingleton.getInstance().RevisionLiteraria();
                            if(!ListRev.isEmpty())
                            {
                                FormatoRevisionLiteratura tAgre = ListRev.get(0);
                                min_palabrasRevision=tAgre.getMinimoPalabras();
                                max_palabrasRevision=tAgre.getMaximoPalabras();
                                FormatoRevision=tAgre.getMuestra();
                                NumColumnasRevision = tAgre.getColumnasSeccion();
                                

                                
                                
                            }
                            
                            ArrayList<FormatoTitulo> ListTit = AppSingleton.getInstance().FormatoTitulo();
                            if(!ListTit.isEmpty())
                            {
                                FormatoTitulo tAgre = ListTit.get(0);
                                min_palabrasTitulo =tAgre.getMinimoAutores();
                                max_palabrasTitulo = tAgre.getMaximoAutores();
                                FormatoTitulo = tAgre.getMuestra();

                                
                                
                            }
                            
                            
                
                
                
                
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
    
    
    public void SetearVariablesTemps()
    {
         switch(this.config_seleccionada){
            case Agradecimiento:
                min_palabrasAgradecimiento=min_palabras;
                max_palabrasAgradecimiento=max_palabras;
                FormatoAgradecimiento=Formato;
                NumColumnasAgradecimiento=NumColumnas;
                OpcionalAgradecimiento=Opcional;
                break;
            case Anexo:
                min_palabrasAnexo=min_palabras;
                max_palabrasAnexo=max_palabras;
                FormatoAnexo=Formato;
                NumColumnasAnexo=NumColumnas;
                OpcionalAnexo=Opcional;
                break;
            case Autores:
                 min_palabrasAutores=min_palabras;
                 max_palabrasAutores=max_palabras;
                 FormatoAutores = Formato;
                break;
            case Conclusiones:
                min_palabrasConclusiones=min_palabras;
                max_palabrasConclusiones=max_palabras;
                FormatoConclusiones=Formato;
                NumColumnasConclusiones=NumColumnas;
                EnumerableConclusiones= Enumerable;
                break;
            case General:
                break;
            case Imagenes:
                FormatoImagen = Formato;
                break;
            case Introducción:
                min_palabrasIntroduccion=min_palabras;
                max_Introduccion=max_palabras;
                FormatoIntroducion=Formato;
               NumColumnasIntroduccion=NumColumnas;
                break;
            case Metodología:
                min_palabrasMetodologia=min_palabras;
                max_palabrasMetodologia=max_palabras;
                FormatoMetodologia=Formato;
                NumColumnasMetodologia=NumColumnas;
                break;
            case PalabrasClave:
                min_palabrasClave=min_palabras;
                max_palabrasClave=max_palabras;
                FormatoPalabrasClave=Formato;
                break;
            case Referencias:
                FormatoReferencia=Formato;
                NumColumnasReferencia=NumColumnas;
                break;
            case Resultados:
                min_palabrasFormato=min_palabras;
                max_palabrasFormato=max_palabras;
                FormatoFormato=Formato;
                NumColumnasFormato=NumColumnas;                
                break;
            case Resumen:
                min_palabrasResumen=min_palabras;
                max_palabrasResumen=max_palabras;
                FormatoResumen=Formato;
                NumColumnasResumen=NumColumnas;
                break;
            case RevisionLiteraria:
                min_palabrasRevision=min_palabras;
                max_palabrasRevision=max_palabras;
                FormatoRevision=Formato;
                NumColumnasRevision=NumColumnas;
                OpcionalRevision=Opcional;
                break;
            case SubtituloN1:
                FormatoSubtitulo1=Formato;
                break;
            case SubtituloN2:
                FormatoSubtitulo2=Formato;
                break;
            case SubtituloN3:
                FormatoSubtitulo3=Formato;
                break;
            case TablasC1:
                FormatoTabla1 = Formato;
                break;
            case TablasC2:
                FormatoTabla2 = Formato;
                break;
            case Título:
                min_palabrasTitulo=min_palabras;
                max_palabrasTitulo=max_palabras;
                FormatoTitulo = Formato;
                break;
        }
        
    }
    
    public void CargarVariablesTemps()
    {
         switch(this.config_seleccionada){
            case Agradecimiento:
                min_palabras = min_palabrasAgradecimiento;
                max_palabras=max_palabrasAgradecimiento;
                Formato = FormatoAgradecimiento;
                NumColumnas=NumColumnasAgradecimiento;
                Opcional = OpcionalAgradecimiento;
                break;
            case Anexo:
                min_palabras = min_palabrasAnexo;
                max_palabras=max_palabrasAnexo;
                Formato = FormatoAnexo;
                NumColumnas=NumColumnasAnexo;
                Opcional = OpcionalAnexo;
                break;
            case Autores:
                min_palabras=min_palabrasAutores;
                max_palabras=max_palabrasAutores;
                Formato = FormatoAutores;
                break;
            case Conclusiones:
                min_palabras=min_palabrasConclusiones;
                max_palabras=max_palabrasConclusiones;
                Formato = FormatoConclusiones;
                NumColumnas=NumColumnasConclusiones; 
                Enumerable = EnumerableConclusiones;
                break;
            case General:
                break;
            case Imagenes:
                Formato = FormatoImagen;
                break;
            case Introducción:
                min_palabras = min_palabrasIntroduccion;
                max_palabras=max_Introduccion;
                Formato = FormatoIntroducion;
                NumColumnas=NumColumnasIntroduccion;
                break;
            case Metodología:
                min_palabras=min_palabrasMetodologia;
                max_palabras=max_palabrasMetodologia;
                Formato = FormatoMetodologia;
                NumColumnas=NumColumnasMetodologia; 
                break;
            case PalabrasClave:
                min_palabras=min_palabrasClave;
                max_palabras=max_palabrasClave;
                Formato = FormatoPalabrasClave;
                break;
            case Referencias:
                Formato = FormatoReferencia;
                NumColumnas=NumColumnasReferencia;
                break;
            case Resultados:
                min_palabras=min_palabrasFormato;
                max_palabras=max_palabrasFormato;
                Formato = FormatoFormato;
                NumColumnas=NumColumnasFormato;                
                break;
            case Resumen:
                min_palabras=min_palabrasResumen;
                max_palabras=max_palabrasResumen;
                Formato = FormatoResumen;
                NumColumnas=NumColumnasResumen;
                break;
            case RevisionLiteraria:
                min_palabras = min_palabrasRevision;
                max_palabras=max_palabrasRevision;
                Formato = FormatoRevision;
                NumColumnas=NumColumnasRevision;
                Opcional = OpcionalRevision;
                
                break;
            case SubtituloN1:
                Formato = FormatoSubtitulo1;
                break;
            case SubtituloN2:
                Formato = FormatoSubtitulo2;
                break;
            case SubtituloN3:
                Formato = FormatoSubtitulo3;
                break;
            case TablasC1:
                Formato = FormatoTabla1;
                break;
            case TablasC2:
                Formato = FormatoTabla2;
                break;
            case Título:
                min_palabras=min_palabrasTitulo;
                max_palabras=max_palabrasTitulo;
                Formato = FormatoTitulo;
                break;
        }
        
    }
    

    public ConfiguracionesBean() {
        requisitos.add("Se definió la metodologia");
        requisitos.add("Se cubrieron los objetivos planteados");
        this.config_seleccionada = Secciones.General;
        cargarConfiguracionPrevia();
    }
    
    
    public void SaveValues()
    {
         ConfiguracionFormatoHelper helper = new ConfiguracionFormatoHelper();
         SetearVariablesTemps();
        switch(this.config_seleccionada){
            case Agradecimiento:
                      if(getFormatoAgradecimiento() != null)
                      {
                        helper.InsertFormatAgre(1, getFormatoAgradecimiento(), getMax_palabrasAgradecimiento(), getMin_palabrasAgradecimiento(), getNumColumnasAgradecimiento(), isOpcionalAgradecimiento());
                      }                           
                break;
            case Anexo:
                     if(getFormatoAnexo() != null)
                     {
                         helper.InsertFormatAnexo(1, getFormatoAnexo(), getMax_palabrasAnexo(), getMin_palabrasAnexo(), getNumColumnasAnexo());
                     }
                
                break;
            case Autores:
                break;
            case Conclusiones:
                    if(getFormatoConclusiones() != null)
                    {
                        helper.InsertFormatConclusiones(1, getFormatoConclusiones(), getMax_palabrasConclusiones(), getMin_palabrasConclusiones(), getNumColumnasConclusiones(), isEnumerableConclusiones());
                    }
                break;
            case General:
                
                 break;
            case Imagenes:
                break;
            case Introducción:
                     
                    if(getFormatoIntroducion() != null)
                    {
                        helper.InsertFormatIntroduccion(1, getFormatoIntroducion(), getMax_Introduccion(), getMin_palabrasIntroduccion(), getNumColumnasIntroduccion());
                    }
                break;
            case Metodología:
                    if(getFormatoMetodologia() != null)
                    {
                        helper.InsertFormatMetodologia(1, getFormatoMetodologia(), getMax_palabrasMetodologia(), getMin_palabrasMetodologia(), getNumColumnasMetodologia());
                    }
                break;
            case PalabrasClave:
                    if(getFormatoPalabrasClave()!= null)
                    {
                        helper.InsertFormatPalabrasClave(1, getFormatoPalabrasClave(), getMax_palabrasClave(), getMin_palabrasClave(), true);
                    }
                break;
            case Referencias:
                     if(getFormatoReferencia() != null)
                     {
                        helper.InsertFormatReferencias(1, getFormatoReferencia(), getNumColumnasReferencia(), true);
                     }
                break;
            case Resultados:
                     if(getFormatoFormato() != null)
                     {
                         helper.InsertFormatResultados(1, getFormatoFormato(), getMax_palabrasFormato(), getMin_palabrasFormato(), getNumColumnasFormato());
                     }
                break;
            case Resumen:
                     if(getFormatoResumen() != null)
                     {
                         helper.InsertFormatResumen(1, getFormatoResumen(), getMax_palabrasResumen(), getMin_palabrasResumen());
                     }
                break;
            case RevisionLiteraria:
                     if(getFormatoRevision() != null)
                     {
                          helper.InsertFormatRevision(1, getFormatoRevision(), getMax_palabrasRevision(), getMin_palabrasRevision(), getNumColumnasRevision());
                     }
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
                   if(FormatoTitulo != null )
                   {
                         helper.InsertFormatTitle(1, FormatoTitulo, max_palabrasTitulo, min_palabrasTitulo); 
                   }
        
        
                break;
        }
        
        
        
    }
}
