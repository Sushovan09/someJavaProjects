/*

java program to replicate 2048

# it's a tough one. #flixing the mussel.

|| design

1		2 		3		4

2048	2048	2048	2048	1


2048	2048	2048	2048	2


2048	2048	2048	2048	3


2048	2048	2048	2048	4




012345678901234567890123456789012

012301230123012301230123012301230

t	t 	t 	t 	t 	t 	t 	t 	t

012345678901234567890123456789012
,_______________________________,	0 	1 	0
|2048	|2048	|2048	|2048	|	1 	2 	1
|		|		|		|		|	2 	3 	2
|_______|_______|_______|_______|	3 	4 	0
|2048	|2048	|2048	|2048	|	4 	5 	1
|		|		|		|		|	0   6 	2
|_______|_______|_______|_______|	6  	7 	0
|2048	|2048	|2048	|2048	|	7 	8 	1
|		|		|		|		|	8 	9 	2
|_______|_______|_______|_______|	9 	10 	0
|2048	|2048	|2048	|2048	|	10 	11 	1
|		|		|		|		|	11 	12 	2
|_______|_______|_______|_______|	12 	13 	0


0 	1 	2 	3 	4 	5 	5 	7 	8 	9 	10 	11 	12 	13 	14 	15 	16 	17 	18 	19 	20 	21 	22 	23 	24 	25 	26 	27 	28 	29 	30 	31 	32 	33

0 	1 	2 	3 	4 	5 	6 	7 	8 	9 	0 	1 	2 	3 	4 	5 	6 	7 	8 	9 	0 	1 	2 	3 	4 	5 	6 	7 	8 	9 	0 	1 	2 	3

position for printing character is

R= row  [--]       C= column  [|]



1 			2 			3  			4

 C 	R
[1][1]		[1][9]		[1][17]		[1][25]   	1



[4][1]		[4][9]		[4][17]		[4][25]		2



[7][1]		[7][9]		[7][17]		[7][25]		3



[10][1]		[10][9]		[10][17]	[1][25]		4




there will be 4 type of input  {L(Left) , R(Right) , U(Up) , D(Down)}
we will accept both UpperCase and LowerCase for input ( so the input will be  <l> or <L> , <r> ot <R>, <u> or <U> , <d> or <D> )



the black box view of the program

class Game2048{

	//mandatory functions and fields

	//special array to check if the position is empty or not
	private static boolean[] posCheck =  {true, true, true, true, true......... 16 times for the 16 positions}

	//array for the accessing the element printing position (2d array)
	private static int[][]  realPos = {{1,1},{1,9},{1,17},{1,25},{2,25}....... 16 positions for the 16 locations}

	//array for element in every position
	private static int[] element = {0,0,0,0,0,.........16 times for 16 elements}

	//corresponding getter and setter method

	public static int getElement(int index){
		return element[index];
	}
	public static void setElement(int index, int value){
		element[index]=value;
	}

	public static boolean getPos(int index){
		return posCheck[index];
	}
	public static void setPosTrue(int index){
		posCheck[index]=true;
	}
	public static void setPosFalse(int index){
		posCheck[index]=false;
	}

	public static int[][] getRealPos(){
		return realPos;
	}

	//printBoard function for printing the board

	public static void printBoard(){

		....... logic for printing the board.......

	}

	// 4 special methods for each of the input (Left, Right, Up, Down)

	public static void left(){

			...........logic for input left............

	}
	public static void right(){

			...........logic for input right............

	}
	public static void up(){

			...........logic for input up............

	}
	public static void down(){

			...........logic for input down............

	}

	//generate a new random number in a random position fo each input(L,R,U,D)
	public static generateNew(){

			.............logic for generate new number.........
			.............and logic for generate it for a random position............


	}


	// Main Function

	public static void main(String[] args){

			...............logic for the main function.................

	}


}


*/


import java.util.Scanner;					//header file for scanner
import java.util.Random; 							//header file for random

class Game2048Main{

    private static boolean[] posCheck =  {true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
    private static final int[][]  realPos = {{1,1},{1,9},{1,17},{1,25},{4,1},{4,9},{4,17},{4,25},{7,1},{7,9},{7,17},{7,25},{10,1},{10,9},{10,17},{10,25}};
    private static int[] element = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};


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
                else if ((j == 0) || (j == 8) || (j == 16) || (j == 24))
                    System.out.print("|");          // printing the board of the game.  ( " | " character)
                else if ((i == 0) || (i == 3) || (i == 6) || (i == 9))
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

    }                                               //end of print board




    public static void generateRandomElement(){
        Random random = new Random();
        while (true) {
            int x = random.nextInt(2);
            int y = random.nextInt(16);
            x = (x+1)*2;
            if (getPos(y)) {
                setElement(y,x);
                setPosFalse(y);
                break;
            }
        }
    }       //end of generate Random Element



    public static void left(){

			//...........logic for input left............



    }
    public static void right(){

			//...........logic for input right............



    }
    public static void up(){

			//...........logic for input up............



    }
    public static void down(){

			//...........logic for input down............



    }

    public static boolean isPosEmpty(){

        for(int i=0; i<16; i++)
            if(getPos(i))
                return true;

        return false;
    }

    public static void score(){
        int score =0;
        for(int i =0; i<16; i++){
            score+= getElement(i);
        }
        System.out.println("current Score is "+score);
    }


    public static void main(String[] args) {
        System.out.println("\t\t< welcome to our 2048 game >");
        Scanner sc = new Scanner(System.in);
        while(isPosEmpty()){
            generateRandomElement();
            printBoard();
            score();
            System.out.println("enter your move (L,R,U,D) :");
            char in = sc.next().charAt(0);
            in = Character.toUpperCase(in);
            switch (in) {
                case 'U' :
                    up();
                    break;
                case 'D' :
                    down();
                    break;
                case 'L' :
                    left();
                    break;
                case 'R' :
                    right();
                    break;
                default : System.out.println("Invalid Input");
            }

        }                                               //end of while

        System.out.println("thank you for playing the game ");
    }                                               //end of main

}                                               //end of class
