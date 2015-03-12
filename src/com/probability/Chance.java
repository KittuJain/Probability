package com.probability;

public class Chance {
    private double probability;

    public Chance(double probability){
        this.probability = probability;
    }

    public boolean isProbabilityValid(){
        return (probability > 0 && probability < 1);
    }
}
