package com.vsai.leetcode;

public class SolutionDesk {
    public static void main(String[] args) {
        int numBottles = 10;
        int numExchange = 3;
        // exp.output = 15

        int drank = maxBottlesDrunk(numBottles, numExchange);
        System.out.println("drank: " + drank);
    }

    public static int maxBottlesDrunk(int numBottles, int numExchange) {

        int fulls = numBottles;
        int empties = 0;
        int totalDrinks = 0;
        int exchangeValue = numExchange;

        // I will keep on drinking till fulls become 0 or empty bottles aren't available for exchange
        while (fulls > 0 || (empties >= exchangeValue)) {
            // drinks operation
            totalDrinks += fulls;
            empties += fulls;
            fulls = 0;

            // if fulls are zero, then do the exchange operation
            if (empties >= exchangeValue) {
                fulls = 1;
                empties = empties - exchangeValue;
            }
            exchangeValue++;
        }

        return totalDrinks;
    }
}
