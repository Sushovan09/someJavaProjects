import java.util.Scanner;
public class FrequencyVowel {
    public static void main(String[] args) {
        System.out.print("Enter a String a in upper case : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] v ={'A','E','I','O','U'};
        int[] in = new int[5];
        for(int i = 0; i < s.length(); i++){
            if((int)s.charAt(i)>(int)'a'-1 && (int)s.charAt(i)<(int)'z'+1){
                return;
            }
            for(int j= 0; j<5; j++){
                if(s.charAt(i)==v[j]){
                    in[j]++;
                }
            }
        }
        for(int i = 0; i<5; i++){
            System.out.println("Frequency of '"+v[i]+"' = "+in[i]);
        }
        sc.close();
    }
}
