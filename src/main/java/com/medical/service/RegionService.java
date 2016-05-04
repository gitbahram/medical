package com.medical.service;

import com.medical.model.Region;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by A.amouzesh on 09/12/15.
 */
@Service
public class RegionService {

    @Autowired
    private HibernateService hibernateService;

    @Transactional(readOnly = true)
    public List<Region> findRegionsByName(String name) {
        return hibernateService.createQuery("from Region where regionName like :name").setParameter("name", "%" +
                name +
                "%").list();
    }

    @Transactional(readOnly = true)
    public List<Region> findAll() {
        return hibernateService.createQuery("from Region").list();
    }
}
