import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int flag = 0;
        for (int i = a; i <= b; i++) {
            boolean answer = i % n == 0;
            if (answer)
                flag++;
        }
        System.out.println(flag);
    }
}