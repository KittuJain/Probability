package com.probability;

import org.junit.Test;

import java.util.Date;

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
    public void calculateProbability_does_not_calculate_invalid_probability() {
        Probability pb = new Probability(9,6);
        Double pr = pb.calculateProbability();
        assertNull(pr);
    }
    @Test
    public void calculateProbability_calculates_valid_probability() {
        Probability pb = new Probability(3,6);
        Double pr = pb.calculateProbability();
        assertNotNull(pr);
        assertEquals(0.5,pr,0.1);
    }
}
