package com.apress.springrecipes.court.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReservationSuccessController {

    @RequestMapping("/reservationSuccess.htm")
    public String reservationSuccess() {
        return "reservationSuccess";
    }
}
