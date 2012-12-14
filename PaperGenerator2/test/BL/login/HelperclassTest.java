/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.login;

import java.util.List;
import org.junit.*;
import static org.junit.Assert.*;
import tablas.Usuarios;
import java.util.ArrayList;
import org.hibernate.Query;
import tablas.*;
import org.hibernate.Session;
import hibernate_util.NewHibernateUtil;


public class HelperclassTest {
    
    Session session = null;
    
    public HelperclassTest() {
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
     * Test of getUsuarios method, of class Helperclass.
     */
    //Prueba que regrese la lista correcta
    @Test
    public void testGetUsuarios() {
        System.out.println("getUsuarios");
        session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        Helperclass instance = new Helperclass();
        List<Usuarios> expResult = null;
        org.hibernate.Transaction tx = session.beginTransaction();
        Query q = session.createQuery("from Usuarios");
        expResult = (List<Usuarios>) q.list();
        List result = instance.getUsuarios();
        assertEquals(expResult, result);     
    }

    /**
     * Test of getUser method, of class Helperclass.
     */
    //Prueba que regrese el usuario correcto
    @Test
    public void testGetUser() {
        System.out.println("getUser");
        String user = "nestor.bermudez@unitec.edu";
       
        Helperclass instance = new Helperclass();
        String expResult = "nestor";
        Usuarios result = instance.getUser(user);
        assertEquals(expResult, result.getNombres());   
    }
    
    //Prueba que regrese un valor null
    @Test
    public void testGetUserNull() {
        System.out.println("getUser");
        String user = "";
        Helperclass instance = new Helperclass();
        Usuarios expResult = null;
        Usuarios result = instance.getUser(user);
        assertEquals(expResult, result);   
    }
    

    /**
     * Test of isAprobado method, of class Helperclass.
     */
    //Prueba que el usuario este aprovado.
    @Test
    public void testIsAprobado() {
        System.out.println("isAprobado");
        String correo = "nestor.bermudez@unitec.edu";
        Helperclass instance = new Helperclass();
        boolean expResult = true;
        boolean result = instance.isAprobado(correo);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testIsAprobadoNull() {
        System.out.println("isAprobado");
        String correo = "";
        Helperclass instance = new Helperclass();
        boolean expResult = false;
        boolean result = instance.isAprobado(correo);
        assertEquals(expResult, result);
    }
    
}
