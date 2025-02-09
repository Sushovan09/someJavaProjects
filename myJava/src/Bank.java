import java.util.Scanner;
import java.io.*;
class User{
    private String username;
    private String pin;
    private String pin2;
    private String dob;
    public double amount;
    User(){ super();}
    public String getUsername() { return username; }
    public String getPin() { return pin; }
    public String getPin2() { return pin2; }
    public String getDob() { return dob; }
    public double getAmount() { return amount; }

    public void setUsername(String username) { this.username = username; }
    public void setPin(String pin) { this.pin = pin; }
    public void setPin2(String pin2) { this.pin2 = pin2; }
    public void setDob(String dob) { this.dob = dob; }
    public void setAmount(double amount) { this.amount = amount; }
}
class Encapsulate {
    private static long[] encapVal(String str,String pin1,String pin2) {                    //first call the method by String "*" for the pin checkin purpose
        int iz = 0, jz = 0, i = 0, a = 0;
        long j = 0, c =0 , b =0 , i2 =0 , encriptVal = Long.getLong(pin1), encriptVal2 = Long.getLong(pin2), i1 = 0;        //have to make i a long   encriptVal=99991,encriptVal2=99991,
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
        return arr;
    }
    private static String encapBreakVal(long[] arr, String pin1, String pin2){
        int iz = 0, jz = 0, i = 0, a = 0;
        long j = 0, c =0 , b =0 , i2 =0 , encriptVal = Long.getLong(pin1), encriptVal2 = Long.getLong(pin2), i1 = 0;        //have to make i a long   encriptVal=99991,encriptVal2=99991,
        char ch1='\u0000';
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
                    if(iz==0 && ch1!='*') {return null;}                // checking if pins are right   // < very important >
                    else if(iz==0 && ch1=='*'){a++;}
                    else {
                        charArr[a] = ch1;          //encriptedBreaking value as output
                        a++;
                    }
                }
                if(c==0)
                {
                    i1++;
                }
            }
        }
        return charArr.toString();
    }
}
class CreateUser {
    boolean createAUser() {
        User user1 = null;
        user1 = new User();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        user1.setUsername(sc.nextLine());
        System.out.println("Enter your date of birth <DD.MM.YYYY> : ");
        user1.setDob(sc.nextLine());
        System.out.println("Enter the amount you want to deposit to start your account : ");
        user1.setAmount(sc.nextDouble());

        String dirName = "bank";
        File f = new File(dirName);
        //dirName.
        String[] str = f.list();
        for (String s1 : str) {
            File f2 = new File(dirName + "/" + s1);
            if (f2.equals(user1.getUsername() + "|" + user1.getDob())) {
                return false;
            } else {
                System.out.println(s1 + " is a file");
            }
        }
        return true;
    }
}

//class Bank {
//}
