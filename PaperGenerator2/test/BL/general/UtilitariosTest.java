/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.general;

import java.io.File;
import org.junit.*;
import static org.junit.Assert.*;


public class UtilitariosTest {
    
    public UtilitariosTest() {
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
     * Test of getInstance method, of class Utilitarios.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        Utilitarios expResult = Utilitarios.getInstance();
        Utilitarios result = Utilitarios.getInstance();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of getContents method, of class Utilitarios.
     */
    @Test (expected = Exception.class)
    public void testGetContents() {
        System.out.println("getContents");
        File aFile = null;
        Utilitarios instance = Utilitarios.getInstance();
        String expResult = "";
        String result = instance.getContents(aFile);
        assertEquals(expResult, result);
      
    }
}
