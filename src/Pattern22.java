import java.util.Scanner;
public class Pattern22 {
    static void pattern10(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n*2-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern11(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) start = 1;
            else start = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(start);
                start = 1-start;
            }
            System.out.println();
        }
    }
    static void pattern111(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) start = 1;
            else start = 0;
            for (int j = 0; j < i+1; j++) {
                System.out.print(start + " ");
                start = 1 - start;
            }
            System.out.println();
        }
    }
    static void pattern12(int n) {
        for (int i = 0; i < n; i++) {
            int start = 1;
            for (int j = 0; j < i+1; j++) {
                System.out.print(start+ " ");
                start++;
            }
            for (int j = 0; j < (n-i)*2-2; j++) {
                System.out.print(" ");
            }
            start--;
            for (int j = 0; j < i+1; j++) {
                System.out.print(start + " ");
                start--;
            }
            System.out.println();
        }
    }
    static void pattern13(int n) {
        int start = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
        }
    }
    static void pattern14(int n) {
        for (int i = 0; i < n; i++) {
            int A = 65;
            for (int j = 0; j < i+1; j++) {
                System.out.print((char)A + " ");
                A++;
            }
            System.out.println();
        }
    }
    static void pattern15(int n) {
        for (int i = 0; i < n; i++) {
            int A = 65;
            for (int j = 0; j < n-i; j++) {
                System.out.print((char) A + " ");
                A++;
            }
            System.out.println();
        }
    }
    static void pattern16(int n) {
        int A = 65;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print((char)A + " ");
            }
            A++;
            System.out.println();
        }
    }
    static void pattern17(int n) {
        int A = 65;
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            //print
            for (int j = 0; j < i*2+1; j++) {
                System.out.print((char)A + " ");

            }
            //space
            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern18(int n) {
        for (int i = 0; i < n; i++) {
            int A = 65;
            A = A + n;
            for (int j = 0; j < i+1; j++) {
                A--;
                System.out.print((char) A + " ");
            }
            System.out.println();
        }
    }
    static void pattern19(int n) {
        for (int i = 0; i < n; i++) {
            //print
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < i*2; j++) {
                System.out.print(" ");
            }
            //print
            for (int j = 0; j < n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            //print
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            //space
            for (int j = 0; j < n-(i*2)+1; j++) {
                System.out.print(" ");
            }
            //print
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static void pattern20(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            //space
            for (int j = 0; j < (n-i-1)*2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("* ");
            }
            for (int j = 0; j < Math.ceil((n+i+1)/2); j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern21(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n-1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n-1) {
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        pattern21(n);
    }
}











