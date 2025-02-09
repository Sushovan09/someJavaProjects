import java.util.Scanner;
public class Buzz {
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int bz = Integer.parseInt(sc.nextLine());
        if (bz % 10 == 7 || bz % 7 == 0) {
            System.out.println("given number is a buzz number");
        } else {
            System.out.println("given number is not a buzz number");
        }
        sc.close();
    }
}
