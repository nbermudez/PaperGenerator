/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.ejemplares;

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

/**
 *
 * @author alejandro
 */
@ManagedBean(name="tree")
@SessionScoped
public class treeController implements Serializable{
    private TreeNode root;  
    private TreeNode selected;
    private boolean visible1;
    private Papers paperActual;

    public Papers getPaperActual() {
        return paperActual;
    }

    public void setPaperActual(Papers paperActual) {
        this.paperActual = paperActual;
    }    

    public boolean isVisible1() {
        return visible1;
    }

    public void setVisible1(boolean visible1) {
        this.visible1 = visible1;
    }
    
    public TreeNode getSelected() {
        return selected;
    }

    public void setSelected(TreeNode selected) {
        this.selected = selected;
    }
      
    public treeController() {  
        root = new DefaultTreeNode("root", null);  
        visible1 = true;
  
        TreeNode numero1 = new DefaultTreeNode("Número 1", root);  
        numero1.setExpanded(true);
        TreeNode numero2 = new DefaultTreeNode("Número 2", root);  
  
        //Documents  
        ArrayList<String> titulos = AppSingleton.getInstance().getTitulosPaper();
        TreeNode p;
        for (String string : titulos) {
            p = new DefaultTreeNode("document",string,numero1);
        }
   
    } 
    
    public void handleSelected(){
        if (this.selected != null){
            this.paperActual = AppSingleton.getInstance().getPaper(selected.getData().toString());
            this.visible1 = false;
        }
    }
    
    public void mostrarAbstract(String tit){
        this.paperActual = AppSingleton.getInstance().getPaper(tit);
        this.visible1 = false;
    }
    
    public void atras(){
        this.visible1 = !this.visible1;
    }
  
    public TreeNode getRoot() {  
        return root;  
    }
    
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
}
