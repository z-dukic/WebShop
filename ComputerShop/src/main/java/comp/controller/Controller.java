/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comp.controller;

import comp.util.ControllerException;
import comp.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author PC
 */
public abstract class Controller<T> {

    //Hibernate session
    protected Session session;

    //Type of class
    protected T modelEntity;

    //(C(R)UD
    public abstract List<T> read();

    protected abstract void controlCreate() throws ControllerException;

    protected abstract void controlUpdate() throws ControllerException;

    protected abstract void controlDelete() throws ControllerException;

    //Constructor
    public Controller() {
        this.session = HibernateUtil.getSession();
    }

    //Getters and setters
    public T getModelEntity() {
        return modelEntity;
    }

    public void setModelEntity(T modelEntity) {
        this.modelEntity = modelEntity;
    }

    //New entity
    //(C)RUD
    public T create() throws ControllerException {
        controlCreate();
        save();
        return modelEntity;
    }

    //Update entity
    //CR(U)D
    public T update() throws ControllerException {
        controlUpdate();
        save();
        return modelEntity;
    }

    //Delete entity
    //CRU(D)
    public void delete() throws ControllerException {
        controlDelete();
        session.beginTransaction();
        session.delete(modelEntity);
        session.getTransaction().commit();

    }

    //Save entity[
    private void save() {
        session.beginTransaction();
        session.save(modelEntity);
        session.getTransaction().commit();
    }

}
