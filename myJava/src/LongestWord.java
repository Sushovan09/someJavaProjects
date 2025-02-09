import java.util.Scanner;
public class LongestWord {
    public static void main(String[] args) {
        System.out.println("enter a string or a sentence : ");
        Scanner sc = new Scanner(System.in);
        String[] ss = sc.nextLine().split(" ");
        int max = 0;
        int counter = 0;
        int i = 0;
        for (String s : ss ) {
            if(s.length()>max){
                max= s.length();
                counter = i;
            }
            i++;
        }
        System.out.println(" the longest word : "+ss[counter]+" The length od the word : "+max);
        sc.close();
    }
}
