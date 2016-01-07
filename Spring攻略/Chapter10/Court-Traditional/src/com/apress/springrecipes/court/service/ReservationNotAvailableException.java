package com.apress.springrecipes.court.service;

import java.util.Date;

public class ReservationNotAvailableException extends RuntimeException {

    private String courtName;
    private Date date;
    private int hour;

    public ReservationNotAvailableException(String courtName, Date date, int hour) {
        this.courtName = courtName;
        this.date = date;
        this.hour = hour;
    }

    public String getCourtName() {
        return courtName;
    }

    public Date getDate() {
        return date;
    }

    public int getHour() {
        return hour;
    }
}
