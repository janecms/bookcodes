package com.apress.springrecipes.travel.flight;

import javax.portlet.PortletPreferences;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.PortletRequestUtils;
import org.springframework.web.portlet.mvc.AbstractController;

public class FlightDetailController extends AbstractController {

    private FlightService flightService;

    public void setFlightService(FlightService flightService) {
        this.flightService = flightService;
    }

    public ModelAndView handleRenderRequestInternal(
            RenderRequest request, RenderResponse response) throws Exception {
        String flightNo = PortletRequestUtils.getRequiredStringParameter(
                request, "flightNo");
        Flight flight = flightService.findFlight(flightNo);
        PortletPreferences preferences = request.getPreferences();
        String timeZone = preferences.getValue("timeZone", null);
        return new ModelAndView("flightDetail", "flight", flight)
                .addObject("timeZone", timeZone);
    }
}
