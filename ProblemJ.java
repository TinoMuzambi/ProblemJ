import java.util.Scanner;

/**
 * @author Tino Muzambi
 * @version 2019/01/12 1:29 PM
 */

public class ProblemJ {

    public static void main(String[] args) {
        int p, a, b, c, d, n;
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            p=in.nextInt();
            a=in.nextInt();
            b=in.nextInt();
            c=in.nextInt();
            d=in.nextInt();
            n=in.nextInt();
            Stock stock=new Stock(p,a,b,c,d,n);
            stock.populateArray();
            System.out.println(String.format("%.6f",stock.determineHighestDecline()));
        }
    }
}


//Sample input
/*
42 1 23 4 8 10
100 7 615 998 801 3
100 432 406 867 60 1000
*/
