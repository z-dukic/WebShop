/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp.controller;

import comp.model.Product;
import comp.util.ControllerException;
import java.util.List;

/**
 *
 * @author PC
 */
public class ProductController extends Controller<Product> {

    @Override
    public List<Product> read() {
        return session.createQuery("from Product").list();
    }

    @Override
    protected void controlCreate() throws ControllerException {
        controlName();
        controlPrice();
        controlAvailability();

    }

    @Override
    protected void controlUpdate() throws ControllerException {
        controlName();
        controlPrice();
        controlAvailability();
    }

    @Override
    protected void controlDelete() throws ControllerException {
    }

    private void controlName() {
        //todo

    }

    private void controlPrice() {
        //todo

    }

    private void controlAvailability() {
        //todo
    }

}
