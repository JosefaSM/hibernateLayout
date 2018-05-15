/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductoDAO;

import Model.Producto;
import Util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author cetecom
 */
public class ProductoDAO {
    public void agregarProducto(Producto producto){
        Transaction tx=null;
        Session sesion=HibernateUtil.getSessionFactory().openSession();
        tx=sesion.beginTransaction();
        sesion.save(producto);
        sesion.getTransaction().commit();
        sesion.flush();
        sesion.close();
    }
}    
