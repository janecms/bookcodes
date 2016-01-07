package com.apress.springrecipes.travel.flight;

import javax.portlet.PortletPreferences;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("VIEW")
public class FlightViewController {

    private FlightService flightService;

    @Autowired
    public FlightViewController(FlightService flightService) {
        this.flightService = flightService;
    }

    @ModelAttribute("timeZone")
    public String getTimeZone(PortletPreferences preferences) {
        return preferences.getValue("timeZone", null);
    }

    @RequestMapping
    public String flightList(ModelMap model) {
        model.addAttribute("flights", flightService.findTodayFlights());
        return "flightList";
    }

    @RequestMapping(params = "action=flightDetail")
    public String flightDetail(
            @RequestParam("flightNo") String flightNo, ModelMap model) {
        model.addAttribute("flight", flightService.findFlight(flightNo));
        return "flightDetail";
    }
}
