package tablas;
// Generated 09-13-2012 06:37:09 PM by Hibernate Tools 3.2.1.GA



/**
 * FormatoAgradecimiento generated by hbm2java
 */
public class FormatoAgradecimiento  implements java.io.Serializable {


     private int idAgradecimiento;
     private String muestra;
     private int minimoPalabras;
     private int maximoPalabras;
     private int columnasSeccion;
     private boolean opcional;

    public FormatoAgradecimiento() {
    }

    public FormatoAgradecimiento(int idAgradecimiento, String muestra, int minimoPalabras, int maximoPalabras, int columnasSeccion, boolean opcional) {
       this.idAgradecimiento = idAgradecimiento;
       this.muestra = muestra;
       this.minimoPalabras = minimoPalabras;
       this.maximoPalabras = maximoPalabras;
       this.columnasSeccion = columnasSeccion;
       this.opcional = opcional;
    }
   
    public int getIdAgradecimiento() {
        return this.idAgradecimiento;
    }
    
    public void setIdAgradecimiento(int idAgradecimiento) {
        this.idAgradecimiento = idAgradecimiento;
    }
    public String getMuestra() {
        return this.muestra;
    }
    
    public void setMuestra(String muestra) {
        this.muestra = muestra;
    }
    public int getMinimoPalabras() {
        return this.minimoPalabras;
    }
    
    public void setMinimoPalabras(int minimoPalabras) {
        this.minimoPalabras = minimoPalabras;
    }
    public int getMaximoPalabras() {
        return this.maximoPalabras;
    }
    
    public void setMaximoPalabras(int maximoPalabras) {
        this.maximoPalabras = maximoPalabras;
    }
    public int getColumnasSeccion() {
        return this.columnasSeccion;
    }
    
    public void setColumnasSeccion(int columnasSeccion) {
        this.columnasSeccion = columnasSeccion;
    }
    public boolean isOpcional() {
        return this.opcional;
    }
    
    public void setOpcional(boolean opcional) {
        this.opcional = opcional;
    }




}


