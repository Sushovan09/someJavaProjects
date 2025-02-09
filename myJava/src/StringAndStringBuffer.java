import java.util.Scanner;
public class StringAndStringBuffer implements Cloneable{
    public static void main(String[] args) {
        System.out.println("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

            String f = s1;
            f = f.concat(" is my name");
            System.out.println("The usage of String.concat with String \" is my name\" is : "+f);

            String g = s1.substring(0);
            System.out.println("The usage of String.equals with String is : "+s1.equals(g));

            StringBuffer s2 = new StringBuffer(s1);
            StringBuffer s3 = new StringBuffer(s2);
            s3.setCharAt(5, 'a');
            System.out.println("The usage of StringBuffer.setCharAt(5, 'a')  is : "+s3);

            StringBuffer s4 = new StringBuffer(s2);
            s4.setLength(4);
            System.out.println("The usage of StringBuffer.setLength(4)  is : "+s4);

            StringBuffer s5 = new StringBuffer(s2);
            s5 = s5.append(" is my name.");
            System.out.println("The usage of StringBuffer.append(\" is my name.\") is : "+s5);

            StringBuffer s6 = new StringBuffer(s2);
            s6 = s6.insert(2, 4);
            System.out.println("The usage of StringBuffer.insert(2, 4) is : "+s6);

            StringBuffer s7 = s2;
            System.out.println("The usage of StringBuffer.equals() with StringBuffer \" is my name\" is : "+s2.equals(s7));

    }
}
