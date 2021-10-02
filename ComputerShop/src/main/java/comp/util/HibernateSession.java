/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp.util;

import comp.model.Inventory;
import java.math.BigDecimal;
import org.hibernate.Session;

import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author PC
 */
public class HibernateSession {

    public static void doWork() {

        Session s = HibernateUtil.getSession();

        s.beginTransaction();

        Inventory lenovon570 = new Inventory();
        lenovon570.setName("Lenovo n570");
        lenovon570.setPrice(new BigDecimal(4999.99));
        lenovon570.setQuantity(15);
        lenovon570.setSku(61770);
        s.save(lenovon570);

        Inventory lenovoLegion5 = new Inventory();
        lenovoLegion5.setName("Lenovo Legion 5");
        lenovoLegion5.setPrice(new BigDecimal(7499.99));
        lenovoLegion5.setQuantity(10);
        lenovoLegion5.setSku(61771);
        s.save(lenovoLegion5);

        Inventory toshibaDynabook = new Inventory();
        toshibaDynabook.setName("Toshiba Dynabook");
        toshibaDynabook.setPrice(new BigDecimal(12499.99));
        toshibaDynabook.setQuantity(2);
        toshibaDynabook.setSku(61777);
        s.save(toshibaDynabook);

        s.getTransaction().commit();
    }

}
