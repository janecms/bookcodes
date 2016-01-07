package com.apress.springrecipes.travel.weather;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.AbstractController;

public class WeatherController extends AbstractController {

    private WeatherService weatherService;

    public void setWeatherService(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public ModelAndView handleRenderRequestInternal(
            RenderRequest request, RenderResponse response) throws Exception {
        return new ModelAndView("weatherView",
                "temperatures", weatherService.getMajorCityTemperatures());
    }
}
