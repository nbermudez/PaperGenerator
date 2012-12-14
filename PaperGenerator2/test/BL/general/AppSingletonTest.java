/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.general;
import hibernate_util.NewHibernateUtil;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.junit.*;
import static org.junit.Assert.*;
import tablas.*;
import org.hibernate.Session;




public class AppSingletonTest {
     Session session = NewHibernateUtil.getSessionFactory().getCurrentSession();
    public AppSingletonTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getInstance method, of class AppSingleton.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        AppSingleton expResult = AppSingleton.getInstance();
        AppSingleton result = AppSingleton.getInstance();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getPermisos method, of class AppSingleton.
     */
    //Prueba que regrese un valor null al enviar un correo que no esta en la BD
    @Test
    public void testGetPermisosNull() {
        System.out.println("getPermisos");
        String correo = "";
        AppSingleton instance = AppSingleton.getInstance();
        List expResult = null;
        List result = instance.getPermisos(correo);
        assertEquals(expResult, result);
        
    }
    
    

    /**
     * Test of getFrasesClave method, of class AppSingleton.
     */
    //Prueba que regrese un valor null
    @Test
    public void testGetFrasesClave_StringNull() {
        System.out.println("getFrasesClave");
        String tituloPaper = "";
        AppSingleton instance = AppSingleton.getInstance();
        ArrayList expResult = null;
        ArrayList result = instance.getFrasesClave(tituloPaper);
        assertEquals(expResult, result);
        
    }
    
    //Prueba que regrese la lista correcta
    @Test
    public void testGetFrasesClave_String() {
        System.out.println("getFrasesClave");
        String tituloPaper = "Disminución de la variación del peso en paquetes del hilo SSP 130x2 en doblado";
        AppSingleton instance = AppSingleton.getInstance();
        ArrayList expResult = new ArrayList();
        expResult.add("disminución");
        expResult.add("hilo ssp 130x2");
        expResult.add("metodología dmamc");
        expResult.add("seis sigma");
        expResult.add("variación en el p");
        ArrayList result = instance.getFrasesClave(tituloPaper);
        assertEquals(expResult, result);     
    }

    /**
     * Test of getFrasesClave method, of class AppSingleton.
     */
    
    //Prueba que regrese la lista correcta
    @Test
    public void testGetFrasesClave_int() {
        System.out.println("getFrasesClave");
        int id = 1;
        AppSingleton instance = AppSingleton.getInstance();
        ArrayList expResult = new ArrayList();
        expResult.add("Disminución");
        expResult.add("Hilo SSP 130X2");
        expResult.add("Metodología DMAMC");
        expResult.add("Seis Sigma");
        expResult.add("Variación en el p");
        ArrayList result = instance.getFrasesClave(id);
        assertEquals(expResult, result);
    }
    
    //Prueba que regrese una lista vacia
    @Test
    public void testGetFrasesClave_intNull() {
        System.out.println("getFrasesClave");
        int id = 0;
        AppSingleton instance = AppSingleton.getInstance();
        ArrayList expResult = new ArrayList();
        ArrayList result = instance.getFrasesClave(id);
        assertEquals(expResult, result);
    }

    /**
     * Test of getFrasesClave method, of class AppSingleton.
     */
    
    //Prueba que regrese la lista de palabras correcta
    @Test
    public void testGetFrasesClave_0args() {
        System.out.println("getFrasesClave");
        AppSingleton instance = AppSingleton.getInstance();
        ArrayList expResult = new ArrayList();
        expResult.add("Disminución");
        expResult.add("Hilo SSP 130X2");
        expResult.add("Metodología DMAMC");
        expResult.add("Seis Sigma");
        expResult.add("Variación en el p");
        expResult.add("pacientes");
        expResult.add("primera asistencia");
        expResult.add("segunda asistencia");
        expResult.add("sistema de triage");
        expResult.add("tiempo de atención");
        expResult.add("trauma");
        expResult.add("Balance de energía");
        expResult.add("destilación fraccionada o sola");
        expResult.add("etanol");
        expResult.add("fermentación");
        ArrayList result = instance.getFrasesClave();
        assertEquals(expResult, result);
    }


    /**
     * Test of findPaper method, of class AppSingleton.
     */
    //Prueba que regrese el paper deseado
    @Test
    public void testFindPaper() {
        System.out.println("findPaper");
        String tituloPaper = "Disminución de la variación del peso en paquetes del hilo SSP 130x2 en doblado";
        AppSingleton instance = AppSingleton.getInstance();
        List<Papers> Pap = instance.getPapers();
        Papers expResult = Pap.get(0);
        Papers result = instance.findPaper(tituloPaper);
        assertEquals(expResult, result);
    }
    //Prueba que regrese un valor null.
     @Test
    public void testFindPaperNull() {
        System.out.println("findPaper");
        String tituloPaper = "";
        AppSingleton instance = AppSingleton.getInstance();
        Papers expResult = null;
        Papers result = instance.findPaper(tituloPaper);
        assertEquals(expResult, result);
    }

