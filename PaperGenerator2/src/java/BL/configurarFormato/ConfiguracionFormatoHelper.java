/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.configurarFormato;
import hibernate_util.NewHibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import tablas.*;

/**
 *
 * @author alejandro
 */
public class ConfiguracionFormatoHelper {
     Session session = null;

    public ConfiguracionFormatoHelper() {
        
        this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }
     
    
    
    
    //<editor-fold defaultstate="collapsed" desc="Insertar Tablas Formato">    
    
    
   
    
    
    public void InsertFormatTitle(int iDtitulo, String muestra, int MAXautores, int MINautores)
    {
        try{
            FormatoTitulo ftr;
               org.hibernate.Transaction xl =session.beginTransaction();
            Query q = session.createQuery("from FormatoTitulo as frt where frt.idTitulo='" + iDtitulo + "'");
            
            if(!q.list().isEmpty()){    
                ftr= ((List<FormatoTitulo>) q.list()).get(0);
            
            
                ftr.setIdTitulo(iDtitulo);
                ftr.setMuestra(muestra);
                ftr.setMaximoAutores(MAXautores);
                ftr.setMinimoAutores(MINautores);
                xl.commit();
                
            }else
            {
                FormatoTitulo ft = new FormatoTitulo(iDtitulo, muestra, MINautores, MAXautores);
                session.save(ft);
                xl.commit();
                
            }
            
            
             
        }catch(Exception ex )
        {
            String a = ex.getMessage();
        }
        
    }
    
    public void InsertFormatAgre(int iDAgradecimiento, String muestra, int MAXpalabras, int MINpalabras, int Ncolumns, boolean opcional )
    {
        try{
            FormatoAgradecimiento ftr;
             org.hibernate.Transaction xl =session.beginTransaction();
            Query q = session.createQuery("from FormatoAgradecimiento as frt where frt.idAgradecimiento='" + iDAgradecimiento + "'");
            
            if(!q.list().isEmpty())
            {
                ftr= ((List<FormatoAgradecimiento>) q.list()).get(0);
            
            
                ftr.setIdAgradecimiento(iDAgradecimiento);
                ftr.setMuestra(muestra);
                ftr.setMaximoPalabras(MAXpalabras);
                ftr.setMinimoPalabras(MINpalabras);
                ftr.setColumnasSeccion(Ncolumns);
                ftr.setOpcional(opcional);
                xl.commit();
                
            }else
            {
                FormatoAgradecimiento ft = new FormatoAgradecimiento(iDAgradecimiento, muestra, MAXpalabras, MINpalabras, Ncolumns, opcional);
                session.save(ft);
                xl.commit();
                
            }
            
           
             
        }catch(Exception ex )
        {
            String a = ex.getMessage();
        }
        
    }
    
    
    public void InsertFormatAnexo(int iDAnexo, String muestra, int MAXpalabras, int MINpalabras, int Ncolumns)
    {
        try{
            FormatoAnexo ftr;
             org.hibernate.Transaction xl =session.beginTransaction();
            Query q = session.createQuery("from FormatoAnexo as frt where frt.idAnexo='" + iDAnexo + "'");
            
            if(!q.list().isEmpty())
            {
                ftr= ((List<FormatoAnexo>) q.list()).get(0);
                ftr.setIdAnexo(iDAnexo);
                ftr.setMuestra(muestra);
                ftr.setMinimoPalabras(MINpalabras);
                ftr.setMaximoPalabras(MAXpalabras);
                ftr.setMinimoTotal(MINpalabras);
                ftr.setMaximoTotal(MAXpalabras);
                ftr.setColumnasSeccion(Ncolumns);
                xl.commit();
                
                
            }else
            {
                FormatoAnexo ft = new FormatoAnexo(iDAnexo, muestra, Ncolumns, MINpalabras, MAXpalabras, MINpalabras, MAXpalabras);
                session.save(ft);
                xl.commit();
                
            }
            
            
             
        }catch(Exception ex )
        {
            String a = ex.getMessage();
        }
        
    }
    
    public void InsertFormatConclusiones(int iDConclusiones, String muestra, int MAXpalabras, int MINpalabras, int Ncolumns, boolean enumerables)
    {
        try{
            FormatoConclusiones ftr;
             org.hibernate.Transaction xl =session.beginTransaction();
            Query q = session.createQuery("from FormatoConclusiones as frt where frt.idConclusiones='" + iDConclusiones + "'");
            
            if(!q.list().isEmpty())
            {
                ftr= ((List<FormatoConclusiones>) q.list()).get(0);
                ftr.setIdConclusiones(iDConclusiones);
                ftr.setMuestra(muestra);
                ftr.setMaximoPalabrasBloque(MAXpalabras);
                ftr.setMinimoPalabrasBloque(MINpalabras);
                ftr.setMaximoPalabrasEnumerable(MAXpalabras);
                ftr.setMinimoPalabrasEnumerable(MINpalabras);
                ftr.setColumnasSeccion(Ncolumns);
                ftr.setEnumerables(enumerables);
                xl.commit();
                
                
            }else
            {
                FormatoConclusiones ft = new FormatoConclusiones(iDConclusiones, muestra, enumerables, MINpalabras, MAXpalabras, MINpalabras, MAXpalabras, Ncolumns);
                session.save(ft);
                xl.commit();
                
            }
            
            
             
        }catch(Exception ex )
        {
            String a = ex.getMessage();
        }
        
    }
    
