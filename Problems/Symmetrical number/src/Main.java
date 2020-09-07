import java.util.Random;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int number = scanner.nextInt();
        int n1 = number / 1000;
        int n2 = number % 1000 / 100;
        int n3 = number / 10 % 10;
        int n4 = number % 10;
        if (n1 == n4 && n2 == n3) {
            System.out.println(1);
        } else{
            System.out.println(random.nextInt());
        }
    }
}
