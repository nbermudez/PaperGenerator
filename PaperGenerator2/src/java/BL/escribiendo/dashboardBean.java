/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.escribiendo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

/**
 *
 * @author Alejandro
 */
@ManagedBean(name="dashboard")
@SessionScoped
public class dashboardBean {
    private DashboardModel model;

    public DashboardModel getModel() {
        return model;
    }

    public void setModel(DashboardModel model) {
        this.model = model;
    }
    
    public dashboardBean(){
        model = new DefaultDashboardModel();
        
        DashboardColumn column1 = new DefaultDashboardColumn();
        
        column1.addWidget("titulo");
        column1.addWidget("abstract");
        
        DashboardColumn column2 = new DefaultDashboardColumn();
        
        column2.addWidget("frases");
        column2.addWidget("intro");
        
        model.addColumn(column1);
        model.addColumn(column2);
    }
}