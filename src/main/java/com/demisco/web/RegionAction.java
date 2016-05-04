package com.demisco.web;

import com.demisco.model.Region;
import com.demisco.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.RequestContext;
import org.springframework.webflow.action.MultiAction;
import org.springframework.webflow.execution.Event;

import java.util.List;

/**
 * Created by A.amouzesh on 16/12/15.
 */
@Component(value = "regionAction")
public class RegionAction extends MultiAction{

    @Autowired
    private RegionService regionService;

    public void hello(){
        System.out.println("SALAM");
    }

    public List<Region> loadAllRegions(){
        return regionService.findAll();
    }

    public Event checkCurrentState(RequestContext context){
        System.out.println("checkCurrentState");
        return error();
    }
}
