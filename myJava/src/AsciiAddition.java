import java.util.Scanner;
public class AsciiAddition {
    public static void main(String[] args) {
        System.out.println("enter two character : ");

        Scanner sc = new Scanner(System.in);
        char[] ch = new char[2];
        ch[0]=sc.next().charAt(0);
        ch[1]=sc.next().charAt(0);
        System.out.println("the sum of ASCII value : "+((int)ch[0]+(int)ch[1]));
        System.out.println("the difference of ASCII value : "+((int)ch[0]-(int)ch[1]));
        sc.close();
    }
}
