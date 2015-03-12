package com.probability;

public class Probability {
    private double probability;


    public Probability(double probability) {
        this.probability = probability;
    }

    public static Probability create(int favourableOutcomes, int allOutcomes) {
        if(favourableOutcomes>allOutcomes || favourableOutcomes <0 || allOutcomes <0)
            return null;
        return (new Probability((double)favourableOutcomes/allOutcomes));
    }

    public Probability and(Probability pbCoin2) {
        return new Probability(probability*pbCoin2.probability);
    }

    public Probability or(Probability pbCoin2) {
        Probability twoCoins = pbCoin2.and(new Probability(probability));
        return new Probability(probability+pbCoin2.probability-twoCoins.probability);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Probability that = (Probability) o;

        if (Double.compare(that.probability, probability) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(probability);
        return (int) (temp ^ (temp >>> 32));
    }
}
