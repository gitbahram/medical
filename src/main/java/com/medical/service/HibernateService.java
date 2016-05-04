package com.medical.service;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by A.amouzesh on 09/12/15.
 */
@Service
public class HibernateService {
    @Autowired
    private SessionFactory sessionFactory;


    public Query createQuery(String query) {
        return sessionFactory.getCurrentSession().createQuery(query);
    }
}
