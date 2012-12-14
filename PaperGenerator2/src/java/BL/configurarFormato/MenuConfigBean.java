/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.configurarFormato;

import BL.general.AppSingleton;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author alejandro
 */
@ManagedBean(name="menuBean")
@SessionScoped
public class MenuConfigBean {
    private ConfiguracionesBean configBean = new ConfiguracionesBean();
    private ConfiguracionFormatoHelper helper = new ConfiguracionFormatoHelper();
   
     
    
    
    public MenuConfigBean() {
    }
    
    public void save(){
        
        
       
        configBean.SaveValues();         
        AppSingleton.getInstance().addMessage("Configuración Guardada!");
    }
    
    public ConfiguracionesBean getConfigBean() {
        return configBean;
    }

    public void setConfigBean(ConfiguracionesBean configBean) {
        this.configBean = configBean;
    }
    
    public void configTitulo(){
        this.deRenderAll();
        
        configBean.setRender_min_palabras(true);
        configBean.setRender_max_palabras(true);
        configBean.setRender_en_mayusculas(true);
        configBean.SetearVariablesTemps();
        configBean.SaveValues();
        configBean.setConfig_seleccionada(ConfiguracionesBean.Secciones.Título);
        AppSingleton.getInstance().addMessage("Configurando titulo...");
        configBean.CargarVariablesTemps();
    }
    
    public void configResumen(){
        this.deRenderAll();
        
        configBean.setRender_min_palabras(true);
        configBean.setRender_max_palabras(true);
        configBean.SetearVariablesTemps();
        configBean.SaveValues();
        configBean.setConfig_seleccionada(ConfiguracionesBean.Secciones.Resumen);
        AppSingleton.getInstance().addMessage("Configurando Resumen...");
        
        configBean.CargarVariablesTemps();
    }
    
    public void configPalabrasClave(){
        this.deRenderAll();
        
        configBean.setRender_min_palabras(true);
        configBean.setRender_max_palabras(true);
        configBean.setRender_sangria_francesa(true);
        configBean.setRender_columnas_seccion(true);
        configBean.setRender_auto_ordenable(true);
         configBean.SetearVariablesTemps();
         configBean.SaveValues();
        configBean.setConfig_seleccionada(ConfiguracionesBean.Secciones.PalabrasClave);
        AppSingleton.getInstance().addMessage("Configurando Palabras Clave...");
        
        configBean.CargarVariablesTemps();
    }
    
    public void configAutores(){
        this.deRenderAll();
        
        configBean.setRender_minimo_autores(true);
        configBean.setRender_maximo_autores(true);
        
         configBean.SetearVariablesTemps();
         configBean.SaveValues();
        configBean.setConfig_seleccionada(ConfiguracionesBean.Secciones.Autores);
        AppSingleton.getInstance().addMessage("Configurando Autores...");
         configBean.CargarVariablesTemps();
    }
    
    public void configIntroduccion(){
        this.deRenderAll();
        
        configBean.setRender_min_palabras(true);
        configBean.setRender_max_palabras(true);
        configBean.setRender_columnas_seccion(true);
        configBean.SetearVariablesTemps();
        configBean.SaveValues();
        configBean.setConfig_seleccionada(ConfiguracionesBean.Secciones.Introducción);
        AppSingleton.getInstance().addMessage("Configurando Introducción...");
        configBean.CargarVariablesTemps();
    }
    
    public void configMetodologia(){
        this.deRenderAll();
        
        configBean.setRender_min_palabras(true);
        configBean.setRender_max_palabras(true);
        configBean.setRender_columnas_seccion(true);
        configBean.SetearVariablesTemps();
        configBean.SaveValues();
        configBean.setConfig_seleccionada(ConfiguracionesBean.Secciones.Metodología);
        AppSingleton.getInstance().addMessage("Configurando Metodología...");
        configBean.CargarVariablesTemps();
    }
    
    public void configResultados(){
        this.deRenderAll();
        
        configBean.setRender_min_palabras(true);
        configBean.setRender_max_palabras(true);
        configBean.setRender_columnas_seccion(true);
        configBean.SetearVariablesTemps();
        configBean.SaveValues();
        configBean.setConfig_seleccionada(ConfiguracionesBean.Secciones.Resultados);
        AppSingleton.getInstance().addMessage("Configurando Resultados y Análisis...");
        configBean.CargarVariablesTemps();
    }
    
    public void configConclusiones(){
        this.deRenderAll();
        
        configBean.setRender_columnas_seccion(true);
        configBean.setRender_enumerable(true);
        configBean.setRender_min_palabras_enumerable(true);
        configBean.setRender_max_palabras_enumerable(true);
        configBean.setRender_min_palabras(true);
        configBean.setRender_max_palabras(true);
        configBean.SetearVariablesTemps();
        configBean.SaveValues();
        configBean.setConfig_seleccionada(ConfiguracionesBean.Secciones.Conclusiones);
        AppSingleton.getInstance().addMessage("Configurando Conclusiones...");
        configBean.CargarVariablesTemps();
    }
    
