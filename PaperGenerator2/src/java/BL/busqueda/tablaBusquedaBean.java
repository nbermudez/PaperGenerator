/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.busqueda;

import BL.general.AppSingleton;
import BL.general.PDFHandler;
import BL.general.Paper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author alejandro
 */
@ManagedBean(name = "tbusquedaBean")
@ViewScoped
public class tablaBusquedaBean implements Serializable {

    List<Paper> papers;
    List<Paper> filteredPapers;
    List<String> paperTitulos;
    private Paper selectedPaper;
    private List<String> filtros;

    public List<Paper> getFilteredPapers() {
        return filteredPapers;
    }

    public void setFilteredPapers(List<Paper> filteredPapers) {
        this.filteredPapers = filteredPapers;
    }

    public List<String> getFiltros() {
        return filtros;
    }

    public void setFiltros(List<String> filtros) {
        this.filtros = filtros;
    }

    public Paper getSelectedPaper() {
        return selectedPaper;
    }

    public void setSelectedPaper(Paper selectedPaper) {
        this.selectedPaper = selectedPaper;
    }

    public List<Paper> getPapers() {
        return papers;
    }

    public void setPapers(List<Paper> papers) {
        this.papers = papers;
    }

    public void Filtrar() {
        Filtrar(filtros);
    }
    
    public void Filtrar(List<String> filts) {
        boolean containsAll;
        
        
        
        this.filteredPapers.clear();
        if (filtros == null) {
            this.filteredPapers = new ArrayList<Paper>(this.papers);
            return;
        }
        for (Paper paper : papers) {
            containsAll = true;
            List<String> frases = paper.getFrases_clave();

            for (String filtro : filts) {
                boolean tt = match(frases, filtro);
                containsAll = containsAll && tt;
            }
            if (containsAll) {
                this.filteredPapers.add(paper);
            }
        }
    }
    
    private boolean match(List<String> frases, String filtro){
        for (String string : frases) {
            if(string.matches("[0-9a-zA-Z]*"+filtro+"[0-9a-zA-Z]*")){
                return true;
            }
        }
        return false;
    }

    public void showPaper() {
        PDFHandler handler = new PDFHandler();
        try {
            handler.downloadPDF();
        } catch (Exception e) {
        }
    }

    public tablaBusquedaBean() {
        this.paperTitulos = AppSingleton.getInstance().getTitulosPaper();
        this.filtros = new ArrayList<String>();

        this.papers = new ArrayList<Paper>();
        this.filteredPapers = new ArrayList<Paper>();
        for (String titulo : paperTitulos) {
            Paper temp = new Paper(titulo);
            this.papers.add(temp);
        }
    }
}
