/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.ejemplares;

/**
 *
 * @author alejandro
 */
import BL.general.AppSingleton;
import java.io.Serializable;
import java.util.ArrayList;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;
import tablas.Papers;

@ManagedBean(name = "ntree")
@SessionScoped
public class newTreeController implements Serializable {

    private TreeNode root;
    private TreeNode selected;
    private boolean visibleL1;
    private Papers paperActual;
    private boolean visibleL2;
    private boolean visibleL3;
    private ArrayList<Volumen> volumenes;
    private Volumen currentVol;
    private Numero currentNum;

    public Numero getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(Numero currentNum) {
        this.currentNum = currentNum;
    }

    public Volumen getCurrentVol() {
        return currentVol;
    }

    public void setCurrentVol(Volumen currentVol) {
        this.currentVol = currentVol;
    }

    public ArrayList<Volumen> getVolumenes() {
        return volumenes;
    }

    public void setVolumenes(ArrayList<Volumen> volumenes) {
        this.volumenes = volumenes;
    }

    public boolean isVisibleL1() {
        return visibleL1;
    }

    public void setVisibleL1(boolean visibleL1) {
        this.visibleL1 = visibleL1;
    }

    public boolean isVisibleL2() {
        return visibleL2;
    }

    public void setVisibleL2(boolean visibleL2) {
        this.visibleL2 = visibleL2;
    }

    public boolean isVisibleL3() {
        return visibleL3;
    }

    public void setVisibleL3(boolean visibleL3) {
        this.visibleL3 = visibleL3;
    }

    public Papers getPaperActual() {
        return paperActual;
    }

    public void setPaperActual(Papers paperActual) {
        this.paperActual = paperActual;
    }

    public TreeNode getSelected() {
        return selected;
    }

    public void setSelected(TreeNode selected) {
        this.selected = selected;
    }
    private String volumenSelected;

    public String getVolumenSelected() {
        return volumenSelected;
    }

    public void setVolumenSelected(String volumenSelected) {
        this.volumenSelected = volumenSelected;
    }

    public newTreeController() {
        this.volumenSelected = "Volumen 2";
        this.visibleL1 = true;
        this.visibleL2 = false;
        this.visibleL3 = false;

        this.volumenes = new ArrayList<Volumen>();
        Volumen v1;
        Numero n1;
        for (int i = 0; i < 2; i++) {
            v1 = new Volumen();
            v1.setNombre("Volumen " + (i + 1));
            n1 = new Numero("Numero " + (i * 2));
            v1.agregarNumero(n1);
            n1 = new Numero("Numero " + (i * 2 + 1));
            v1.agregarNumero(n1);
            this.volumenes.add(v1);
        }

    }

    public void handleSelected() {
        if (this.selected != null) {
            this.paperActual = AppSingleton.getInstance().getPaper(selected.getData().toString());
        }
    }

    public void verVolumenes() {
        this.visibleL1 = true;
        this.visibleL2 = false;
        this.visibleL3 = false;
    }

    public void verNumeros() {
        //if (!this.currentVol.getNumeros().isEmpty()) {
            this.visibleL1 = false;
            this.visibleL2 = true;
            this.visibleL3 = false;
        //}
    }

    public void verPapers() {
        //if (!this.currentNum.getPapers().isEmpty()) {
            this.visibleL1 = false;
            this.visibleL2 = false;
            this.visibleL3 = true;
        //}
    }

    public void volumenChanged() {
        if (volumenSelected.equals("Volumen 1")) {
            root = new DefaultTreeNode("root", null);

            TreeNode numero1 = new DefaultTreeNode("Número 1", root);
            numero1.setExpanded(true);
            TreeNode numero2 = new DefaultTreeNode("Número 2", root);

            //Documents  
            ArrayList<String> titulos = AppSingleton.getInstance().getTitulosPaper();
            TreeNode p;
            for (String string : titulos) {
                p = new DefaultTreeNode("document", string, numero1);
            }
        } else {
            root = new DefaultTreeNode("root", null);

            TreeNode numero1 = new DefaultTreeNode("Número 3", root);
            numero1.setExpanded(true);
            TreeNode numero2 = new DefaultTreeNode("Número 4", root);
        }
    }

    public TreeNode getRoot() {
        return root;
    }

    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
