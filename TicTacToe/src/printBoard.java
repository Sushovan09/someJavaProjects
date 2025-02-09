import javax.print.MultiDocPrintService;

public class printBoard {
    public static void printBoard(int[] user,  int u, int[] comp, int c) {//(parameters)1> user input array. |2>the total number of input user given so far. |3>computer generated array. |4>amount of number computer generated so far.
        int[][] arr2 = {{0, 0},{0, 6},{0, 12},{3, 0},{3, 6},{3, 12},{6, 0},{6, 6},{6, 12}};             //board positions array for 'X' and 'O' in 2'd space.

        int i, j, count;                        // count-> used for generate space when it's position for input(O,X) but the input was not given or generated.
        for (i = 0; i < 7; i++) {               // loop for column (i)
            for (j = 0; j < 13; j++) {          //loop for row (j)

                if (((j == 0) || (j == 6) || (j == 12)) && ((i == 0) || (i == 3) || (i == 6))) {        //if block to find the position for (O,X) in the board.
                    count=0;                    //initially we make the counter '0'
                    for(int k = 0; k<u; k++){
                        if (arr2[user[k]-1][0] == i && arr2[user[k]-1][1] == j) {
                            if (user.length == 5)
                                System.out.print("X");
                            else
                                System.out.print("O");
                            count=1;            //count->1 indicate required character (O or X) is printer in the required position.
                        }

                    }
                    for(int k = 0; k<c; k++){
                        if (arr2[comp[k]-1][0] == i && arr2[comp[k]-1][1] == j) {
                            if (comp.length == 5)
                                System.out.print("X");
                            else
                                System.out.print("O");
                            count=1;                //count->1 indicate required character (O or X) is printer in the required position.
                        }
                    }
                    if(count==0)                    //if count->1 indicate required character (O or X) is printer in the required position.
                        System.out.print(" ");      // count->0 used for generate space when it's position for input(O or X) but the input was not given or generated.
                }
                else if ((j == 3) || (j == 9))
                    System.out.print("|");          // printing the board of the game.  ( " | " character)
                else if ((i == 1) || (i == 4))
                    System.out.print("_");          // printing the board of the game.  ( " _ " character)
                else
                    System.out.print(" ");          // printing the space at the blank position.
            }
            System.out.println();                   // printing newline after every iteration of i
        }
    }

    public static void main(String[] args) {
        int[] user = new int[4] ;
        int[] comp = new int[5];
        user[0]=5;

        printBoard(user,1,comp,0);
    }
}
