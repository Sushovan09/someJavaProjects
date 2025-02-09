import java.util.Arrays;

public class Left {
    public static int[] execute1(int[] arr){
        int i,j,k,count=0;
        for (i=0,k=0;i<arr.length;i++){
            if(arr[k]==0){
                count++;
                for(j=k;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                arr[arr.length-count]=0;
            }
            else{
                k++;
            }
        }
        return arr;
    }

    public static int[] execute2(int[] arr) {
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

    public static int[] toLeft(int[] arr) { return execute2(execute1(arr)); }

    public static void main(String[] args) {
        int[][] arr = {{0,2,0,2},{0,2,0,2},{0,2,0,2},{0,2,0,2}};
        for (int[] ar :arr) {
            System.out.println(Arrays.toString(ar));
        }

        System.out.println("\n");

        for (int[] ar :arr) {
            ar= toLeft(ar);
        }

        for (int[] ar :arr) {
            System.out.println(Arrays.toString(ar));
        }
    }
}
