import java.util.Locale;
import java.util.Scanner;
 class FirstCharUpper {
    public static void main(String[] args){
        System.out.print("Enter a String a in upper case : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for(int i = 0; i < s.length(); i++){
            if((int)s.charAt(i)>(int)'a'-1 && (int)s.charAt(i)<(int)'z'+1){
                return;
            }
        }
        s = s.toLowerCase();
        String[] ss = s.split(" ");
        for (String s1 : ss ) {
            if((int)s1.charAt(0)>(int)'A'-1 && (int)s1.charAt(0)>(int)'Z'+1) {
                s1 = s1.replaceFirst(Character.toString(s1.charAt(0)), Character.toString((int) s1.charAt(0) - 32));
            }
            System.out.print(s1+" ");
        }
        sc.close();
    }

}
