import java.util.Arrays;

public class Core2 {

    public static int[] execute(int[] arr) {
        int i, j, count = 0;
        if(arr[0]==0){
            return arr;
        }

        for (i = 0; i < arr.length-1; i++) {
            if(arr[i] == 0 && arr[i+1] == 0){
                return arr;
            }
            if (arr[i] == arr[i+1]) {
                arr[i]+=arr[i+1];
                count++;
                for (j = i+1; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - count] = 0;
            }
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {4, 2, 4};
        int[] arr2 = {4, 4, 8, 8, 2, 0};
        int[] arr3 = {4, 2, 2, 2, 0, 0, 0};
        int[] arr4 = {4, 4};
        int[] arr5 = {4, 2, 4,};

        System.out.println(Arrays.toString(execute(arr)));
        System.out.println(Arrays.toString(execute(arr2)));
        System.out.println(Arrays.toString(execute(arr3)));
        System.out.println(Arrays.toString(execute(arr4)));
        System.out.println(Arrays.toString(execute(arr5)));

    }
}
