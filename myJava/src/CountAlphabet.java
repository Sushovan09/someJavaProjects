import java.util.Scanner;
public class CountAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string or word : ");
        String s = sc.nextLine();
        int count = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if((((int)c <= (int)'z'&&(int)c > (int)'a')||((int)c <= (int)'Z'&&(int)c > (int)'A'))&&(c!='e'&&c!='E')&&(c!='i')&&(c!='I')&&(c!='o')&&(c!='I')&&(c!='u')&&(c!='U')){
                count++;
            }
        }
        System.out.println("Number of alphabets excluding Vowels = "+count);
        sc.close();
    }
}
