import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int busHeight = sc.nextInt();
        int numberOfBridges = sc.nextInt();
        int[] bridgesHeights = new int[numberOfBridges];
        for (int i = 0; i < bridgesHeights.length; i++) {
            bridgesHeights[i] = sc.nextInt();
        }

        int crush = 0;
        boolean flag = false;
        for (int i = 0; i < bridgesHeights.length; i++) {
            if (busHeight < bridgesHeights[i]) {
                flag = true;
            } else {
                crush = i + 1;
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Will not crash");
        } else {
            System.out.println("Will crash on bridge " + crush);
        }
    }
}