import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(str.substring(a, b + 1));
    }
}