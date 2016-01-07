package com.apress.springrecipes.court.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.apress.springrecipes.court.domain.Reservation;
import com.apress.springrecipes.court.service.ReservationService;

public class ReservationSummaryController extends AbstractController {

    private ReservationService reservationService;

    public void setReservationService(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    protected ModelAndView handleRequestInternal(HttpServletRequest request,
            HttpServletResponse response) throws Exception {
        String date =
            ServletRequestUtils.getRequiredStringParameter(request, "date");
        String format =
            ServletRequestUtils.getRequiredStringParameter(request, "format");

        Date summaryDate = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        List<Reservation> reservations =
            reservationService.findByDate(summaryDate);
        return new ModelAndView(format + "Summary", "reservations", reservations);
    }
}
