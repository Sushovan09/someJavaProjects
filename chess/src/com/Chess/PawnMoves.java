package com.Chess;

/*

[i-1][j-1]  [i-1][j]  [i-1][j+1]

[i][j-1]  ->[i][j]    [i][j+1]

[i+1][j-1]  [i+1][j]  [i+1][j+1]


=for the first time (b)

->[i][j]  i=1
[i+1][j]
[i+2][j]

for the first time (w)

[i-2][j]
[i-1][j]
 ->[i][j]  i=6

for the other times time (b)

                                        ->[i][j]

              [i+1][j-1]                [i+1][j]                        [i+1][j+1]
if(opposite are there)    if(PrintBoard.piece[movePose][3] != "x")      if(opposite are there)



for the other times time (w)

if(opposite are there)    if(PrintBoard.piece[movePose][3] != "x")      if(opposite are there)
        [i-1][j-1]                      [i-1][j]                                    [i-1][j+1]

                                        ->[i][j]




for All time generalized (b):

                                        >[i][j]

              [i+1][j-1]                [i+1][j]                        [i+1][j+1]
if(opposite are there)    if(PrintBoard.piece[movePose][3] != "x")      if(opposite are there)

                                        [i+2][j]
                          if(PrintBoard.piece[movePose][3] != "x")
                             And    move(for the first time)

for All time generalized (w):


                            if(PrintBoard.piece[movePose][3] != "x")
                             And    move(for the first time)

                                        [i-2][j]

if(opposite are there)    if(PrintBoard.piece[movePose][3] != "x")      if(opposite are there)
        [i-1][j-1]                      [i-1][j]                                    [i-1][j+1]

                                        ->[i][j]



*/

public class PawnMoves {

    public static int boardLength = 8;
    public static void pawnMove(int pos) {
        int i = pos / boardLength;
        int j = pos % boardLength;
        int moves[][] = new int[4][2];

        if(PrintBoard.piece[pos][1].equals("(w)")){
            moves[0][0] = i-2;
            moves[0][1] = j;

            moves[1][0] = i-1;
            moves[1][1] = j-1;

            moves[2][0] = i-1;
            moves[2][1] = j;

            moves[3][0] = i-1;
            moves[3][1] = j+1;

            for (int x=0; x<moves.length; x++){
                int movePose = (moves[x][0]*8)+moves[x][1];
                if((moves[x][0]>=0 && moves[x][0]<=8) && (moves[x][1]>=0 && moves[x][1]<=8)){
                    if(PrintBoard.piece[movePose][1].equals("(b)")){
                        PrintBoard.piece[pos][3] = "x";
                    }
                }
                if((moves[x][0]>=0 && moves[x][0]<=8) && (moves[x][1]>=0 && moves[x][1]<=8)){
                    if(PrintBoard.piece[movePose][1].equals("(b)")){
                        PrintBoard.piece[pos][3] = "x";
                    }
                }
                if(moves[x][0]==)
                if((moves[x][0]>=0 && moves[x][0]<=8) && (moves[x][1]>=0 && moves[x][1]<=8)){
                    if(PrintBoard.piece[movePose][1].equals("(b)")){
                        PrintBoard.piece[pos][3] = "x";
                    }
                }
            }



        }
        if(PrintBoard.piece[pos][1].equals("(b)")){
            moves[0][0] = i+2;
            moves[0][1] = j;

            moves[1][0] = i+1;
            moves[1][1] = j+1;

            moves[2][0] = i+1;
            moves[2][1] = j;

            moves[3][0] = i+1;
            moves[3][1] = j-1;

            for (int x=0; x<moves.length; x++){
                int movePose = (moves[x][0]*8)+moves[x][1];
                if((moves[x][0]>=0 && moves[x][0]<=8) && (moves[x][1]>=0 && moves[x][1]<=8)){
                    if(PrintBoard.piece[movePose][1].equals("(b)")){
                        PrintBoard.piece[pos][3] = "x";
                    }
                }
                if((moves[x][0]>=0 && moves[x][0]<=8) && (moves[x][1]>=0 && moves[x][1]<=8)){
                    if(PrintBoard.piece[movePose][1].equals("(b)")){
                        PrintBoard.piece[pos][3] = "x";
                    }
                }
                if((moves[x][0]>=0 && moves[x][0]<=8) && (moves[x][1]>=0 && moves[x][1]<=8)){
                    if(PrintBoard.piece[movePose][1].equals("(b)")){
                        PrintBoard.piece[pos][3] = "x";
                    }
                }

            }

        }

    }
    public static void main(String[] args) {
        pawnMove(10);
    }
}
