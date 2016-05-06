package com.medical.service;

import com.medical.model.BaseEntity;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by A.amouzesh on 09/12/15.
 */
@Service
public class CrudService implements Serializable{
    @Autowired
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public Query createQuery(String query) {
        return sessionFactory.getCurrentSession().createQuery(query);
    }

    public BaseEntity save(BaseEntity baseEntity) {
        return (BaseEntity) sessionFactory.getCurrentSession().save(baseEntity);
    }
}