    public void configAgradecimientos(){
        this.deRenderAll();
        
        configBean.setRender_min_palabras(true);
        configBean.setRender_max_palabras(true);
        configBean.setRender_opcional(true);
        configBean.setRender_columnas_seccion(true);
        configBean.SetearVariablesTemps();
        configBean.SaveValues();
        configBean.setConfig_seleccionada(ConfiguracionesBean.Secciones.Agradecimiento);
        AppSingleton.getInstance().addMessage("Configurando Agradecimientos...");
        configBean.CargarVariablesTemps();
    }
    
    public void configReferencia(){
        this.deRenderAll();
        
        configBean.setRender_norma(true);
        configBean.setRender_columnas_seccion(true);
        configBean.setRender_auto_ordenable(true);
        configBean.SetearVariablesTemps();
        configBean.SaveValues();
        configBean.setConfig_seleccionada(ConfiguracionesBean.Secciones.Referencias);
        AppSingleton.getInstance().addMessage("Configurando Referencias...");
        configBean.CargarVariablesTemps();
    }
    
    public void configAnexo(){
        this.deRenderAll();
        
        configBean.setRender_min_palabras(true);
        configBean.setRender_max_palabras(true);
        configBean.setRender_opcional(true);
        configBean.setRender_columnas_seccion(true);
        configBean.SetearVariablesTemps();
        configBean.SaveValues();
        configBean.setConfig_seleccionada(ConfiguracionesBean.Secciones.Anexo);
        AppSingleton.getInstance().addMessage("Configurando Anexos...");
        configBean.CargarVariablesTemps();
    }
    
    public void configRevisionLiteraria(){
        this.deRenderAll();
        
        configBean.setRender_min_palabras(true);
        configBean.setRender_max_palabras(true);
        configBean.setRender_columnas_seccion(true);
        configBean.setRender_opcional(true);
        configBean.SetearVariablesTemps();
        configBean.SaveValues();
        configBean.setConfig_seleccionada(ConfiguracionesBean.Secciones.RevisionLiteraria);
        AppSingleton.getInstance().addMessage("Configurando Revisión Literaria...");
        configBean.CargarVariablesTemps();
    }
    
    public void configTablaC1(){
        this.deRenderAll();
        configBean.SetearVariablesTemps();
        configBean.SaveValues();
        configBean.setConfig_seleccionada(ConfiguracionesBean.Secciones.TablasC1);
        AppSingleton.getInstance().addMessage("Configurando Tablas...");
        configBean.CargarVariablesTemps();
    }
    
    public void configTablaC2(){
        this.deRenderAll();
        configBean.SetearVariablesTemps();
        configBean.SaveValues();
        configBean.setConfig_seleccionada(ConfiguracionesBean.Secciones.TablasC2);
        AppSingleton.getInstance().addMessage("Configurando Tablas...");
        configBean.CargarVariablesTemps();
    }
    
    public void configSubtituloN1(){
        this.deRenderAll();
        configBean.SetearVariablesTemps();
        configBean.SaveValues();
        
        configBean.setConfig_seleccionada(ConfiguracionesBean.Secciones.SubtituloN1);
        AppSingleton.getInstance().addMessage("Configurando Subtitulo...");
        configBean.CargarVariablesTemps();
    }
    
    public void configSubtituloN2(){
        this.deRenderAll();
        configBean.SetearVariablesTemps();
        configBean.SaveValues();
        configBean.setConfig_seleccionada(ConfiguracionesBean.Secciones.SubtituloN2);
        AppSingleton.getInstance().addMessage("Configurando Subtitulo...");
        configBean.CargarVariablesTemps();
    }
    
    public void configSubtituloN3(){
        this.deRenderAll();
        configBean.SetearVariablesTemps();
        configBean.SaveValues();
        configBean.setConfig_seleccionada(ConfiguracionesBean.Secciones.SubtituloN3);
        AppSingleton.getInstance().addMessage("Configurando Subtitulo...");
        configBean.CargarVariablesTemps();
    }
    
    public void configImagenes(){
        this.deRenderAll();
        configBean.SetearVariablesTemps();
        configBean.SaveValues();
        configBean.setConfig_seleccionada(ConfiguracionesBean.Secciones.Imagenes);
        AppSingleton.getInstance().addMessage("Configurando Imagenes...");
        configBean.CargarVariablesTemps();
    }
    
    private void deRenderAll(){
        configBean.setRender_cant_maxima(false);
        configBean.setRender_cant_minima(false);
        configBean.setRender_columnas_seccion(false);
        configBean.setRender_enumerable(false);
        configBean.setRender_max_palabras(false);
        configBean.setRender_maximo_autores(false);
        configBean.setRender_min_palabras(false);
        configBean.setRender_minimo_autores(false);
        configBean.setRender_norma(false);
        configBean.setRender_opcional(false);
    }
}