    public void InsertFormatIntroduccion(int iDIntroduccion, String muestra, int MAXpalabras, int MINpalabras, int Ncolumns)
    {
        try{
            FormatoIntroduccion ftr;
             org.hibernate.Transaction xl =session.beginTransaction();
            Query q = session.createQuery("from FormatoIntroduccion as frt where frt.idIntroduccion='" + iDIntroduccion + "'");
            
            if(!q.list().isEmpty())
            {
                ftr= ((List<FormatoIntroduccion>) q.list()).get(0);
                ftr.setIdIntroduccion(iDIntroduccion);
                ftr.setMuestra(muestra);
                ftr.setMaximoPalabras(MAXpalabras);
                ftr.setMinimoPalabras(MINpalabras);
                ftr.setColumnasSeccion(Ncolumns);
                xl.commit();
                
                
            }else
            {
                FormatoIntroduccion ft = new FormatoIntroduccion(iDIntroduccion, muestra, MINpalabras, MAXpalabras, Ncolumns);
                session.save(ft);
                xl.commit();
                
            }
            
            
             
        }catch(Exception ex )
        {
            String a = ex.getMessage();
        }
        
    }
    
    public void InsertFormatMetodologia(int iDMetodologia, String muestra, int MAXpalabras, int MINpalabras, int Ncolumns)
    {
        try{
            FormatoMetodologia ftr;
            org.hibernate.Transaction xl =session.beginTransaction();
            Query q = session.createQuery("from FormatoMetodologia as frt where frt.idMetodologia='" + iDMetodologia + "'");
            
            if(!q.list().isEmpty())
            {
                ftr= ((List<FormatoMetodologia>) q.list()).get(0);
                ftr.setIdMetodologia(iDMetodologia);
                ftr.setMinimoPalabras(MINpalabras);
                ftr.setMaximoPalabras(MAXpalabras);
                ftr.setColumnasSeccion(Ncolumns);
                ftr.setMuestra(muestra);
                xl.commit();
                
                
            }else
            {
                FormatoMetodologia ft = new FormatoMetodologia(iDMetodologia, muestra, MINpalabras, MAXpalabras, Ncolumns);
                session.save(ft);
                xl.commit();
                
            }
            
            
             
        }catch(Exception ex )
        {
            String a = ex.getMessage();
        }
        
    }
    
    
    public void InsertFormatPalabrasClave(int iDPalabrasClave, String muestra, int MAXpalabras, int MINpalabras, boolean ident)
    {
        try{
            FormatoPalabrasClave ftr;
             org.hibernate.Transaction xl =session.beginTransaction();
            Query q = session.createQuery("from FormatoPalabrasClave as frt where frt.idPalabrasClave='" + iDPalabrasClave + "'");
            
            if(!q.list().isEmpty())
            {
                ftr= ((List<FormatoPalabrasClave>) q.list()).get(0);
                ftr.setIdPalabrasClave(iDPalabrasClave);
                ftr.setCantidadMinima(MINpalabras);
                ftr.setCantidadMaximo(MAXpalabras);
                ftr.setMuestra(muestra);
                ftr.setIndentacion(ident);
                xl.commit();
                
                
            }else
            {
                FormatoPalabrasClave ft = new FormatoPalabrasClave(iDPalabrasClave, muestra, MINpalabras, MAXpalabras, ident);
                session.save(ft);
                xl.commit();
                
            }
            
            
             
        }catch(Exception ex )
        {
            String a = ex.getMessage();
        }
        
    }
    
    public void InsertFormatReferencias(int iDReferencias, String muestra, int NCol, boolean enumerable)
    {
        try{
            FormatoReferencias ftr;
            org.hibernate.Transaction xl =session.beginTransaction();
            Query q = session.createQuery("from FormatoReferencias as frt where frt.idReferencias='" + iDReferencias + "'");
            
            if(!q.list().isEmpty())
            {
                ftr= ((List<FormatoReferencias>) q.list()).get(0);
                ftr.setIdReferencias(iDReferencias);
                ftr.setNorma("def");
                ftr.setMuestra(muestra);
                ftr.setEnumerables(enumerable);
                ftr.setColumnasSeccion(iDReferencias);
                xl.commit();
                
                
            }else
            {
                FormatoReferencias ft = new FormatoReferencias(iDReferencias, muestra, enumerable, "def", NCol);
                session.save(ft);
                xl.commit();
                
            }
            
            
             
        }catch(Exception ex )
        {
            String a = ex.getMessage();
        }
        
    }
    
