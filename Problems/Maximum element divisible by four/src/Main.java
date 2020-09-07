import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int answer = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int number = sc.nextInt();
            if (number % 4 == 0) {
                answer = Math.max(answer, number);
            }
        }
        System.out.println(answer);

    }
}