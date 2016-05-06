package com.medical.service.imp;

import com.medical.model.Person;
import com.medical.service.CrudService;
import com.medical.service.inf.ReceptionService;
import org.hibernate.service.spi.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * Created by bahram on 5/6/16.
 */
@Service
public class ReceptionServiceImp implements ReceptionService,Serializable {
    @Autowired
    private CrudService crudService;

    public Person reception(Person person) throws ServiceException {
        return (Person) crudService.save(person);
    }
}
