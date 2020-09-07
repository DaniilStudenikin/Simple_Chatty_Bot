import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double m, p, k;
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        m = sc.nextDouble();
        p = sc.nextDouble();
        k = sc.nextDouble();

        while (m < k) {
            m += (m * p / 100);
            ans++;
        }

        System.out.println(ans);
    }
}
