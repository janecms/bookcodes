package com.apress.springrecipes.court.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.validation.Errors;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractWizardFormController;

import com.apress.springrecipes.court.domain.PeriodicReservation;
import com.apress.springrecipes.court.domain.PeriodicReservationValidator;
import com.apress.springrecipes.court.domain.Player;
import com.apress.springrecipes.court.service.ReservationService;

public class PeriodicReservationController extends AbstractWizardFormController {

    private ReservationService reservationService;

    public PeriodicReservationController() {
        setCommandName("reservation");
    }

    public void setReservationService(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    protected Object formBackingObject(HttpServletRequest request)
            throws Exception {
        PeriodicReservation reservation = new PeriodicReservation();
        reservation.setPlayer(new Player());
        return reservation;
    }

    protected void initBinder(HttpServletRequest request,
            ServletRequestDataBinder binder) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                dateFormat, true));
    }

    protected Map referenceData(HttpServletRequest request, int page)
            throws Exception {
        Map referenceData = new HashMap();
        if (page == 1) {
            Map<Integer, String> periods = new HashMap<Integer, String>();
            periods.put(1, "Daily");
            periods.put(7, "Weekly");
            referenceData.put("periods", periods);
        }
        return referenceData;
    }

    protected void validatePage(Object command, Errors errors, int page) {
        PeriodicReservationValidator validator =
            (PeriodicReservationValidator) getValidator();
        switch (page) {
        case 0:
            validator.validateCourt(command, errors);
            break;
        case 1:
            validator.validateTime(command, errors);
            break;
        case 2:
            validator.validatePlayer(command, errors);
            break;
        }
    }

    protected ModelAndView processFinish(HttpServletRequest request,
            HttpServletResponse response, Object command, BindException errors)
            throws Exception {
        PeriodicReservation reservation = (PeriodicReservation) command;
        reservationService.makePeriodic(reservation);
        return new ModelAndView("reservationSuccessRedirect");
    }

    protected ModelAndView processCancel(HttpServletRequest request,
            HttpServletResponse response, Object command, BindException errors)
            throws Exception {
        return new ModelAndView("welcomeRedirect");
    }
}
