package com.bhawna.week1.AliceAndHerBakery.AliceAndHerBakery;

import org.springframework.stereotype.Service;

@Service
public class CakeBaker {

    private final Frosting frosting;
    private final Syrup syrup;

    public CakeBaker(Frosting frosting, Syrup syrup){
        this.frosting = frosting;
        this.syrup = syrup;
    }
    String cakeBake() {

        return "Baking a cake with " + frosting.getFrostingType() + " and " + syrup.getSyrupType();
    }
}