    /**
     * Test of getPapers method, of class AppSingleton.
     */
     //Prueba que regrese la lista correcta
    @Test
    public void testGetPapers_0args() {
        System.out.println("getPapers");
        AppSingleton instance = AppSingleton.getInstance();
        Query q = session.createQuery("from Papers order by orden_revista asc");
        List result = instance.getPapers();
        assertEquals(q.list(), result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getPapers method, of class AppSingleton.
     */
    //Prueba que regrese la lista de papers correcta
    @Test
    public void testGetPapers_String_String() {
        System.out.println("getPapers");
        String vol = "";
        String num = "";
        AppSingleton instance = AppSingleton.getInstance();
        List expResult =  instance.getPapers();
        List result = instance.getPapers(vol, num);
        assertEquals(expResult, result);
       
        
    }

    /**
     * Test of getIdFromTitulo method, of class AppSingleton.
     */
    //Prueba que regrese el ID deseado
    @Test
    public void testGetIdFromTitulo() {
        System.out.println("getIdFromTitulo");
        String titulo = "Mejoramiento del balance de energía en la producción de etanol de aguas mieles del café";
        AppSingleton instance= AppSingleton.getInstance();

        int expResult = 3;
        int result = instance.getIdFromTitulo(titulo);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetIdFromTituloNull() {
        System.out.println("getIdFromTitulo");
        String titulo = "Null";
        AppSingleton instance= AppSingleton.getInstance();

        int expResult = -1;
        int result = instance.getIdFromTitulo(titulo);
        assertEquals(expResult, result);
    }

    /**
     * Test of getTituloFromId method, of class AppSingleton.
     */
    @Test
    //Prueba que regrese el titulo deseado
    public void testGetTituloFromId() {
        System.out.println("getTituloFromId");
        int id = 1;
        AppSingleton instance = AppSingleton.getInstance();
        String expResult = "Disminución de la variación del peso en paquetes del hilo SSP 130x2 en doblado";
        String result = instance.getTituloFromId(id);
        assertEquals(expResult, result);   
    }
    
    //Prueba que regrese un valor null
    @Test
    public void testGetTituloFromIdNull() {
        System.out.println("getTituloFromId");
        int id = 19999;
        AppSingleton instance = AppSingleton.getInstance();
        String result = instance.getTituloFromId(id);
        assertNull(result);  
    }

    /**
     * Test of getTitulosPaper method, of class AppSingleton.
     */
    //Prueba que regrese la lista de titulos en el orden correcto
    @Test
    public void testGetTitulosPaper() {
        System.out.println("getTitulosPaper");
        AppSingleton instance = AppSingleton.getInstance();
        ArrayList expResult = new ArrayList();
        expResult.add("Disminución de la variación del peso en paquetes del hilo SSP 130x2 en doblado");
        expResult.add("Reducción de defectos en el proceso de soldadura por ola de componentes electrónicos");
        expResult.add("Proyecto de establecimiento de un hato lechero en Villanueva, Cortés");
        expResult.add("Influencia del clima organizacional sobre la satisfacción laboral en los empleados de la municipalidad de Choloma");
        expResult.add("Análisis del valor capital y posicionamiento de la marca FROOTS en San Pedro Sula");
        expResult.add("El arbitraje de inversiones del CIADI y la Ley para la Promoción y Protección de Inversores de Honduras");
        expResult.add("Mejoramiento de los tiempos de atención de emergencia en el hospital Dr. Mario Catarino Rivas");
        expResult.add("Mejoramiento del balance de energía en la producción de etanol de aguas mieles del café");
        expResult.add("Integrando la metodología DMAIC de Seis Sigma con la simulación de eventos discretos en Flexsim");
        ArrayList result = instance.getTitulosPaper();
        assertEquals(expResult, result);
      
        
    }

    /**
     * Test of getPaperBlob method, of class AppSingleton.
     */
    //Prueba que regrese un valor null
    @Test
    public void testGetPaperBlobNull() {
        System.out.println("getPaperBlob");
        int id = 0;
        AppSingleton instance = AppSingleton.getInstance();
        byte[] expResult = null;
        byte[] result = instance.getPaperBlob(id);
        assertEquals(expResult, result);
    }

    

    
    /**
     * Test of getPaper method, of class AppSingleton.
     */
    //Prueba que regrese un valor null
    @Test
    public void testGetPaper_intNull() {
        System.out.println("getPaper");
        int Id = 0;
        AppSingleton instance = AppSingleton.getInstance();
        Paper expResult = null;
        Paper result = instance.getPaper(Id);
        assertEquals(expResult, result);
    }
    

    /**
     * Test of getPaper method, of class AppSingleton.
     */
    //Prueba que regrese un valor null
    @Test
    public void testGetPaper_StringNull() {
        System.out.println("getPaper");
        String titulo = "";
        AppSingleton instance = AppSingleton.getInstance();
        Paper expResult = null;
        Paper result = instance.getPaper(titulo);
        assertEquals(expResult, result);
    }
    
    //Prueba que regrese los paper correcto
    @Test
    public void testGetPaper_StringInt() {
        System.out.println("getPaper");
        String titulo = "Disminución de la variación del peso en paquetes del hilo SSP 130x2 en doblado";
        AppSingleton instance = AppSingleton.getInstance();
        int ID = 3;
        Paper expResult = instance.getPaper(1);
        Paper result = instance.getPaper(titulo);
        assertEquals(expResult.getAutores(), result.getAutores());
    }
    
    

    /**
     * Test of getResumen method, of class AppSingleton.
     */
    //Prueba que regrese el resumen del titulo proporcionado.
    @Test
    public void testGetResumen() {
        System.out.println("getResumen");
        String titulo = "Disminución de la variación del peso en paquetes del hilo SSP 130x2 en doblado";
        AppSingleton instance = AppSingleton.getInstance();
        String expResult = "COATS Honduras es una empresa dedicada a la producción de hilos de poliéster y algodón para la manufactura. La investigación se centró en el análisis de la disminución de la variación en el peso de los paquetes del hilo SSP 130X2 que se producen en el área de doblado, esto mediante la implementación de cada una de las fases de la metodología DMAMC de Seis Sigma. El valor óptimo de cada uno de los paquetes debe ser de 1.145 kilogramos los cuales han mostrado una variación arriba de 0.009 kilogramos dando como resultado un peso de 1.154 kilogramos. Esta desigualdad ocasiona que se incurra en costos de subutilización de energía y mano de obra requerida para reprocesar los paquetes defectuosos. La investigación se inició con la recolección de datos y análisis de los mismos, así como también, se llevaron a cabo medidas correctivas con el fin de disminuir esta variación. Mediante la modificaciones en la máquina, la estandarización de las actividades, el compromiso del personal se obtuvo una mejora de 0.0009 kilogramos lo que representa un 89% en el proceso del hilo. Lo que permite proponer implementar la metodología a los distintos tipos de hilo que se producen en el área, obteniendo ahorros significativos de $ 12,970.40 para el primer año.";
        String result = instance.getResumen(titulo);
        assertEquals(expResult, result); 
    }
    //Prueba que regrese null.
    @Test
    public void testGetResumenNull() {
        System.out.println("getResumen");
        String titulo = "Null";
        AppSingleton instance = AppSingleton.getInstance();
        String result = instance.getResumen(titulo);
        assertNull(result); 
    }

    /**
     * Test of getResumen_Eng method, of class AppSingleton.
     */
    //Prueba que regrese el resumen correcto
    @Test
    public void testGetResumen_Eng() {
        System.out.println("getResumen_Eng");
        String titulo = "El arbitraje de inversiones del CIADI y la Ley para la Promoción y Protección de Inversores de Honduras";
        AppSingleton instance = AppSingleton.getInstance();
        String expResult = "No disponible"; 
        String result = instance.getResumen_Eng(titulo);
        assertEquals(expResult, result);     
        
    }
    
    //Prueba que regrese null.
    @Test
    public void testGetResumen_EngNull() {
        System.out.println("getResumen_Eng");
        String titulo = "Mejoramiento";
        AppSingleton instance = AppSingleton.getInstance();
        assertNull(instance.getResumen_Eng(titulo));
           
        
    }
    /**
     * Test of getAutores method, of class AppSingleton.
     */
    @Test
    //Prueba que regrese la lista de autores correcta
    public void testGetAutores() {
        System.out.println("getAutores");
        int idPaper = 8;
        List<String> t = new ArrayList<String>();
        t.add("Claudia María Castro Valle");
        AppSingleton instance = AppSingleton.getInstance();
        List expResult = t;
        List result = instance.getAutores(idPaper);
        assertEquals(expResult, result);    
    }
    
    //Prueba que regrese una lista vacia al mandar un id que no este en la BD.
    @Test
    public void testGetAutoresNull() {
        System.out.println("getAutores");
        int idPaper = 8000;
        List<String> t = new ArrayList<String>();
        AppSingleton instance = AppSingleton.getInstance();
        List result = instance.getAutores(idPaper);
        assertEquals(t, result); 
    }
  

    /**
     * Test of addMessage method, of class AppSingleton.
     */
    //Prueba que tire un exception.
    @Test(expected=Exception.class)
    public void testAddMessage() {
        System.out.println("addMessage");
        String summary = "";
        AppSingleton instance  = AppSingleton.getInstance();
        instance.addMessage(summary);
       
       
    }
}
