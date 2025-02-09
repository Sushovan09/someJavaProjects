import java.util.Arrays;

public class DimensionConversion {
    private static int[] element = {0,0,2,0,0,2,0,0,2,0,0,2,0,0,2,0};
    public static int[] getElementMain(){
        return element;
    }
    public static void SetElementMain(int[] newElement){ element =  newElement; }
    public static int getElement(int index){
        return element[index];
    }
    public static void setElement(int index, int value){
        element[index]=value;
    }

    public static void main(String[] args) {
        int[] arrMain = getElementMain();
        System.out.println(Arrays.toString(arrMain));
        int count=0;
        int[][] arr = new int[4][4];

        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                arr[i][j]=arrMain[count];
                count++;
            }
        }

        for (int[] ar:arr){
            System.out.println(Arrays.toString(ar));
        }

        count = 0;
        int[] arrMain2 = new int[arrMain.length];

        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr[0].length; j++){
                arrMain2[count] = arr[i][j];
                count++;
            }
        }

        System.out.println(Arrays.toString(arrMain2));

    }

}
