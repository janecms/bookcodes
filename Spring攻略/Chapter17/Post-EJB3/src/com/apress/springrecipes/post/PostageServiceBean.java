package com.apress.springrecipes.post;

import javax.ejb.Remote;
import javax.ejb.Stateless;

@Stateless
@Remote( { PostageService.class })
public class PostageServiceBean implements PostageService {

    public double calculatePostage(String country, double weight) {
        return 1.0;
    }
}
