/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.general;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

@ManagedBean(name = "pdf")
@SessionScoped
public class PDFHandler {

    private String titulo;
    private String abs;
    private String frases;
    private String intro;
    private int IdPaper;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getIdPaper() {
        return IdPaper;
    }

    public void setIdPaper(int IdPaper) {
        this.IdPaper = IdPaper;
    }
    // Constants ----------------------------------------------------------------------------------
    private static final int DEFAULT_BUFFER_SIZE = 10240; // 10KB.

    // Actions ------------------------------------------------------------------------------------
    public void downloadPDF(String tit) throws IOException {

        // Prepare.
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();

        BufferedOutputStream output = null;

        try {
            // Open file.
            byte[] blob = AppSingleton.getInstance().getPaperBlob(AppSingleton.getInstance().getIdFromTitulo(tit));
            if (blob != null) {

                // Init servlet response.
                response.reset();
                response.setHeader("Content-Type", "application/pdf");
                response.setHeader("Content-Length", String.valueOf(blob.length));
                response.setHeader("Content-Disposition", "inline; filename=\"" + tit + "\"");
                output = new BufferedOutputStream(response.getOutputStream(), DEFAULT_BUFFER_SIZE);

                // Write file contents to response.
                output.write(blob);

                // Finalize task.
                output.flush();
            }
        } finally {
            // Gently close streams.
            close(output);
        }

        // Inform JSF that it doesn't need to handle response.
        // This is very important, otherwise you will get the following exception in the logs:
        // java.lang.IllegalStateException: Cannot forward after response has been committed.
        facesContext.responseComplete();
    }
    
    public void downloadPDF() throws IOException {
        FacesContext context = FacesContext.getCurrentInstance();
        Map<String, String> paramMap = context.getExternalContext().getRequestParameterMap();
        
        int id = Integer.parseInt(paramMap.get("id"));
        if (id<=0){
            downloadPDF(titulo);
        }else{
            downloadPDF(AppSingleton.getInstance().getTituloFromId(id));
        }
    }

    // Helpers (can be refactored to public utility class) ----------------------------------------
    private static void close(Closeable resource) {
        if (resource != null) {
            try {
                resource.close();
            } catch (IOException e) {
            }
        }
    }
    
    public PDFHandler(){
    }
    
    
    public void generatePDF(){
    
        Document document = new Document(); 
       
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext externalContext = facesContext.getExternalContext();
        HttpServletResponse response = (HttpServletResponse) externalContext.getResponse();                                       

        BufferedOutputStream output = null;

        try {          
                response.setContentType("application/pdf");
                PdfWriter.getInstance(document, response.getOutputStream());      
                document.open();        
                document.add(new Paragraph(titulo));                
                document.add(new Paragraph(abs)); 
                document.add(new Paragraph(frases)); 
                document.add(new Paragraph(intro)); 
                
                document.close();
            
                // Init servlet response.
                response.reset();
                response.setHeader("Content-Type", "application/pdf");
                //response.setHeader("Content-Length", String.valueOf(blob.length));
                response.setHeader("Content-Disposition", "inline; filename=\"PDF.pdf\"");
                output = new BufferedOutputStream(response.getOutputStream(), 10240);
                
                // Finalize task.
                output.flush();            
        }
        catch(Exception ex)
        {
        } 
        finally {
            // Gently close streams.
            close(output);
        }            

        // Inform JSF that it doesn't need to handle response.
        // This is very important, otherwise you will get the following exception in the logs:
        // java.lang.IllegalStateException: Cannot forward after response has been committed.
        facesContext.responseComplete();
    }

    /**
     * @return the abs
     */
    public String getAbs() {
        return abs;
    }

    /**
     * @param abs the abs to set
     */
    public void setAbs(String abs) {
        this.abs = abs;
    }

    /**
     * @return the frases
     */
    public String getFrases() {
        return frases;
    }

    /**
     * @param frases the frases to set
     */
    public void setFrases(String frases) {
        this.frases = frases;
    }

    /**
     * @return the intro
     */
    public String getIntro() {
        return intro;
    }

    /**
     * @param intro the intro to set
     */
    public void setIntro(String intro) {
        this.intro = intro;
    }
}