package com.medical.service.inf;

import com.medical.model.Person;
import org.hibernate.service.spi.ServiceException;

/**
 * Created by bahram on 5/6/16.
 */
public interface ReceptionService {
    Person reception(Person person) throws ServiceException;
}
