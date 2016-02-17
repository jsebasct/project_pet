package org.home.dao;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author educacionit
 */
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.home.util.HibernateUtil;

public class GenericDAO<E, PK extends Serializable> {

    public Class getType() {
        ParameterizedType superClass = (ParameterizedType) this.getClass().getGenericSuperclass();
        Type entity = superClass.getActualTypeArguments()[0];
        return (Class) entity;
    }

    public void save(E entity) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction tx = s.beginTransaction();
        s.save(entity);
        tx.commit();
    }

    public void delete(E entity) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction tx = s.beginTransaction();
        s.delete(entity);
        tx.commit();

    }

    public void update(E entity) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction tx = s.beginTransaction();
        s.update(entity);
        tx.commit();

    }

    public E getById(PK id) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = s.beginTransaction();
        E entity = (E) s.get(this.getType(), id);
        tx.commit();
        return entity;
    }

    public List<E> getAll() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        org.hibernate.Transaction tx = s.beginTransaction();
        List<E> entities = s.createQuery("FROM " + getType().getName()).list();
        tx.commit();
        //s.close();
        return entities;
    }

}
