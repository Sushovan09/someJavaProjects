import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListFunctionsDemo {
    public static void main(String[] args) {
        // 1. addAll()
        ArrayList bookName = new ArrayList<String>();
        bookName.add(0,"feluda");
        bookName.add(1,"kakababu");
        bookName.add(2,"automata");
        //initial ArrayList
        System.out.println(bookName);
        //define another array list
        ArrayList moreBooks = new ArrayList(Arrays.asList("java","c++"));
        //we want to add more books collection object in bookName collection object
        //for this purpose we will use addAll() method to add the ArrayList at a particular Index
        bookName.addAll(1,moreBooks);
        // after adding/modification
        System.out.println(bookName);

        // [feluda, kakababu, automata]
        // [feluda, java, c++, kakababu, automata]
        // Process finished with exit code 0

        ArrayList ai = new ArrayList<Integer>();
        ai.add(5);
        ai.add(7);
        ai.add(0,3);
        System.out.println(ai);
        //[3, 5, 7]

        //remove()
        ai.remove(0);
        System.out.println(ai);
        ai.remove(1);
        System.out.println(ai);

        ArrayList s1 = new ArrayList<Integer>();
        ArrayList s2 = new ArrayList<Integer>();
        s1.add(5);
        s1.add(7);
        s2.add(5);
        s2.add(7);
        s2.add(5);
        s2.add(7);
        s2.add(8);
        s2.add(9);
        s2.add(10);
        s2.add(11);
        System.out.println(s1);
        System.out.println(s2);
        s2.removeAll(s1);
        System.out.println(s2);

        int a =10;
         a = ++a;
        System.out.println(a);


        //contains() method
        ArrayList<String> str = new ArrayList<String>();
        str.add("a");
        str.add("b");
        str.add("c");
        str.add("d");
        str.add("e");
        str.add("f");
        str.add("g");

        System.out.println(str.contains("a b"));
        System.out.println(str.contains("c"));


        // example for size(), ensureCapacity(), trimToSize()

        ArrayList<Integer>  i = new ArrayList<Integer>(5);
        System.out.println(i.size());
        i.add(1);
        i.add(2);
        i.add(3);
        i.add(4);
        i.add(5);
        System.out.println(i.size());
        System.out.println(i);
        i.ensureCapacity(10);
        System.out.println(i.size());
        i.add(10);
        i.add(12);
        System.out.println(i.size());
        System.out.println(i);
        i.trimToSize();
        System.out.println(i.size());
        for(int x : i){
            System.out.println(x);
        }


        //get() and set() method
        ArrayList<String> color = new ArrayList<String>();
        color.add("red");
        color.add("green");
        color.add("black");
        color.add("white");
        System.out.println(color.get(0));
        System.out.println(color.set(2,"yellow"));
        System.out.println(color.get(2));





        // T[] toArray(T[] x)

        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(1);
        ar.add(2);
        ar.add(3);
        System.out.println(ar);
        Integer[] ar1 = new Integer[ar.size()];
        ar1 = ar.toArray(ar1);
        System.out.println(ar1);
        for (int x: ar1) {
            System.out.println(x);
        }
        double[] ar2 = {10.2,20.4};
        System.out.println(Arrays.toString(ar1));
        System.out.println(Arrays.toString(ar2));


        // add to the front
        ArrayList<Integer> ar0 = new ArrayList<Integer>();
        ar0.add(1);
        ar0.add(2);
        System.out.println(ar0);
        ar0.add(0,100);
        System.out.println(ar0);


        //clear()    isEmpty()   indexOf()    lastIndexOf()
        ArrayList<Integer> ar3 = new ArrayList<>();
        ar3.add(1);
        ar3.add(2);
        ar3.add(3);
        ar3.add(4);

        System.out.println(ar3);
        ar3.clear();
        System.out.println(ar3.isEmpty());

        ar3.add(1);
        ar3.add(2);
        ar3.add(3);
        ar3.add(4);
        ar3.add(1);
        ar3.add(2);
        System.out.println(ar3.indexOf(2));
        System.out.println(ar3.lastIndexOf(1));



        // clone()  subList()   retainAll()   iterator()   listIterator()

        ArrayList<Integer> arn = new ArrayList<>();
        arn.add(1);
        arn.add(2);
        arn.add(3);
        arn.add(4);
        arn.add(1);
        arn.add(2);
        arn.add(3);
        arn.add(4);
        arn.add(1);
        arn.add(2);
        ArrayList<Integer> cloneOb = (ArrayList<Integer>) arn.clone(); // list converted to a Integer ArrayList

        arn.add(0,100);
        System.out.println(cloneOb);//the 100 value does not copied in the cloneOb because it is a shallow copy

        System.out.println(cloneOb);
        ArrayList<Integer> subOp = new ArrayList<Integer>(arn.subList(5,7));
        System.out.println(subOp);

        ArrayList<Integer> ary = new ArrayList<Integer>();
        ary.add(1);
        ary.add(2);

        arn.retainAll(ary);
        System.out.println(arn);


        Iterator t0 = arn.iterator();
        while(t0.hasNext()){
            System.out.print(t0.next()+" ");
        }

        System.out.println();
        ListIterator li = arn.listIterator();
        while(li.hasNext()){
            System.out.println(li.next()+" ");
        }












    }
}
