/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.login;

import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import org.junit.*;
import static org.junit.Assert.*;
import tablas.Usuarios;


public class tableControllerTest {
    DataModel losusers;
    Helperclass helper;
    
    
    
    
    
    public tableControllerTest() {
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
     * Test of getSelected method, of class tableController.
     */
    //Prueba que la funcion regrese el valor correcto
    @Test
    public void testGetSelected() {
        System.out.println("getSelected");
        tableController instance = new tableController();
        Usuarios expResult = instance.getSelected();
        Usuarios result = instance.getSelected();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getUsuarios method, of class tableController.
     */
    //Prueba que siempre regrese el valor correcto
    @Test
    public void testGetUsuarios() {
        System.out.println("getUsuarios");
        tableController instance = new tableController();

        DataModel expResult = instance.getUsuarios();
        DataModel result = instance.getUsuarios();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of prepareView method, of class tableController.
     */
    //Prueba que regrese el valor indicado
    @Test
    public void testPrepareView() {
        System.out.println("prepareView");
        tableController instance = new tableController();
        String expResult = "browse";
        String result = instance.prepareView();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setUser method, of class tableController.
     */
    @Test
    public void testSetUser() {
        System.out.println("setUser");
        String u = "Prueba";
        tableController instance = new tableController();
        instance.setUser(u);
        String expected = "Prueba";
        assertEquals(expected, instance.getUser());
    }

    /**
     * Test of setPass method, of class tableController.
     */
    @Test
    public void testSetPass() {
        System.out.println("setPass");
        String p = "";
        tableController instance = new tableController();
        instance.setPass(p);
        
    }

    /**
     * Test of getUser method, of class tableController.
     */
    //Prueba que regrese un valor null
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        tableController instance = new tableController();
        String expResult = null;
        String result = instance.getUser();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getPass method, of class tableController.
     */
    //Prueba que regrese un valor null
    @Test
    public void testGetPass() {
        System.out.println("getPass");
        tableController instance = new tableController();
        String expResult = null;
        String result = instance.getPass();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getNombre method, of class tableController.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        tableController instance = new tableController();
        String expResult = null;
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of isFallo method, of class tableController.
     */
    @Test
    public void testIsFallo() {
        System.out.println("isFallo");
        tableController instance = new tableController();
        boolean expResult = false;
        boolean result = instance.isFallo();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setFallo method, of class tableController.
     */
    @Test
    public void testSetFallo() {
        System.out.println("setFallo");
        boolean fallo = false;
        tableController instance = new tableController();
        instance.setFallo(fallo);
        assertFalse(instance.isFallo());
    }

    /**
     * Test of validar method, of class tableController.
     */
    //Prueba que tire un exception
    @Test  (expected = Exception.class)
    public void testValidar() {
        System.out.println("validar");
        tableController instance = new tableController();
        instance.validar();
        
    }

    /**
     * Test of isLogged method, of class tableController.
     */
    
    //Prueba que la funcion verifica si hay usuarion en linea
    @Test 
    public void testIsLogged() throws Exception {
        System.out.println("isLogged");
        tableController instance = new tableController();
        boolean expResult = false;
        boolean result = instance.isLogged();
        assertEquals(expResult, result);  
    }

    /**
     * Test of redirect method, of class tableController.
     */
    //Prueba que tire un exception
    @Test (expected = Exception.class)
    public void testRedirect() {
        System.out.println("redirect");
        tableController instance = new tableController();
        instance.redirect();
       
    }

    /**
     * Test of logout method, of class tableController.
     */
    //Prueba que tire un exception
    @Test (expected = Exception.class)
    public void testLogout() {
        System.out.println("logout");
        tableController instance = new tableController();
        instance.logout();
        
    }
}
