import java.util.Arrays;

public class Transpose {

    public static int[][] transpose(int[][] arr){
        int[][] arr2 = new int[arr.length][arr[0].length];
        for(int i=0; i<arr.length ; i++)
            for(int j=0; j<arr[0].length;j++)
                arr2[j][i]=arr[i][j];

        return arr2;
    }


    public static void main(String[] args) {
        int[][] arr = {{0,2,0,2},{0,2,0,2},{0,2,0,2},{0,2,0,2}};

        for (int[] ar :arr) {
            System.out.println(Arrays.toString(ar));
        }

        arr = transpose(arr);

        System.out.println("\n");

        for (int[] ar :arr) {
            System.out.println(Arrays.toString(ar));
        }
    }
}

