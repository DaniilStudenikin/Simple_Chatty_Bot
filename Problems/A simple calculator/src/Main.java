import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        char op = scanner.next().charAt(0);
        long b = scanner.nextLong();

        switch (op) {
            case '+':
                System.out.println((a + b));
                break;
            case '-':
                System.out.println((a - b));
                break;
            case '/':
                if (b == 0)
                    System.out.println("Division by 0! ");
                else
                    System.out.println(a / b);
                break;
            case '*':
                System.out.println((a * b));
                break;
            default:
                System.out.println("Unknown operator");
                break;
        }
    }
}