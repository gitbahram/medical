package com.medical.web;

import com.medical.model.Person;
import com.medical.service.CrudService;
import com.medical.service.inf.ReceptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.webflow.action.MultiAction;
import org.springframework.webflow.execution.Event;

import java.io.Serializable;

/**
 * Created by bahram on 5/6/16.
 */
@Component(value = "receptionAction")
public class ReceptionAction extends MultiAction implements Serializable {
    @Autowired
    ReceptionService receptionService;

    public Event receptionAction(Person person) {
        person.getAddress();
        receptionService.reception(person);
        return success();
    }

    public void setReceptionService(ReceptionService receptionService) {
        this.receptionService = receptionService;
    }
}
