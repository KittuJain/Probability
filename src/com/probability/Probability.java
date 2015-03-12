package com.probability;

public class Probability {
    private double total_outcomes;
    private double favourable_outcomes;

    Probability(double favourable_outcomes, double total_outcomes){
        this.favourable_outcomes = favourable_outcomes;
        this.total_outcomes = total_outcomes;
    }
    public Double calculateProbability() {
        if(favourable_outcomes > total_outcomes)
            return null;
        return ((double)favourable_outcomes/total_outcomes);
    }
}
