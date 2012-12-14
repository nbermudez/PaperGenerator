/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.general;

import java.io.IOException;
import org.junit.*;
import static org.junit.Assert.*;



public class PDFHandlerTest {
    
    public PDFHandlerTest() {
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
     * Test of getTitulo method, of class PDFHandler.
     */
    
    @Test
    public void testGetTitulo() {
        System.out.println("getTitulo");
        PDFHandler instance = new PDFHandler();
        String expResult = null;
        String result = instance.getTitulo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setTitulo method, of class PDFHandler.
     */
    @Test
    public void testSetTitulo() {
        System.out.println("setTitulo");
        String expected = "Mejoramiento del balance de energía en la producción de etanol de aguas mieles del café";
        PDFHandler instance = new PDFHandler();
        instance.setTitulo("Mejoramiento del balance de energía en la producción de etanol de aguas mieles del café");
        assertEquals(expected,instance.getTitulo());
        
    }

    /**
     * Test of getIdPaper method, of class PDFHandler.
     */
    @Test
    public void testGetIdPaper() {
        System.out.println("getIdPaper");
        PDFHandler instance = new PDFHandler();
        int expResult = 3;
        instance.setIdPaper(3);
        int result = instance.getIdPaper();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setIdPaper method, of class PDFHandler.
     */
    @Test
    public void testSetIdPaper() {
        System.out.println("setIdPaper");
        int IdPaper = 0;
        PDFHandler instance = new PDFHandler();
        instance.setIdPaper(IdPaper);
        int expected = 1;
        instance.setIdPaper(1);
        assertEquals(expected,instance.getIdPaper());
    }

    /**
     * Test of downloadPDF method, of class PDFHandler.
     */
    @Test (expected = Exception.class)
    public void testDownloadPDF_String() throws Exception {
        System.out.println("downloadPDF");
        String tit = "Mejoramiento del balance de energía en la producción de etanol de aguas mieles del café";
        PDFHandler instance = new PDFHandler();
        instance.downloadPDF(tit);
        
    }

    /**
     * Test of downloadPDF method, of class PDFHandler.
     */
    @Test (expected = Exception.class)
    public void testDownloadPDF_0args() throws Exception {
        System.out.println("downloadPDF");
        PDFHandler instance = new PDFHandler();
        instance.downloadPDF();
        
    }
}
