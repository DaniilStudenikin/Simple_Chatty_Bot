import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNum = sc.nextInt();
        int printedNumbers = 0;
        for (int i = 1; i <= totalNum; i++) {
            if (printedNumbers == totalNum)
                break;
            else {
                for (int j = 1; j <= i; j++) {
                    if (printedNumbers == totalNum)
                        break;
                    printedNumbers++;
                    System.out.print(i + " ");
                }
            }
        }
    }
}