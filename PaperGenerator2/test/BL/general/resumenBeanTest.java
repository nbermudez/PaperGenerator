/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.general;

import org.junit.*;
import static org.junit.Assert.*;



public class resumenBeanTest {
    
    public resumenBeanTest() {
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
     * Test of getPalabrasClaveString method, of class resumenBean.
     */
    //Prueba que tire un exception a dichas funciones
    @Test  (expected = Exception.class)
    public void testGetPalabrasClaveString() {
        System.out.println("getPalabrasClaveString");
        resumenBean instance = new resumenBean();
        String expResult = "Prueba";
        instance.setPalabrasClaveString("Prueba");
        String result = instance.getPalabrasClaveString();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPalabrasClaveString method, of class resumenBean.
     */
    @Test  (expected = Exception.class)
    public void testSetPalabrasClaveString() {
        System.out.println("setPalabrasClaveString");
        String palabrasClaveString = "Prueba";
        resumenBean instance = new resumenBean();
        instance.setPalabrasClaveString(palabrasClaveString);
        
    }

    /**
     * Test of getAutoresString method, of class resumenBean.
     */
    @Test  (expected = Exception.class)
    public void testGetAutoresString() {
        System.out.println("getAutoresString");
        resumenBean instance = new resumenBean();
        String expResult = "";
        String result = instance.getAutoresString();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setAutoresString method, of class resumenBean.
     */
    @Test  (expected = Exception.class)
    public void testSetAutoresString() {
        System.out.println("setAutoresString");
        String autoresString = "";
        resumenBean instance = new resumenBean();
        instance.setAutoresString(autoresString);
       
    }

    /**
     * Test of getPaper method, of class resumenBean.
     */
    @Test  (expected = Exception.class)
    public void testGetPaper() {
        System.out.println("getPaper");
        resumenBean instance = new resumenBean();
        Paper expResult = null;
        Paper result = instance.getPaper();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setPaper method, of class resumenBean.
     */
    @Test  (expected = Exception.class)
    public void testSetPaper_Paper() {
        System.out.println("setPaper");
        Paper paper = null;
        resumenBean instance = new resumenBean();
        instance.setPaper(paper);
        
    }

    /**
     * Test of setPaper method, of class resumenBean.
     */
    @Test (expected = Exception.class)
    public void testSetPaper_String() {
        System.out.println("setPaper");
        String titulo = "";
        resumenBean instance = new resumenBean();
        instance.setPaper(titulo);
        
    }
}
