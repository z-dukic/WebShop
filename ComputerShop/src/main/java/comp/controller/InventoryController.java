/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp.controller;

import comp.model.Inventory;
import comp.util.ControllerException;
import java.util.List;

/**
 *
 * @author PC
 */
public class InventoryController extends Controller<Inventory> {

    //List inventory
    @Override
    public List<Inventory> read() {
        return session.createQuery("from Inventory").list();

    }
    
  

    //Create control for inventory
    @Override
    protected void controlCreate() throws ControllerException {
        controlStock(); //to-do

    }

    //Update control for inventory
    @Override
    protected void controlUpdate() throws ControllerException {
    }

    //Delete control for inventory
    @Override
    protected void controlDelete() throws ControllerException {

    }

    private void controlStock() {
    }

 

}
