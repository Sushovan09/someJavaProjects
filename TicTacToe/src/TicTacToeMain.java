import java.util.Scanner;
import java.util.Random;

public class TicTacToeMain {
    /* for gods sake if i really forgot how to do multy line comments f****** this is how to do it */

    private static boolean[] num = {true, true, true, true, true, true, true, true, true};          //1
    private static int[][] seq = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 4, 7}, {2, 5, 8}, {3, 6, 9}, {1, 5, 9}, {3, 5, 7}};

    public static boolean setTrue(boolean b) {
        b = true;
        return b;
    }

    public static void setFalse(int n) {
        num[n-1] = false;
    }

    public static boolean getState(int n) {
        if(n<1 || n>9)
            return false;

        return num[n-1];
    }


    public static int[] getSequence(int n) {
        return seq[n];
    }


    // this is how the board will look like and we are gonna print it in the start of the program so that dumb user
// like me dont have to sit with pen and paper every time we will going to play simple tick tack toe .
/*
        1  |  2  |  3
        ___|_____|___
           |     |
        4  |  5  |  6
        ___|_____|___
           |     |
        7  |  8  |  9
*/
//this is the logic for that
    public static void trial() {
        int i, j, counter = 1;
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 13; j++) {
                if (((j == 0) || (j == 6) || (j == 12)) && ((i == 0) || (i == 3) || (i == 6))) {
                    System.out.print(counter);
                    counter++;
                } else if ((j == 3) || (j == 9)) {
                    System.out.print("|");
                } else if ((i == 1) || (i == 4)) {
                    System.out.print("_");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }


    /*
    O  |  X  |  X 0
    ___|_____|___ 1
       |     |    2
    O  |  O  |  X 3       >_< computer win
    ___|_____|___ 4                         'O' you win
       |     |    5
    X  |  O  |  O 6
    0123456789123

    1 ->  0,0
    2 ->  0,6
    3 ->  0,13
    4 ->  3,0
    5 ->  3,6
    6 ->  3,13
    7 ->  6,0
    8 ->  6,6
    9 ->  6,13

    i j
    1,-
    4,- print _

    -,3
    -,9 print |
*/

        public static void printBoard(int[] user, int u, int[] comp, int c ) {//(parameters)1> user input array. |2>the total number of input user given so far. |3>computer generated array. |4>amount of number computer generated so far.
            int[][] arr2 = {{0, 0}, {0, 6}, {0, 12}, {3, 0}, {3, 6}, {3, 12}, {6, 0}, {6, 6}, {6, 12}};             //board positions array for 'X' and 'O' in 2'd space.

            int i, j, count;                        // count-> used for generate space when it's position for input(O,X) but the input was not given or generated.
            for (i = 0; i < 7; i++) {               // loop for column (i)
                for (j = 0; j < 13; j++) {          //loop for row (j)

                    if (((j == 0) || (j == 6) || (j == 12)) && ((i == 0) || (i == 3) || (i == 6))) {        //if block to find the position for (O,X) in the board.
                        count = 0;                    //initially we make the counter '0'
                        for (int k = 0; k < u; k++) {
                            if (arr2[user[k] - 1][0] == i && arr2[user[k] - 1][1] == j) {
                                if (user.length == 5)
                                    System.out.print("X");
                                else
                                    System.out.print("O");
                                count = 1;            //count->1 indicate required character (O or X) is printer in the required position.
                            }

                        }
                        for (int k = 0; k < c; k++) {
                            if (arr2[comp[k] - 1][0] == i && arr2[comp[k] - 1][1] == j) {
                                if (comp.length == 5)
                                    System.out.print("X");
                                else
                                    System.out.print("O");
                                count = 1;                //count->1 indicate required character (O or X) is printer in the required position.
                            }
                        }
                        if (count == 0)                    //if count->1 indicate required character (O or X) is printer in the required position.
                            System.out.print(" ");      // count->0 used for generate space when it's position for input(O or X) but the input was not given or generated.
                    } else if ((j == 3) || (j == 9))
                        System.out.print("|");          // printing the board of the game.  ( " | " character)
                    else if ((i == 1) || (i == 4))
                        System.out.print("_");          // printing the board of the game.  ( " _ " character)
                    else
                        System.out.print(" ");          // printing the space at the blank position.
                }
                System.out.println();                   // printing newline after every iteration of i
            }
            System.out.println("\n");
        }


        public static int[] computerAINormal(int[] comp, int counter) {
            Random random = new Random();
            while (true) {
                int x = 1+ random.nextInt(9);
                if (TicTacToeMain.getState(x)) {
                    TicTacToeMain.setFalse(x);
                    comp[counter] = x;
                    break;
                }
            }
            return comp;
        }

        public static void check(int[] input, int len, boolean b) {
            int count = 0;
            for (int[] arr : seq) {
                count = 0;
                for (int val : arr) {
                    for (int i = 0; i < len; i++) {
                        if (val == input[i]) {
                            count++;
                        }
                    }
                }
                if (count == 3 && b == true) {
                    System.out.println("            >_< computer win");
                    System.exit(0);
                } else if (count == 3 && b == false) {
                    System.out.println("                 'O' you win");
                    System.exit(0);
                }

            }
            return;
        }


        public static boolean search(int arr[], int key) {
            for (int num : arr) {
                if (num == key)
                    return true;
            }
            return false;
        }


        //now the real logic
        public static void main(String[] args) {
            int[] user;
            int[] comp;

            System.out.println("<<welcome to our tic-tac-toe game>>");
//we will ask the user if he is the first mover
            System.out.print("first mover(if yes enter\"y\" else \"n\" ) : ");
            Scanner sc = new Scanner(System.in);
            char choice = sc.next().charAt(0);

//if he is then the user  array where we store the user choices
// will be 5 value long and the comp array is 4 value long
            if (choice == 'y') {
                user = new int[5];
                comp = new int[4];
            } else if (choice == 'n') {
                user = new int[4];
                comp = new int[5];
            } else {
                System.out.print("you fooooool");
                return;
            }
//this counter will definitely help us in the future I swears
            int count = 0, count2 = 0;

            if (choice == 'n') {
                System.out.println("computers turn");
                comp = computerAINormal(comp, count2);
                count2++;
                printBoard(user, count, comp, count2);
            }

            TicTacToeMain.trial();
            System.out.println("Enter corresponding number as your input from the previous image");

//now the inffffffffffinite loop begins
            while (count < user.length) {
                System.out.print("enter your choice : ");
                int userChoice = sc.nextInt();
                if (!((1 <= userChoice && userChoice <= 9) && getState(userChoice))) {          //
                    System.out.println("enter right choice");
                    continue;
                }
                user[count] = userChoice;
                setFalse(userChoice);
                count++;
                printBoard(user, count, comp, count2);
                if (count >= 3) {
                    check(user, count, false);
                }


                if (count2 < comp.length) {
                    comp = computerAINormal(comp, count2);
                    count2++;
                    System.out.println("computers turn");
                    printBoard(user, count, comp, count2);
                }

                if (count2 >= 3) {
                    check(comp, count2, true);
                }
            }
        }
}
