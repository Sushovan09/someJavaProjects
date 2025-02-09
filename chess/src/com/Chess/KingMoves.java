package com.Chess;


/*

[i-1][j-1]  [i-1][j]  [i-1][j+1]

[i][j-1]  ->[i][j]    [i][j+1]

[i+1][j-1]  [i+1][j]  [i+1][j+1]

*/


public class KingMoves {
    public static int boardLength = 8;

    public static void KingMove(int pos){
        int i = pos/boardLength;
        int j = pos%boardLength;

        int[][] moves = new int[8][2];

        int c=0;
        for (int k=i-1;k<=i+1;k++){
            for(int l=j-1;l<=j+1;l++){
                if (k == 1 && l == 1) {
                    continue;
                }
                moves[c][0] = k;        //generating the i value of the kings all moves
                moves[c][1] = l;        //generating the j value of the kings all moves
                c++;
            }
        }


        if(PrintBoard.piece[pos][1].equals("(w)")){
            for (int x=0; x<boardLength; x++){
                int movePose = (i*8)+j;
                if((moves[x][0]>=0 && moves[x][0]<=8) && (moves[x][1]>=0 && moves[x][1]<=8)){
                    if(PrintBoard.piece[movePose][1].equals("(b)")){
                        PrintBoard.piece[pos][3] = "x";
                    }
                }
            }
        }
        if(PrintBoard.piece[pos][1].equals("(b)")){
            for (int x=0; x<boardLength; x++){
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

        KingMove(9);
        PrintBoard.printBoardMinimized();

    }
}
