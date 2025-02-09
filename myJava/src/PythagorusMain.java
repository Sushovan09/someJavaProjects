import java.util.Scanner;
public class PythagorusMain {
    public static void main(String[] args) {
        int testVal = 0,st=0,nd=0,rd=0;
        int[] val = new int[3];
        System.out.print("enter 3 numbers : ");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            val[i] = sc.nextInt();
        }
        if(val[0]>val[1] && val[0]>val[2]){
            st = val[0];
            if(val[1]>val[2]) {
                nd = val[1];
                rd = val[2];
            }
            else{
                rd=val[1];
                nd=val[2];
            }
        }
        else if(val[0]>val[1] || val[0]>val[2]){
            nd = val[0];
            if(val[1]>val[2]) {
                st = val[1];
                rd = val[2];
            }
            else{
                rd=val[1];
                st=val[2];
            }
        }
        else if(val[0]<val[1] || val[0]<val[2]){
            rd = val[0];
            if(val[1]>val[2]) {
                st = val[1];
                nd = val[2];
            }
            else{
                nd=val[1];
                st=val[2];
            }
        }
        if(nd==st){
            System.out.println("not triplet");
            return;
        }
        if((rd*rd)+(nd*nd)==st*st){             //if((val[0]*val[0])+(val[1]*val[1])==val[2]*val[2]||(val[1]*val[1])+(val[2]*val[2])==val[0]*val[0]||(val[0]*val[0])+(val[2]*val[2])==val[1]*val[1])
            System.out.println("triplet");
        }
        else{
            System.out.println("not triplet");
        }
        sc.close();
    }
}
