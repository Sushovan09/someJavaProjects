package com.Chess;

/*

[i-2][j-2]      ({[i-2][j-1]})      [i-2][j]        ({[i-2][j+1]})  [i-2][j+2]

({[i-1][j-2]})  [i-1][j-1]          [i-1][j]        [i-1][j+1]      ({[i-1][j+2]})

[i][j-2]        [i][j-1]            ->[i][j]        [i][j+1]        [i][j+2]

({[i+1][j-2]})  [i+1][j-1]          [i+1][j]        [i+1][j+1]      ({[i+1][j+2]})

[i+2][j-2]      ({[i+2][j-1]})      [i+2][j]        ({[i+2][j+1]})  [i+2][j+2]

({[]})<= ARE THE KNIGHT'S MOVE

*/

public class KnightMoves {

        public static int boardLength = 8;
        public static void knightMove(int pos) {
            int i = pos / boardLength;
            int j = pos % boardLength;
            int moves[][] = new int[8][2];

            moves[0][0] = i-2;
            moves[0][1] = j-1;

            moves[1][0] = i-2;
            moves[1][1] = j+1;

            moves[2][0] = i-1;
            moves[2][1] = j-2;

            moves[3][0] = i-1;
            moves[3][1] = j+2;

            moves[4][0] = i+1;
            moves[4][1] = j-2;

            moves[5][0] = i+1;
            moves[5][1] = j+2;

            moves[6][0] = i+2;
            moves[6][1] = j-1;

            moves[7][0] = i+2;
            moves[7][1] = j+1;


            if(PrintBoard.piece[pos][1].equals("(w)")){
                for (int x=0; x<moves.length; x++){
                    int movePose = (moves[x][0]*8)+moves[x][1];
                    if((moves[x][0]>=0 && moves[x][0]<=8) && (moves[x][1]>=0 && moves[x][1]<=8)){
                        if(PrintBoard.piece[movePose][1].equals("(b)") || PrintBoard.piece[movePose][1].equals("")){
                            PrintBoard.piece[movePose][3] = "x";
                        }
                    }
                }



            }
            if(PrintBoard.piece[pos][1].equals("(b)")){
                for (int x=0; x<moves.length; x++){
                    int movePose = (moves[x][0]*8)+moves[x][1];
                    if((moves[x][0]>=0 && moves[x][0]<=8) && (moves[x][1]>=0 && moves[x][1]<=8)){
                        if(PrintBoard.piece[movePose][1].equals("(w)") || PrintBoard.piece[movePose][1].equals("")){
                            PrintBoard.piece[movePose][3] = "x";
                        }
                    }
                }

            }

        }
        public static void main(String[] args) {
            knightMove(1);
            PrintBoard.printBoardMinimized();
        }
}
