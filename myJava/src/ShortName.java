import java.util.Scanner;
public class ShortName {
    public static void main(String[] args) {
        System.out.print("Enter a name : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] b = s.split(" ");
        if(b.length!=3){return;}
        for ( String ss : b ) {
            System.out.print(ss.charAt(0)+" ");
        }
        sc.close();
    }
}
