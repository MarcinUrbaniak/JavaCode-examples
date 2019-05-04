package com.hurtownia;

public enum ListOfBookstore {

    KRAKOW(145),
    KATOWICE(521.12),
    GDANSK(100),
    WROCLAW(500),
    lODZ(250),
    POZNAN(250);


    private final double costOfTransport;

    ListOfBookstore(double costOfTransport){
        this.costOfTransport = costOfTransport;
    }

    public double getCostOfTransport(){
        return costOfTransport;
    }

}
