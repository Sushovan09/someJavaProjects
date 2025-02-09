import java.util.Scanner;
public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s = sc.nextLine().toUpperCase();
        int count = 0 ;
        System.out.print("Enter a character whose frequency is to be checked : ");
        char c = sc.nextLine().toUpperCase().charAt(0);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }
        }
        System.out.println("the frequency of '"+c+"'"+" is "+count+".");
        sc.close();
    }
}
