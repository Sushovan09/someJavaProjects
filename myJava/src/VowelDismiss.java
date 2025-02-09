import java.util.Scanner;
public class VowelDismiss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" enter a words or a string : ");
        String s = sc.nextLine();
        String[] s0 = {"a","e","i","o","u","A","E","I","O","U"};
        for (String so: s0) {
            s=s.replaceAll(so,"");
        }
        System.out.println(s);
        sc.close();
    }
}
