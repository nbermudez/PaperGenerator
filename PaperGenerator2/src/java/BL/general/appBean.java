/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.general;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author alejandro
 */
@ManagedBean(name = "app")
@ApplicationScoped
public class appBean {
    //<editor-fold defaultstate="collapsed" desc="Biografias Related">

    private boolean bioVisible = false;
    private String nombre;
    private String bio;
    private String abr;

    public String getAbr() {
        return abr;
    }

    public void setAbr(String abr) {
        this.abr = abr;
    }   

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isBioVisible() {
        return bioVisible;
    }

    public void setBioVisible(boolean bioVisible) {
        this.bioVisible = bioVisible;
    }

    public void setBioInfo(String nombre) {
        try {
            this.abr = nombre;
            if (nombre.equals("Manuel")) {
                this.abr += ".png";
                this.nombre = "Manuel Gómez Solorzano, M. Sc.";
                this.bio = "El ingeniero Manuel Gómez actualmente se desempeña como docente de planta de la facultad de posgrado en UNITEC, campus de Tegucigalpa. Anteriormente ha trabajado como Jefe del Área de Emprendimiento y Desarrollo Empresarial y docente de la facultad de Ingeniería en UNITEC, y tiene experiencia en el área de administración y operaciones en la banca comercial Hondureña. Adicionalmente, se desempeñó como Asistente de Investigación en la Universidad Carnegie Mellon en Pennsylvania, Estados Unidos, donde también obtuvo su título de maestría en Gestión y Políticas Públicas con los más altos honores y patrocinado por el programa Fulbright. Además,  realizó estudios de maestría en ingeniería con enfoque en gestión y economía de la innovación donde se especializó en sistemas tecnológicos de innovación.<br/><br/>" +
"Sus áreas de interés en investigación son: sistemas de innovación y su gobernabilidad, emprendimiento, políticas públicas y desarrollo económico.\n";
            }
            if (nombre.equals("Jared")) {
                this.abr += ".png";
                this.nombre = "Jared R. Ocampo, M. Sc.";
                this.bio = "El Ingeniero Ocampo se desempeña actualmente como docente investigador de la facultad de ingeniería en UNITEC, campus de San Pedro Sula. <br/>Anteriormente ha trabajado como jefe académico de ingenierías, coordinador de la carrera de Ingeniería en Mecatrónica y docente de pregrado y postgrado. Adicionalmente, trabaja como consultor privado en temas de automatización industrial y simulación de procesos industriales. Debido a su experiencia con software y hardware actualmente colabora con los representantes de Flexsim Simulation Software y de National Instruments. <br/><br/>Posee un título de Ingeniero Mecánico así como una Maestría también en Ingeniería Mecánica de Brigham Young University (EEUU) y actualmente está trabajando en su tesis para finalizar su doctorado en Gestión Tecnológica en la Universidad Politécnica de Madrid. <br/><br/>Sus áreas de investigación están orientadas a la mejora de sistemas productivos mediante automatización y simulación de eventos discretos, así como en técnicas de enseñanzas activas para estudiantes de ingeniería.";
            }
            if (nombre.equals("Jose")) { 
                this.abr += ".png";
                this.nombre = "José Arnoldo Sermeño Lima, Ph. D.";
                this.bio = "Trabaja en UNITEC desde 2007, desempeñándose como Director de Investigación. Fue funcionario de Naciones Unidas en Gabón (1980-81) y Nicaragua (1985-87), del Banco Centroamericano de Integración Económica (1988-2004) y Secretario de Integración Social del Sistema de Integración Centroamericano (2004-07). <br/><br/>Ha sido docente en las universidades de Moncton (Canadá, 1981-84), de El Salvador (1976), Autónoma de Honduras (desde 2001) y UCA (El Salvador, 1980).<br/><br/>Obtuvo su Ph. D. en la Universidad de Montreal, Maestría en el Centro Latinoamericano de Demografía y tiene dos licenciaturas de la universidad de El Salvador: una en Ciencias Sociales y otra en CC NN y Matemáticas.<br/><br/>Sus áreas de investigación son la demografía y las ciencias sociales.";
            }
            if (nombre.equals("Jacobo")) {
                this.abr += ".png";
                this.nombre = "Juan Jacobo Paredes Heller, Ph. D.";
                this.bio = "El Dr. Paredes se desempeña como docente de planta y coordinador de investigación en postgrados en Unitec, San Pedro Sula. Tiene amplia experiencia en manejo forestal, ciencia y tecnología de la madera, desde elaboración de inventarios forestales, diseño de caminos, modelamiento del crecimiento y auditorias forestales, industria primaria (aserraderos) y secundaria (muebles, puertas, entre otros), así como en la manufactura de compuestos de madera (OSB, OSL, WPC entre otros), reducción de emisiones industriales y biocombustibles. Esto le ha permitido aplicar sus conocimientos tecnológicos para innovar, producir y reducir costos. <br/><br/>Actualmente, está trabajando como asesor de estudiantes de Maestría en sus proyectos de tesis. Es graduado con un Doctorado y Maestría en Ciencia y Tecnología de la Madera, y en adición, es graduado como Ingeniero Forestal y Dasónomo.<br/><br/>Sus áreas de investigación  son en la producción  de Biocombustibles (Etanol) y mejoramiento de procesos industriales. ";
            }
            this.bioVisible = true;
        } catch (Exception e) {
        }
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Paper Related">
    public Paper getPaper(String titulo) {
        return AppSingleton.getInstance().getPaper(titulo);
    }
    //</editor-fold>
}
