package com.company;

public class BmiService {
    public double calculate(int height, double mass) {
        float index;
        index = (float) (mass / (Math.pow(((float) height / 100), 2)));
        return index;
    }
}
