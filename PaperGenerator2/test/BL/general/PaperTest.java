/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.general;

import java.util.ArrayList;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;


public class PaperTest {
    
    public PaperTest() {
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
     * Test of getResumen_eng method, of class Paper.
     */
    @Test
    public void testGetResumen_eng() {
        System.out.println("getResumen_eng");
        Paper instance = new Paper();
        String expResult = "Prueba";
        instance.setResumen_eng("Prueba");
        String result = instance.getResumen_eng();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setResumen_eng method, of class Paper.
     */
    @Test
    public void testSetResumen_eng() {
        System.out.println("setResumen_eng");
        String resumen_eng = "Prueba";
        Paper instance = new Paper();
        String expected = "Prueba";
        instance.setResumen_eng(resumen_eng);
        assertEquals(expected, instance.getResumen_eng());
        
    }

    /**
     * Test of getAutores method, of class Paper.
     */
    @Test
    public void testGetAutores() {
        System.out.println("getAutores");
        Paper instance = new Paper();
        List expResult = null;
        List result = instance.getAutores();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setAutores method, of class Paper.
     */
    @Test
    public void testSetAutores() {
        System.out.println("setAutores");
        List<String> autores = null;
        Paper instance = new Paper();
        instance.setAutores(autores);
        
    }

    /**
     * Test of getIdPaper method, of class Paper.
     */
    @Test
    public void testGetIdPaper() {
        System.out.println("getIdPaper");
        Paper instance = new Paper();
        int expResult = 0;
        int result = instance.getIdPaper();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setIdPaper method, of class Paper.
     */
    @Test
    public void testSetIdPaper() {
        System.out.println("setIdPaper");
        int idPaper = 0;
        Paper instance = new Paper();
        instance.setIdPaper(idPaper);
        
    }

    /**
     * Test of getResumen method, of class Paper.
     */
    @Test
    public void testGetResumen() {
        System.out.println("getResumen");
        Paper instance = new Paper();
        String expResult = null;
        String result = instance.getResumen();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setResumen method, of class Paper.
     */
    @Test
    public void testSetResumen() {
        System.out.println("setResumen");
        String resumen = "";
        Paper instance = new Paper();
        instance.setResumen(resumen);
        
    }

    /**
     * Test of getTitulo method, of class Paper.
     */
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        Paper instance = new Paper();
        String expResult = null;
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTitulo method, of class Paper.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String titulo = "";
        Paper instance = new Paper();
        instance.setTitulo(titulo);
        
    }

    /**
     * Test of getFrases_clave method, of class Paper.
     */
    @Test
    public void testGetFrases_clave() {
        System.out.println("getFrases_clave");
        Paper instance = new Paper();
        ArrayList expResult = new ArrayList();
        ArrayList result = instance.getFrases_clave();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFrases_clave method, of class Paper.
     */
    @Test
    public void testSetFrases_clave() {
        System.out.println("setFrases_clave");
        ArrayList<String> frases_clave = null;
        Paper instance = new Paper();
        instance.setFrases_clave(frases_clave);
        
    }
}
