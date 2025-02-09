import java.util.Scanner;

class Customer{                                                          //CUSTOMER CLASS
    private String customerName;
    private String pinCode;
    private String cakeType;
    private int quantity;
    Customer(String s1, String s2, String s3, int s4){                  //PARAMETERIZED CONSTRUCTOR
        customerName=s1;
        pinCode=s2;
        cakeType=s3;
        quantity=s4;
    }
    String getCustomerName(){
        return customerName;
    }
    void setCustomerName(String s){ customerName = s; }
    String getPinCode(){
        return pinCode;
    }
    void setPinCode(String s){ pinCode = s; }
    String getCakeType(){
        return cakeType;
    }
    void setCakeType(String s){
        cakeType = s;
    }
    int getQuantity(){
        return quantity;
    }
    void setQuantity(int s){
        quantity = s;
    }

}
class CustomerUtility{                                                 //CUSTOMERuTILITY CLASS
    Customer[] customerArray;
    int x;
    public void addValidCustomerOrder(String[] records) {
        customerArray = new Customer[records.length];
        int j = 0;
        for (String s : records) {
            int counter;
            String[] data = s.split(":");                                  //INTERSECTING THE PIN
            for(int i =0; i<4; i++){
                data[i]=data[i].replaceAll(" ","");                  //removing blank spaces
            }
            if (data[1].length() != 6) {                //error in length
                continue;
            }
            int c = 0;
            int k;
            int a = Integer.parseInt(data[1]);
            for (int i = 0; i < 6; i++) {                                            //CHECKING THE VALIDITY OF THE PIN
                k = a % 10;
                a = a / 10;
                if (i == 5 && k == 0) {
                    c = 1;
                    //break;
                }
            }
            if (c == 1 || a != 0) {
                continue;
            }
            customerArray[j] = new Customer(data[0],data[1],data[2],Integer.parseInt(data[3]));                  //INITIALIZING CUSTOMERuTILITY OBJECT
            j++;
        }
        x=j;
    }
    public String[] calculateTotalBill(){
            String[] customerBill = new String[x];               //PROBLEM LINE
            String[] cakeType = {"BlackForest","Chocolate","RedVelvet"};
            int[] price ={500,450,650};
            int count = 0;
            double priceOfCake;
            for (int k=0; k < x; k++) {
                priceOfCake = 0.0;
                for(int i=0 ; i<3 ; i++){
                   if(customerArray[k].getCakeType().equals(cakeType[i])){
                       priceOfCake = price[i]*customerArray[k].getQuantity();                    //CALCULATING AMOUNT
                   }
               }
               customerBill[count]=customerArray[k].getCustomerName()+":"+customerArray[k].getPinCode()+":"+customerArray[k].getCakeType()+":"+customerArray[k].getQuantity()+":"+priceOfCake;
               count++;
            }
            return customerBill;
    }
}

public class CakeShopMain {                                                         //MAIN CLASS
    public static void main(String[] args) {                                        //MAIN FUNCTION
        System.out.println("Enter the number of customer orders");
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] t = new String[n];
        for(int i=0 ;i<n ; i++){                                                    //SCANNING VALUE
            t[i] = sc.nextLine();
        }
        CustomerUtility u = new CustomerUtility();                                  //CREATING CUSTOMERuTILITY OBJECT
        u.addValidCustomerOrder(t);
        t=u.calculateTotalBill();
        int i = 0;
        for (String s : t ) {                                                       //PRINTING VALUE
            System.out.println(s);
            i++;
        }
        if(i==0){
            System.out.println("No valid customer order found");                    //IF THERE IS NO VALID CUSTOMER
        }
    }
}
