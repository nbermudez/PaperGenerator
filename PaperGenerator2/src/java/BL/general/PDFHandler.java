/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.general;

import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.IOException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletResponse;

@ManagedBean(name = "pdf")
@SessionScoped
public class PDFHandler {

    private String titulo;
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

        downloadPDF(titulo);
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
}