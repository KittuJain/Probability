package com.probability;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProbabilityTest {

    @Test
    public void isProbabilityValid_returns_true_when_probability_is_point_9(){
        Chance ch = new Chance(0.9);
        assertTrue(ch.isProbabilityValid());
    }

    @Test
    public void isProbabilityValid_returns_false_when_probability_is_1_point_9() {
        Chance ch = new Chance(1.9);
        assertFalse(ch.isProbabilityValid());
    }

    @Test
    public void isProbabilityValid_returns_false_when_probability_is_negative() {
        Chance ch = new Chance(-1.9);
        assertFalse(ch.isProbabilityValid());
    }
    
    @Test
    public void createProbability_does_not_create_invalid_probability() {
        Probability pb = Probability.create(9,6);
        assertNull(pb);
    }

    @Test
    public void createProbability_creates_valid_probability() {
        Probability pb = Probability.create(3, 6);
        assertTrue(pb.equals(Probability.create(3, 6)));
    }

    @Test
    public void ProbabilityOfGettingMultipleOf2OnRollOfDiceIs0Point5() {
        Probability multipleOf2 = Probability.create(3, 6);
        assertTrue(multipleOf2.equals(Probability.create(1, 2)));
    }

    @Test
    public void ProbabilityOfGettingTailsOnBothCoinsIs0Point25() {
        Probability pbCoin1 = Probability.create(1,2);
        Probability pbCoin2 = Probability.create(1,2);
        Probability twoCoins = pbCoin1.and(pbCoin2);
        assertTrue(twoCoins.equals(Probability.create(1, 4)));
    }

    @Test
    public void ProbabilityOfGettingAtLeastOneTailOnTwOCoinsIs0Point75() {
        Probability pbCoin1 = Probability.create(1,2);
        Probability pbCoin2 = Probability.create(1,2);
        Probability twoCoins = pbCoin1.or(pbCoin2);
        assertTrue(twoCoins.equals(Probability.create(3, 4)));
    }
}