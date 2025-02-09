public class AccessSpecifiers {
    public int a1;
    private Integer p2;
    public final double pi = 3.4;
    void increasePrint(int a){
        a1 = a++;
        System.out.println(a1);
    }
    void increasePrint(Integer a){
        p2 = a++;
        System.out.println(p2);
    }
}
class AccessSpecifiersMain{
    public static void main(String[] args) {
        AccessSpecifiers as = new AccessSpecifiers();
        int n = 5;
        System.out.println(n);
        as.increasePrint(n);
        System.out.println(n);
        Integer k = 8;
        System.out.println(k);
        as.increasePrint(k);
        System.out.println(k);

        //System.out.println(as.a1);      //we can access a public data member from another class
        //System.out.println(as.p2);      //we cannot access a private data member from another class

        //System.out.println(as.pi);      //we did not get any error because we doesn't change the value of final variable pi
        //System.out.println(as.pi++);    //we did get a error because we change the value of final variable pi
    }
}

