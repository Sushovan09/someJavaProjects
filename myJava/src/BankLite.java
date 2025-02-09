import java.util.Scanner;
public class BankLite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        if(a<0||a>2000||b<0||b>2000){
            return;
        }
        if(a%5==0&&(double)a<b){
            b=b-(double)a-.50;
        }
        System.out.println(String.format("%.2f",b));
        sc.close();
    }
}
