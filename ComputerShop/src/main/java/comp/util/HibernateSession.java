/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp.util;

import org.hibernate.Session;

import java.util.List;
import org.hibernate.Session;


/**
 *
 * @author PC
 */
public class HibernateSession {
    
    public static void odradiPosao() {

        Session s = HibernateUtil.getSession();

        s.beginTransaction();
        
        
        
        
        
        
       s.getTransaction().commit();
    }
    
}
