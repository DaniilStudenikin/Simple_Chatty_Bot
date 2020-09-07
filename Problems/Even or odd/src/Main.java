import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int number = sc.nextInt();
            if (number == 0){
                break;
            } else if (number % 2 == 0){
                System.out.println("even");
            } else {
                System.out.println("odd");
            }
        }
    }
}
