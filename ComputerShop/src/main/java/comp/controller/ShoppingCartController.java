/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp.controller;

import comp.model.ShoppingCart;
import comp.util.ControllerException;
import java.util.List;

/**
 *
 * @author PC
 */
public class ShoppingCartController extends Controller<ShoppingCart>{

    @Override
    public List<ShoppingCart> read() {
        return session.createQuery("from ShoppingCart").list();
   }

    @Override
    protected void controlCreate() throws ControllerException {
   }

    @Override
    protected void controlUpdate() throws ControllerException {
   }

    @Override
    protected void controlDelete() throws ControllerException {
  }
    
}
