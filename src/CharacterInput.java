import java.util.Scanner;

public class CharacterInput {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input character: ");
        char c = in.next().charAt(0);
        if (Character.isUpperCase(c)) {
            System.out.println("1");
        } else if (Character.isLowerCase(c)) {
            System.out.println("0");
        } else {
            System.out.println("-1");
        }
    }
}
