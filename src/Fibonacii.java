import java.util.Scanner;
public class Fibonacii {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(fibonacci(n));
    }
    static int fibonacci(int n) {
        int num1 = 1;
        int num2 = 1;
        int num3 = 0;
        if (n == 1) return num1;
        else if (n == 2) return num2;
        for (int i = 2; i < n; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        return num3;
    }
}
