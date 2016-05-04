package com.demisco.web;

import com.demisco.service.RegionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.jasperreports.JasperReportsPdfView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.ws.rs.GET;
import java.io.IOException;

/**
 * Created by A.amouzesh on 09/12/15.
 */
@Controller
@RequestMapping(value = "/welcome")
public class RegionController {

    @Autowired
    private RegionService regionService;

    @RequestMapping(value = "find_all_regions", method = RequestMethod.GET)
    public ModelAndView redirectToHome() {
        ModelAndView view = new ModelAndView("homeView");
        view.addObject("regionList", regionService.findAll());
        return view;
    }

    @RequestMapping(value = "find_all_regions2", method = RequestMethod.GET)
    public ModelAndView viewAllRegionsUsingTiles() {
        ModelAndView view = new ModelAndView("home");
        view.addObject("regionList", regionService.findAll());
        return view;
    }

    @RequestMapping(value = "search_region", method = RequestMethod.POST)
    public ModelAndView findRegionByName(
            @RequestParam(value = "regionName", required = true) String regionName) {
        ModelAndView view = new ModelAndView("home");
        view.addObject("regionList", regionService.findRegionsByName(regionName));
        return view;
    }

    @RequestMapping(value = "checkDuplicateRegion",method = RequestMethod.GET)
    public void checkDuplicateRegion( @RequestParam(value = "regionName", required = true) String regionName , HttpServletResponse response){
        try {
            response.sendError(HttpServletResponse.SC_FORBIDDEN);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping(value = "showRegionReport",method = RequestMethod.GET)
    public ModelAndView showRegionReport(@Value("#{regionReport}")
            JasperReportsPdfView regionReport,
            @RequestParam(value = "regionId",required = true) Long regionId ){
        ModelAndView view = new ModelAndView(regionReport);
        view.addObject("regionId",regionId);
        return view;
    }
}
