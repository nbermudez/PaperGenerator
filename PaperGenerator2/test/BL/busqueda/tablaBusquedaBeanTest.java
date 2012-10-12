/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.busqueda;

import BL.general.Paper;
import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Alejandro
 */
public class tablaBusquedaBeanTest {
    
    public tablaBusquedaBeanTest() {
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
     * Test of getFilteredPapers method, of class tablaBusquedaBean.
     */
    @Test
    public void testGetFilteredPapers() {
        System.out.println("getFilteredPapers");
        tablaBusquedaBean instance = new tablaBusquedaBean();
        List expResult = null;
        List result = instance.getFilteredPapers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilteredPapers method, of class tablaBusquedaBean.
     */
    @Test
    public void testSetFilteredPapers() {
        System.out.println("setFilteredPapers");
        List<Paper> filteredPapers = null;
        tablaBusquedaBean instance = new tablaBusquedaBean();
        instance.setFilteredPapers(filteredPapers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFiltros method, of class tablaBusquedaBean.
     */
    @Test
    public void testGetFiltros() {
        System.out.println("getFiltros");
        tablaBusquedaBean instance = new tablaBusquedaBean();
        List expResult = null;
        List result = instance.getFiltros();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFiltros method, of class tablaBusquedaBean.
     */
    @Test
    public void testSetFiltros() {
        System.out.println("setFiltros");
        List<String> filtros = null;
        tablaBusquedaBean instance = new tablaBusquedaBean();
        instance.setFiltros(filtros);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedPaper method, of class tablaBusquedaBean.
     */
    @Test
    public void testGetSelectedPaper() {
        System.out.println("getSelectedPaper");
        tablaBusquedaBean instance = new tablaBusquedaBean();
        Paper expResult = null;
        Paper result = instance.getSelectedPaper();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedPaper method, of class tablaBusquedaBean.
     */
    @Test
    public void testSetSelectedPaper() {
        System.out.println("setSelectedPaper");
        Paper selectedPaper = null;
        tablaBusquedaBean instance = new tablaBusquedaBean();
        instance.setSelectedPaper(selectedPaper);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPapers method, of class tablaBusquedaBean.
     */
    @Test
    public void testGetPapers() {
        System.out.println("getPapers");
        tablaBusquedaBean instance = new tablaBusquedaBean();
        List expResult = null;
        List result = instance.getPapers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPapers method, of class tablaBusquedaBean.
     */
    @Test
    public void testSetPapers() {
        System.out.println("setPapers");
        List<Paper> papers = null;
        tablaBusquedaBean instance = new tablaBusquedaBean();
        instance.setPapers(papers);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Filtrar method, of class tablaBusquedaBean.
     */
    @Test
    public void testFiltrar_0args() {
        System.out.println("Filtrar");
        tablaBusquedaBean instance = new tablaBusquedaBean();
        instance.Filtrar();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Filtrar method, of class tablaBusquedaBean.
     */
    @Test
    public void testFiltrar_List() {
        System.out.println("Filtrar");
        List<String> filts = null;
        tablaBusquedaBean instance = new tablaBusquedaBean();
        instance.Filtrar(filts);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutores method, of class tablaBusquedaBean.
     */
    @Test
    public void testGetAutores() {
        System.out.println("getAutores");
        String titulo = "";
        tablaBusquedaBean instance = new tablaBusquedaBean();
        List expResult = null;
        List result = instance.getAutores(titulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAutoresAsString method, of class tablaBusquedaBean.
     */
    @Test
    public void testGetAutoresAsString() {
        System.out.println("getAutoresAsString");
        String titulo = "DISMINUCIÓN DE LA VARIACIÓN DEL PESO EN PAQUETES DEL HILO SSP 130X2 EN DOBLADO";
        tablaBusquedaBean instance = new tablaBusquedaBean();
        String expResult = "";
        String result = instance.getAutoresAsString(titulo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of showPaper method, of class tablaBusquedaBean.
     */
    @Test
    public void testShowPaper() {
        System.out.println("showPaper");
        tablaBusquedaBean instance = new tablaBusquedaBean();
        instance.showPaper();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