    public void InsertFormatResultados(int iDResultados, String muestra, int MaxPalabras, int MinPalabras, int NColumnas)
    {
        try{
            FormatoResultados ftr;
            org.hibernate.Transaction xl = session.beginTransaction();
            Query q = session.createQuery("from FormatoResultados as frt where frt.idResultados='" + iDResultados + "'");
            
            if(!q.list().isEmpty())
            {
                ftr= ((List<FormatoResultados>) q.list()).get(0);
                ftr.setIdResultados(iDResultados);
                ftr.setMuestra(muestra);
                ftr.setMaximoPalabras(MaxPalabras);
                ftr.setMinimoPalabras(MinPalabras);
                ftr.setColumnasSeccion(NColumnas);
                
                xl.commit();
                
                
            }else
            {
                FormatoResultados ft = new FormatoResultados(iDResultados, muestra, MinPalabras, MaxPalabras, NColumnas);
                session.save(ft);
                xl.commit();
                
            }
            
            
             
        }catch(Exception ex )
        {
            String a = ex.getMessage();
        }
        
    }
    
    
    public void InsertFormatResumen(int iDResumen, String muestra, int MaxPalabras, int MinPalabras)
    {
        try{
            FormatoResumen ftr;
            
             org.hibernate.Transaction xl =session.beginTransaction();
            
            
            Query q = session.createQuery("from FormatoResumen as frt where frt.idResumen='" + iDResumen + "'");
            
            if(!q.list().isEmpty())
            {
                ftr= ((List<FormatoResumen>) q.list()).get(0);
                ftr.setIdResumen(iDResumen);
                ftr.setMuestra(muestra);
                ftr.setMaximoPalabras(MaxPalabras);
                ftr.setMinimoPalabras(MinPalabras);
                xl.commit();
                
                
            }else
            {
                FormatoResumen ft = new FormatoResumen(iDResumen, muestra, MinPalabras, MaxPalabras);
                session.save(ft);
                xl.commit();
                
            }
          
           
             
        }catch(Exception ex )
        {
            String a = ex.getMessage();
            
        }
        
    }
    
    public void InsertFormatRevision(int iDRevisionLiteratura, String muestra, int MaxPalabras, int MinPalabras, int Ncolumnas)
    {
        try{
            FormatoRevisionLiteratura ftr;
            org.hibernate.Transaction xl =session.beginTransaction();
            Query q = session.createQuery("from FormatoRevisionLiteratura as frt where frt.idRevisionLiteratura='" + iDRevisionLiteratura + "'");
            
            if(!q.list().isEmpty())
            {
                ftr= ((List<FormatoRevisionLiteratura>) q.list()).get(0);
                ftr.setIdRevisionLiteratura(iDRevisionLiteratura);
                ftr.setMuestra(muestra);
                ftr.setMaximoPalabras(MaxPalabras);
                ftr.setMinimoPalabras(MinPalabras);
                ftr.setColumnasSeccion(Ncolumnas);
                xl.commit();
                
                
            }else
            {
                FormatoRevisionLiteratura ft = new FormatoRevisionLiteratura(iDRevisionLiteratura, muestra, MinPalabras, MaxPalabras, Ncolumnas);
                session.save(ft);
                xl.commit();
                
            }
            
            
             
        }catch(Exception ex )
        {
            String a = ex.getMessage();
        }
        
        
        
    }
    
    public void InsertFormatTabla(int iD, int iDTabla)
    {
        try{
            FormatoTabla ftr;
            org.hibernate.Transaction xl =session.beginTransaction();
            Query q = session.createQuery("from FormatoTabla as frt where frt.idTabla='" + iDTabla + "'");
            
            if(!q.list().isEmpty())
            {
                ftr= ((List<FormatoTabla>) q.list()).get(0);
                ftr.setAlto(200);
                ftr.setAncho(300);
                ftr.setId(iD);
                ftr.setIdTabla(iDTabla);
                ftr.setColumnasSeccion(2);
                xl.commit();
                
            }else
            {
                FormatoTabla ft = new FormatoTabla(iD, iDTabla, 2, 300, 200);
                session.save(ft);
                xl.commit();
                
            }
            
            
             
        }catch(Exception ex )
        {
            String a = ex.getMessage();
        }
        
    }
    
    
    //</editor-fold>
    
}
