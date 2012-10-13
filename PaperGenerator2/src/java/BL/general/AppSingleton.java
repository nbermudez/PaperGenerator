/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.general;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.hibernate.Query;
import org.hibernate.Session;
import tablas.*;

/**
 *
 * @author Alejandro
 */
public class AppSingleton {
    
    private AppSingleton() {
    }
    
    public static AppSingleton getInstance() {
        return AppSingletonHolder.INSTANCE;
    }
    private static class AppSingletonHolder {

        private static final AppSingleton INSTANCE = new AppSingleton();
    }
    
    //<editor-fold defaultstate="collapsed" desc="User Related">
    public List<Permisos> getPermisos(String correo) {
        List<Permisos> temp = null;
        try{
            Query q = session.createQuery("select p\n" +
"from PermisosXRoles as p\n" +
"where p.titulo='"+correo+"'");
            temp = q.list();
        }catch (Exception ex){
            String a = ex.getMessage();
        }
        return temp;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Atributos">
    Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Papers Related">
    public ArrayList<String> getFrasesClave(String tituloPaper) {
        ArrayList<String> temp = new ArrayList<String>();
        
        List<FrasesClaveXPaper> frases = getFrasesClaveXPaper();
        Papers paper = findPaper(tituloPaper.toUpperCase());
        if(paper==null){
            return null;
        }
        for (int i = 0; i < frases.size(); i++) {
            if(paper.getIdPaper()==frases.get(i).getId().getIdPaper()){
                temp.add(frases.get(i).getId().getFraseClave().toLowerCase());
            }
        }

        return temp;
    }
    
    public ArrayList<String> getFrasesClave(int id) {
        ArrayList<String> temp = new ArrayList<String>();

        List<FrasesClaveXPaper> frases = getFrasesClaveXPaper();
        for (int i = 0; i < frases.size(); i++) {
            if (frases.get(i).getId().getIdPaper() == id) {
                temp.add(frases.get(i).getId().getFraseClave());
            }
        }
        return temp;
    }

    public ArrayList<String> getFrasesClave() {
        List<FrasesClaveXPaper> frases;
        ArrayList<String> temp = new ArrayList<String>();
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from FrasesClaveXPaper");

            frases = q.list();
            for (int i = 0; i < frases.size(); i++) {
                temp.add(frases.get(i).getId().getFraseClave());
            }
            return temp;

        } catch (Exception ex) {
            ex.printStackTrace();
            //return temp;
        }
        return null;

    }
    
    public Papers findPaper(String tituloPaper){
        Papers paper = null;
        List<Papers> papers = getPapers();
        for (Papers paper1 : papers) {
            if(paper1.getTitulo().equals(tituloPaper.toUpperCase())){
                paper = paper1;
                break;
            }            
        }
        return paper;
    }
    
    private List<FrasesClaveXPaper> getFrasesClaveXPaper() {
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from FrasesClaveXPaper");

            return q.list();

        } catch (Exception ex) {
        }
        return null;
    }
    
    public List<Papers> getPapers(){
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Papers");

            return q.list();

        } catch (Exception ex) {
        }
        return null;
    }
    
    public List<Papers> getPapers(String vol, String num){
        return getPapers();
    }
    
    public int getIdFromTitulo(String titulo){
        List<Papers> papers = getPapers();
        for (Papers papers1 : papers) {
            if(papers1.getTitulo().equals(titulo.toUpperCase())){
                return papers1.getIdPaper();
            }
        }return -1;
    }
    
    public String getTituloFromId(int id){
        try{
            Query q = session.createQuery("select p\n" +
"from Papers as p\n" +
"where p.id="+id);
            Papers p = (Papers)q.list().get(0);
            return p.getTitulo();
        }catch (Exception ex){
        }
        return null;
    }
    
    public ArrayList<String> getTitulosPaper() {
        List<Papers> papers;
        ArrayList<String> temp = new ArrayList<String>();
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Papers order by titulo");

            papers = q.list();
            for (int i = 0; i < papers.size(); i++) {
                String t = papers.get(i).getTitulo();
                temp.add(t);
            }
            return temp;

        } catch (Exception ex) {
            ex.getMessage();
        }
        return null;
    }
    
    public byte[] getPaperBlob(int id){
        List<AlmacenamientoPapers> blobs;
        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from AlmacenamientoPapers");

            blobs = q.list();
            for (int i = 0; i < blobs.size(); i++) {
                if (blobs.get(i).getIdPaper()==id){
                    return blobs.get(i).getPaperPdf();
                }
            }

        } catch (Exception ex) {
            ex.getMessage();
        }
        return null;
    }
    
    public Paper getPaper(int Id){
        Papers t;
        try{
            Query q = session.createQuery("select p\n" +
"from Papers as p\n" +
"where p.id="+Id);
            t = (Papers)q.list().get(0);
            return new Paper(t.getTitulo());
        }catch (Exception ex){
        }
        return null;
    }
    
    public Paper getPaper(String titulo){
        Papers t;
        try{
            Query q = session.createQuery("select p\n" +
"from Papers as p\n" +
"where p.titulo='"+titulo+"'");
            t = (Papers)q.list().get(0);
            return new Paper(t.getTitulo());
        }catch (Exception ex){
            String a = ex.getMessage();
        }
        return null;
    }
    
    public String getResumen(String titulo){
        List<Papers> t;
        try{
            Query q = session.createQuery("select p\n" +
"from Papers as p\n" +
"where p.titulo='"+titulo+"'");
            t = q.list();
            return t.get(0).getResumen();
        }catch (Exception ex){
            String a = ex.getMessage();
        }
        return null;
    }
    
    public List<String> getAutores(int idPaper){
        List<String> t;
        try{
            Query q = session.createQuery("select a.autor "+
"from AutoresXPaper as p, Autores as a "+
"where p.id.idPaper="+idPaper+" and p.id.idAutor=a.idAutor order by a.autor");
            t = q.list();
            return t;
        }catch (Exception ex){
            String a = ex.getMessage();
        }
        return null;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Generales">
    public void addMessage(String summary) {
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, summary, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    //</editor-fold>
}
