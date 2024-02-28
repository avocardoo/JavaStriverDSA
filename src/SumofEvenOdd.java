import java.util.Scanner;

public class SumofEvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        printSum(n);
    }
    static void printSum(long n) {
        int even = 0;
        int odd = 0;
        while (n != 0) {
            int num =(int) n % 10;
            if (num % 2 == 0) {
                even += num;
            } else {
                odd += num;
            }
            n /= 10;
        }
        System.out.print(even + " " + odd);
    }
}
