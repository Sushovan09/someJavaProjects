import java.util.Scanner;

public class userVsUserDynamic {

        private static boolean[] num = {true, true, true, true, true, true, true, true, true};          //1
        public static int[][] seq = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 4, 7}, {2, 5, 8}, {3, 6, 9}, {1, 5, 9}, {3, 5, 7}};

    public static void setFalse(int n) {
            num[n-1] = false;
        }

        public static boolean getState(int n) {
            if(n<1 || n>9)
                return false;

            return num[n-1];
        }


    // this is how the board will look like and we are gonna print it in the start of the program so that dumb user
// like me don't have to sit with pen and paper every time we will going to play simple tick tack toe .
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

        public static void printBoard(int[] user1, int u1, int[] user2, int u2 ) {//(parameters)1> user input array. |2>the total number of input user given so far. |3>computer generated array. |4>amount of number computer generated so far.
            int[][] arr2 = {{0, 0}, {0, 6}, {0, 12}, {3, 0}, {3, 6}, {3, 12}, {6, 0}, {6, 6}, {6, 12}};             //board positions array for 'X' and 'O' in 2'd space.

            int i, j, count;                        // count-> used for generate space when it's position for input(O,X) but the input was not given or generated.
            for (i = 0; i < 7; i++) {               // loop for column (i)
                for (j = 0; j < 13; j++) {          //loop for row (j)

                    if (((j == 0) || (j == 6) || (j == 12)) && ((i == 0) || (i == 3) || (i == 6))) {        //if block to find the position for (O,X) in the board.
                        count = 0;                    //initially we make the counter '0'
                        for (int k = 0; k < u1; k++) {
                            if (arr2[user1[k] - 1][0] == i && arr2[user1[k] - 1][1] == j) {
                                if (user1.length == 5)
                                    System.out.print("X");
                                else
                                    System.out.print("O");
                                count = 1;            //count->1 indicate required character (O or X) is printer in the required position.
                            }

                        }
                        for (int k = 0; k < u2; k++) {
                            if (arr2[user2[k] - 1][0] == i && arr2[user2[k] - 1][1] == j) {
                                if (user2.length == 5)
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
                if (count == 3 && b) {
                    System.out.println("            >_< user 1 win");
                    System.exit(0);
                } else if (count == 3 && !b) {
                    System.out.println("                 'O' user 2 win");
                    System.exit(0);
                }

            }
        }

        public static void clearScreen(){
            System.out.println("\033[H\033[2J");
            System.out.flush();
        }


        //now the real logic
        public static void main(String[] args) {
            int[] user1  = new int[5];
            int[] user2 = new int[4];

            Scanner sc = new Scanner(System.in);
            System.out.println("<<welcome to our user vs user tic-tac-toe game>>");

            TicTacToeMain.trial();
            System.out.println("Enter corresponding number as your input from the previous image");
            System.out.print("enter anything to continue :");
            sc.nextLine();
            clearScreen();


//this counter will definitely help us in the future I swears
            int u1 = 0, u2 = 0, user1Choice=0, user2Choice=0;

            System.out.println("user 1's turn");
            while(true) {
                System.out.print("enter your choice : ");
                user1Choice = sc.nextInt();
                if (!((1 <= user1Choice && user1Choice <= 9) && getState(user1Choice))) {
                    System.out.println("enter right choice");
                }
                else {
                    break;
                }
            }
            user1[u1] = user1Choice;
            setFalse(user1Choice);
            u1++;
            printBoard(user1, u1, user2, u2);


//now the inffffffffffinite loop begins
            while (u2 < user2.length) {

                clearScreen();
                System.out.println("user 2's turn");
                while(true) {
                    System.out.print("enter your choice : ");
                    user2Choice = sc.nextInt();
                    if (!((1 <= user2Choice && user2Choice <= 9) && getState(user2Choice))) {
                        System.out.println("enter right choice");
                    }
                    else {
                        break;
                    }
                }

                user2[u2] = user2Choice;
                setFalse(user2Choice);
                u2++;
                printBoard(user1, u1, user2, u2);

                if (u2 >= 3) {
                    check(user2, u2, false);
                }

                clearScreen();
                System.out.println("user 1's turn");
                while(true) {
                    System.out.print("enter your choice : ");
                    user1Choice = sc.nextInt();
                    if (!((1 <= user1Choice && user1Choice <= 9) && getState(user1Choice))) {
                        System.out.println("enter right choice");
                    }
                    else {
                        break;
                    }
                }

                user1[u1] = user1Choice;
                setFalse(user1Choice);
                u1++;
                printBoard(user1, u1, user2, u2);

                if (u1 >= 3) {
                    check(user1, u1, true);
                }

            }
            System.out.println("Alas! no one wins.");
        }
}
