import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        //creating an empty ArrayList WITH DEAFAULT INITIal capacity
        ArrayList list = new ArrayList<>();
        System.out.println(list.size()); // the default size is 10

        // inserting object in the ArrayList
        list.add("a");
        list.add(20);
        list.add(null);
        list.add("sushovan pan");
        System.out.println(list);

        //list.remove(2);
        //System.out.println(list);/

        list.add(2,"INDIA");
        list.add("great");
        System.out.println(list);
    }
}
