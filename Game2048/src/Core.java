import java.util.Arrays;

public class Core {

    public static int[] execute(int[] arr){
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


    public static void main(String[] args) {
        int[] arr= {0,0,0,4,4};
        int[] arr2= {0,4,4,8,8,2};
        int[] arr3= {4,2,0,2,2};
        int[] arr4= {4,4};
        int[] arr5= {4,0,0,0,0,0,4};
        System.out.println(Arrays.toString(execute(arr)));
        System.out.println(Arrays.toString(execute(arr2)));
        System.out.println(Arrays.toString(execute(arr3)));
        System.out.println(Arrays.toString(execute(arr4)));
        System.out.println(Arrays.toString(execute(arr5)));

    }
}
