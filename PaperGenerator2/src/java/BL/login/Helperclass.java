/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package BL.login;

import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import tablas.NewHibernateUtil;
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
}
