public class CaseChecker {
    public static void main(String[] args) {
        if(args.length==0){return;}
        for (String s : args) {
            char c = s.charAt(0);
            if((int)c < ((int)'z')+1 && (int)c > ((int)'a')-1) {
                System.out.println(c + " is a letter");
                System.out.println(c + " is in lower case");
            }
            else if((int)c < (int)'Z'+1 && (int)c > (int)'A'-1){
                System.out.println(c + " is a letter");
                System.out.println(c + " is in upper case");
            }
            else if((int) c < (int)'9'+1 && (int)c > (int)'1'-1){
                System.out.println(c + " is a digit");
            }
            else{
                System.out.println(c + " is a spacial character");
            }
    }   }
}
