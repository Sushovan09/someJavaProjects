import jdk.swing.interop.SwingInterOpUtils;

public class ExceptionWithMultipleCatchBlock {
    public static void main(String[] args) {
        int[] numartor =  {2,0,3,5,2,5,3};
        int[] denominator = {2,4,7,2,0,5,2,3};
        for(int i = 0; i < 8; i++){
            try{
                System.out.println(numartor[i]/denominator[i]);
            }
            catch(ArithmeticException a1){
                System.out.println("Arithmetic Exception occurred");
            }
            catch(ArrayIndexOutOfBoundsException a2){
                System.out.println("Array Index Out Of Bounds Exception occurred");
            }
        }
    }
}
/* output
1
0
0
2
Arithmetic Exception occurred
1
1
Array Index Out Of Bounds Exception occurred

Process finished with exit code 0
 */

