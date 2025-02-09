import java.util.Scanner;
public class RealEncrption {
    private static void encapVal(String str) {
        int iz = 0, jz = 0, i = 0, a = 0;
        long j = 0, c =0 , b =0 , i2 =0 , encriptVal = 99991, encriptVal2 = 99991, i1 = 0;        //have to make i a long   encriptVal=99991,encriptVal2=99991,
        //int i,j=0,k,encriptVal=997,encriptVal2=997,i1,i2,b,c;
        long[] arr = new long[str.length()];
        j = str.length();
        String str2 = str.substring(0);
        for (i = 0; i < j; i++) {
            i2 = 0;
            for (i1 = encriptVal2 + 1; i2 <= str2.charAt(i); i1++) {
                c = 0;
                for (b = 2; b <= i1 / 2; b++) {
                    if (i1 % b == 0) {
                        c = 1;
                        break;
                    }
                }
                if (c == 0 && i2 == str2.charAt(i)) {
                    arr[a] = i1 * encriptVal;          //encripted value as output
                    a++;
                }
                if (c == 0) {
                    i2++;
                }
            }
        }
        System.out.println("massege >>>"+str+"\nEncripted massege >>> ");
        for (long ll: arr) {
            System.out.print(ll+"l"+"\t");                                      //output
        }
    }
    private static void encapBreakVal(String str){
        int iz = 0, jz = 0, i = 0, a = 0;
        long j = 0, c =0 , b =0 , i2 =0 , encriptVal = 99991, encriptVal2 = 99991, i1 = 0;        //have to make i a long   encriptVal=99991,encriptVal2=99991,
        char ch1='\u0000';

        String[] str2 = str.split(" ");
        long[] arr = new long[str2.length];
        for(int n = 0; n<str2.length; n++){
            arr[n] = Long.parseLong(str2[n]);
        }

        char[] charArr = new char[arr.length];
        //int i,j=0,k,encriptVal=997,encriptVal2=997,i1,i2,b,c;
        for(iz=0;iz<jz;iz++)
        {
            i1=0;
            for(i2=encriptVal2+1;i2<=arr[iz];i2++)
            {
                c=0;
                for(b=2;b<=i2/2;b++)
                {
                    if(i2%b==0)
                    {
                        c=1;
                        break;
                    }
                }
                if(c==0 && i2==arr[iz])
                {
                    ch1=(char)i1;
                    charArr[a] = ch1;          //encriptedBreaking value as output
                    a++;
                }
                if(c==0)
                {
                    i1++;
                }
            }
        }
        System.out.println(charArr.toString());
    }
    public static void main(String[] args) {
        System.out.println("enter <0> for encript a value, \n<1> for breaking the encription \nor enter any other NUMBER to quit the application ");
        Scanner sc = new Scanner(System.in);
        int a = 0;
        while(true) {
            System.out.print("Enter the value>>>");
            a = Integer.parseInt(sc.nextLine());
            switch (a) {
                case 0:{
                    System.out.println("Enter a String: ");
                    String str = sc.nextLine();
                    RealEncrption.encapVal(str);
                    break;
                }
                case 1:{
                    System.out.println("Enter the encripted massege: ");
                    String str = sc.nextLine();
                    RealEncrption.encapBreakVal(str);
                    break;
                }
                default:
                    sc.close();
                    return;
            }
        }
    }
}
