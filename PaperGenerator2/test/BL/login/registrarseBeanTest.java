/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.login;

import org.junit.*;
import static org.junit.Assert.*;


public class registrarseBeanTest {
    
    public registrarseBeanTest() {
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
     * Test of registrarse method, of class registrarseBean.
     */
    @Test //(expected = Exception.class)
    public void testRegistrarse() {
        System.out.println("registrarse");
        registrarseBean instance = new registrarseBean();
        instance.registrarse();
        
    }
}
