import java.util.Scanner;
public class NameChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name : ");
        String[] s = sc.nextLine().split(" ");
        if(s.length!=3){return;};
        System.out.println(s[2]+" "+s[0]+" "+s[1]);
        sc.close();
    }
}
