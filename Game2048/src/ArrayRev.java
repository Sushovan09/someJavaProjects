import java.util.Arrays;

public class ArrayRev {

    public static int[] rev(int[] arr){
        int i,k,temp=0;
        for (i=0,k=arr.length-1;i<(arr.length)/2;i++,k--){
            temp=arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr= {0,0,0,4,4};
        int[] arr2= {0,4,4,8,8,2};
        int[] arr3= {4,2,0,2,2};
        int[] arr4= {4,4};
        int[] arr5= {4,0,0,0,0,0,4};
        System.out.println(Arrays.toString(rev(arr)));
        System.out.println(Arrays.toString(rev(arr2)));
        System.out.println(Arrays.toString(rev(arr3)));
        System.out.println(Arrays.toString(rev(arr4)));
        System.out.println(Arrays.toString(rev(arr5)));

    }
}
