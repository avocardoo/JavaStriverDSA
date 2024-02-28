import java.util.Scanner;

public class SwitchCase {
    public static double areaSwitchCase(int ch, double []a) {
        // Write your code here
        switch (ch) {
            case 1: {
                double d = 3.14*a[0]*a[0];
                return d;
            }
            case 2: {
                double dd = a[0]*a[1];
                return dd;
            }
            default:
                return 0;
        }
    }
    public static void main(String[] args) {
        double[] a = {3};
        System.out.println(areaSwitchCase(1, a));

    }
}
