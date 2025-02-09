import java.io.*;
import java.util.Scanner;
public class CreateFile {
    public static void main(String[] args) {
        PrintStream ps =null;
        FileOutputStream fout = null;
        System.out.println("enter two numbers : ");
        Scanner sc = new Scanner(System.in);
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        double[]  arr ={(a+b),(a-b),(a*b),(a/b)};
            try {
                fout = new FileOutputStream("lkl.txt");
                ps = new PrintStream(fout);
                for (int i=0; i<4; i++) {
                    ps.print(" "+arr[i]);
                }
            } catch (IOException i1) {
                System.out.println("io exception occurred");
            }
            finally{
                try {
                    if(fout!=null) {
                        fout.close();
                        ps.close();
                    }
            }
            catch(IOException i2){
                System.out.println("io exception occurred");
            }
        }
    }
}
