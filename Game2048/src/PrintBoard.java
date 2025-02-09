public class PrintBoard {
    private static boolean[] posCheck =  {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
    private static final int[][]  realPos = {{1,1},{1,9},{1,17},{1,25},{4,1},{4,9},{4,17},{4,25},{7,1},{7,9},{7,17},{7,25},{10,1},{10,9},{10,17},{10,25}};
    private static int[] element = {0,0,2,0,0,2,0,0,2,0,0,2,0,0,2,0};


    public static int getElement(int index){
        return element[index];
    }
    public static void setElement(int index, int value){
        element[index]=value;
    }



    public static boolean getPos(int index){ return posCheck[index]; }
    public static void setPosTrue(int index){
        posCheck[index]=true;
    }
    public static void setPosFalse(int index){
        posCheck[index]=false;
    }



    public static int[][] getRealPos(){
        return realPos;
    }




    public static int elementLength(int element){
        if(element==0)
            return 0;
        else
            return (Integer.toString(element)).length();
    }



    public static void printBoard(){
        int i, j, elementLen=0;
        int[][] realPosition = getRealPos();
        for (i = 0; i < 13; i++) {
            for (j = 0; j < 33; j++) {
                if (((j == 1) || (j == 9) || (j == 17)|| (j == 25)) && ((i == 1) || (i == 4) || (i == 7) || (i == 10))) {
                    for(int k=0; k<16;k++) {
                        if (realPosition[k][0] == i && realPosition[k][1] == j) {
                            elementLen = elementLength(element[k]);
                            if (elementLen == 0)
                                System.out.print(" ");
                            else {
                                System.out.print(element[k]);
                                elementLen--;
                            }
                        }
                    }
                }
                else if((i == 0) && (j == 0) || (i == 0) && (j == 32))
                    System.out.print(",");
                else if((i == 0) && (j == 8) || (i == 0) && (j == 16)|| (i == 0) && (j == 24))
                    System.out.print("_");
                else if ((j == 0) || (j == 8) || (j == 16) || (j == 24) || (j == 32))
                    System.out.print("|");          // printing the board of the game.  ( " | " character)
                else if ((i == 0) || (i == 3) || (i == 6) || (i == 9)|| (i == 12))
                    System.out.print("_");          // printing the board of the game.  ( " _ " character)
                else {
                    if (elementLen == 0)
                        System.out.print(" ");
                    else {
                        elementLen--;
                        //continue;                      computer said it so I left it as a comment
                    }
                }
            }                                       //end of for loop(j)
            System.out.println();                   // printing newline after every iteration of i
        }                                           //end of for loop(i)

        System.out.println("\n");

    }
    public static void main(String[] args) {
        printBoard();
    }
}
