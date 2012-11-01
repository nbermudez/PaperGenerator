/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.busqueda;

import BL.general.AppSingleton;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author alejandro
 */
@ManagedBean(name="autoComplete")
@SessionScoped
public class autoCompleteBean {
    
    private List<String> selectedTexts;
    
    private List<String> frases_clave;

    public List<String> getSelectedTexts() {
        return selectedTexts;
    }

    public void setSelectedTexts(List<String> selectedTexts) {
        this.selectedTexts = selectedTexts;
    }
    
    public List<String> complete(String query) {  
        List<String> results = new ArrayList<String>();  
        for (String string : frases_clave) {
            if(string.toLowerCase().contains(query.toLowerCase())){
                results.add(string);
            }
        }          
        return results;  
    }
    
    public autoCompleteBean(){
        this.frases_clave = AppSingleton.getInstance().getFrasesClave();
        this.frases_clave.addAll(AppSingleton.getInstance().getTitulosPaper());
        this.selectedTexts = new ArrayList<String>();
    }
}
