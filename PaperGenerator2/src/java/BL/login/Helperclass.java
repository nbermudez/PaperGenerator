/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.login;

import BL.general.AppSingleton;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import hibernate_util.NewHibernateUtil;
import java.util.ArrayList;
import tablas.Usuarios;
import tablas.UsuariosNoAprobados;
//import NewHibernateUtil;

/**
 *
 * @author edraza
 */
public class Helperclass {

    Session session = null;

    public Helperclass() {
        this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }

    public List<Usuarios> getUsuarios() {
        List<Usuarios> users = null;

        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Usuarios");
            users = (List<Usuarios>) q.list();
        } catch (Exception ex) {
            ex.printStackTrace();
        }


        return users;
    }

    public Usuarios getUser(String user) {
        Usuarios eluser = null;

        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from Usuarios as users where users.correo='" + user + "'");

            eluser = (Usuarios) q.list().get(0);
            return eluser;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return eluser;

    }

    public List<UsuariosNoAprobados> getUsuariosNoAprobados(){
        List<UsuariosNoAprobados> users = null;
         List<String> correos = new ArrayList<String>();

        try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from UsuariosNoAprobados where aprobado=0");
            users = (List<UsuariosNoAprobados>) q.list();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        /*for(UsuariosNoAprobados u:users){
            
            if(!u.isAprobado()){
            correos.add(u.getCorreo());
            }
        }*/
        
        return users;
       
        
    }
    public void Aprobar(String correo){
        UsuariosNoAprobados user = null;
           try {
            org.hibernate.Transaction tx = session.beginTransaction();
            Query q = session.createQuery("from UsuariosNoAprobados as user where user.correo='" + correo + "'");
            user = ((List<UsuariosNoAprobados>) q.list()).get(0);
            user.setAprobado(true);
             AppSingleton.getInstance().addMessage("Usuario fue aprobado correctamente");
            tx.commit();
           
        } catch (Exception ex) {
            ex.printStackTrace();
        }
           
          
           
    }
    public boolean isAprobado(String correo) {
        List<UsuariosNoAprobados> users = null;

        try {
            
            org.hibernate.Transaction tx = session.beginTransaction();
            
            Query q = session.createQuery("from UsuariosNoAprobados");
            users = (List<UsuariosNoAprobados>) q.list();

            for (int i = 0; i < users.size(); i++) {
                UsuariosNoAprobados us = users.get(i);
                if (us.getCorreo().equals(correo) && us.isAprobado()) {
                    return true;
                }

            }

        } catch (Exception ex) {

            ex.printStackTrace();

        }

        return false;

    }
    
    public void registrar(String nombre,String apellidos,String correo,String pw1,String pw2,boolean terminos)
    {
        try {
            
            org.hibernate.Transaction tx = session.beginTransaction();
            Usuarios user = new Usuarios();
            UsuariosNoAprobados una = new UsuariosNoAprobados();
            if(!nombre.isEmpty() && !apellidos.isEmpty() && !correo.isEmpty() && !pw1.isEmpty() && !pw2.isEmpty())
        {
            if(terminos == true){
            
            if(pw1.equals(pw2)){
                user.setNombres(nombre);
                una.setNombres(nombre);
                user.setApellidos(apellidos);
                una.setApellidos(apellidos);
                user.setCorreo(correo);
                una.setCorreo(correo);
                user.setPassword(pw1);
                una.setPassword(pw1);
                una.setAprobado(false);
                session.save(user);
                session.save(una);
                tx.commit();
                
                AppSingleton.getInstance().addMessage("Success!");
                
              
            }
            
                
            }
            
       
        
        }
        
    }
        catch(Exception ex)
        {
            
        }
        
       
    }
}

