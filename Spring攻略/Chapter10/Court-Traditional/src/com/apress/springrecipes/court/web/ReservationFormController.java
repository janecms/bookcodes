package com.apress.springrecipes.court.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.mvc.SimpleFormController;

import com.apress.springrecipes.court.domain.Player;
import com.apress.springrecipes.court.domain.Reservation;
import com.apress.springrecipes.court.domain.SportType;
import com.apress.springrecipes.court.domain.SportTypeEditor;
import com.apress.springrecipes.court.service.ReservationService;

public class ReservationFormController extends SimpleFormController {

    private ReservationService reservationService;

    public ReservationFormController() {
        setCommandName("reservation");
        setBindOnNewForm(true);
        setSessionForm(true);
    }

    public void setReservationService(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    protected void initBinder(HttpServletRequest request,
            ServletRequestDataBinder binder) throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(
                dateFormat, true));
        binder.registerCustomEditor(SportType.class, new SportTypeEditor(
                reservationService));
    }

    protected Object formBackingObject(HttpServletRequest request)
            throws Exception {
        Reservation reservation = new Reservation();
        String username =
            ServletRequestUtils.getStringParameter(request, "username");
        reservation.setPlayer(new Player(username, null));
        return reservation;
    }

    protected Map referenceData(HttpServletRequest request) throws Exception {
        Map referenceData = new HashMap();
        List<SportType> sportTypes = reservationService.getAllSportTypes();
        referenceData.put("sportTypes", sportTypes);
        return referenceData;
    }

    protected void doSubmitAction(Object command) throws Exception {
        Reservation reservation = (Reservation) command;
        reservationService.make(reservation);
    }
}
