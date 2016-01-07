package com.apress.springrecipes.court.service;

import java.util.List;

import com.apress.springrecipes.court.domain.Reservation;
import com.apress.springrecipes.court.domain.SportType;

public interface ReservationService {

    public void make(Reservation reservation)
            throws ReservationNotAvailableException;

    public List<SportType> getAllSportTypes();

    public SportType getSportType(int sportTypeId);
}
