import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = 0;
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number % 4 == 0)
                max = Math.max(max, number);
        }
        System.out.println(max);
    }
}
