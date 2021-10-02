/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp;

import comp.util.HibernateSession;
import comp.view.SplashScreen;

/**
 *
 * @author PC
 */
public class Start {

    public static void main(String[] args) {

        //Starting the app
        new SplashScreen().setVisible(true);

        //Insert customers, products etc.
       // HibernateSession.doWork();
    }
}
