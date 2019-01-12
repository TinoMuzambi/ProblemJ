import java.util.*;

/**
 * @author Tino Muzambi
 * @version 2019/01/12 1:57 PM
 * An object of this class
 * represents the stock
 * of a company.
 */

/*
TODO Find a way to determine when stocks are decreasing.
TODO Optimise code.
 */

class Stock {
    private int p, a, b, c, d, n;
    private ArrayList<Double> prices;//2D?
    private HashMap<Double,Integer> price;

    Stock(int p, int a, int b, int c, int d, int n) {
        this.p = p;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.n = n;
    }

    /**
     * Populate array according to
     * given formula and variables.
     */
    void populateArray() {
        prices=new ArrayList<>();
        price=new HashMap<>();
        for (int i = 1; i < n+1; i++) {
            prices.add(p*(Math.sin(a*i+b)+Math.cos(c*i+d)+2));
            price.put(p*(Math.sin(a*i+b)+Math.cos(c*i+d)+2),i);
        }
    }

    /**
     * Determine the highest difference
     * during a time of declining stocks.
     * @return Highest decline.
     */
    double determineHighestDecline() {
        double difference=0;
        double tempDifference;
        for (int i = 0; i < prices.size() ; i++) {
            for (int j = 0; j < prices.size() ; j++) {
                tempDifference = prices.get(i) - prices.get(j);
                if ((tempDifference > difference))
                    difference = tempDifference;
            }
        }
        return difference;
    }
}
