package com.apress.springrecipes.court.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.apress.springrecipes.court.domain.Reservation;
import com.apress.springrecipes.court.service.ReservationService;

public class ReservationQueryController extends AbstractController {

    private ReservationService reservationService;

    public void setReservationService(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    public ModelAndView handleRequestInternal(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        String courtName = ServletRequestUtils.getStringParameter(request,
                "courtName");

        List<Reservation> reservations = null;
        if (courtName != null) {
            reservations = reservationService.query(courtName);
        }
        return new ModelAndView("reservationQuery", "courtName", courtName)
                .addObject("reservations", reservations);
    }
}
