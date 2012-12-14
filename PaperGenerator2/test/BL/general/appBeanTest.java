/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.general;

import org.junit.*;
import static org.junit.Assert.*;



public class appBeanTest {
    
    public appBeanTest() {
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
     * Test of getAbr method, of class appBean.
     */
    @Test
    public void testGetAbr() {
        System.out.println("getAbr");
        appBean instance = new appBean();
        String expResult = null;
        String result = instance.getAbr();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setAbr method, of class appBean.
     */
    @Test
    public void testSetAbr() {
        System.out.println("setAbr");
        String abr = "";
        appBean instance = new appBean();
        instance.setAbr(abr);
        
    }

    /**
     * Test of getBio method, of class appBean.
     */
    @Test
    public void testGetBio() {
        System.out.println("getBio");
        appBean instance = new appBean();
        String expResult = null;
        String result = instance.getBio();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of setBio method, of class appBean.
     */
    @Test
    public void testSetBio() {
        System.out.println("setBio");
        String bio = "";
        appBean instance = new appBean();
        instance.setBio(bio);
        
    }

    /**
     * Test of getNombre method, of class appBean.
     */
    @Test
    public void testGetNombre() {
        System.out.println("getNombre");
        appBean instance = new appBean();
        String expResult = null;
        String result = instance.getNombre();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setNombre method, of class appBean.
     */
    @Test
    public void testSetNombre() {
        System.out.println("setNombre");
        String nombre = "";
        appBean instance = new appBean();
        instance.setNombre(nombre);
        
    }

    /**
     * Test of isBioVisible method, of class appBean.
     */
    @Test
    public void testIsBioVisible() {
        System.out.println("isBioVisible");
        appBean instance = new appBean();
        boolean expResult = false;
        boolean result = instance.isBioVisible();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setBioVisible method, of class appBean.
     */
    @Test
    public void testSetBioVisible() {
        System.out.println("setBioVisible");
        boolean bioVisible = false;
        appBean instance = new appBean();
        instance.setBioVisible(bioVisible);
        
    }

    /**
     * Test of setBioInfo method, of class appBean.
     */
    //Prueba que asigne los daots correctamente
    @Test
    public void testSetBioInfo() {
        System.out.println("setBioInfo");
        String nombre = "Jared";
        appBean instance = new appBean();
        String expected = "Jared R. Ocampo, M. Sc.";
        instance.setBioInfo(nombre);
        assertEquals(expected,instance.getNombre());
    }

    /**
     * Test of getPaper method, of class appBean.
     */
    @Test
    public void testGetPaper() {
        System.out.println("getPaper");
        String titulo = "";
        appBean instance = new appBean();
        Paper expResult = null;
        Paper result = instance.getPaper(titulo);
        assertEquals(expResult, result);
        
    }
}
