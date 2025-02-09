import java.util.Scanner;
public class NextAlphabet {
    public static void main(String[] args) {
        System.out.print("enter a character : ");
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if(c=='z'||c=='Z'){
            System.out.println("'" +c+"' follows '"+(char)((int)c-25)+"'");
        }
        else{
            System.out.println("'"+c+"' follows '"+(char)((int)c+1)+"'");
        }
        sc.close();
    }
}
