/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarcaDAO;

import Model.Marca;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author cetecom
 */
public class MarcaDAO {
    public void agregarMarca(Marca marca){
        Transaction tx=null;
        Session sesion=HibernateUtil.getSessionFactory().openSession();
        tx=sesion.beginTransaction();
        sesion.save(marca);
        sesion.getTransaction().commit();
        sesion.flush();
        sesion.close();
    }
}
