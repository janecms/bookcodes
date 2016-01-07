package com.apress.springrecipes.travel.flight;

import java.util.List;

import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.AbstractController;

public class FlightListController extends AbstractController {

    private FlightService flightService;

    public void setFlightService(FlightService flightService) {
        this.flightService = flightService;
    }

    public ModelAndView handleRenderRequestInternal(
            RenderRequest request, RenderResponse response) throws Exception {
        List<Flight> flights = flightService.findTodayFlights();
        PortletPreferences preferences = request.getPreferences();
        String timeZone = preferences.getValue("timeZone", null);
        return new ModelAndView("flightList", "flights", flights)
                .addObject("timeZone", timeZone);
    }
}
