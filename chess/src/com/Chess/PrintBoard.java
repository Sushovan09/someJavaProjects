package com.Chess;

public class PrintBoard {
    public static String[][] piece;
    static{
        piece = new String[64][4];

        for(int i=0; i <64; i++ )
            for (int j=0; j <4; j++ )
            piece[i][j] = "";

        piece[0][0] = "rook";piece[0][1] = "(b)";piece[0][2] = "152";
        piece[1][0] = "knight";piece[1][1] = "(b)";piece[1][2] = "142";
        piece[2][0] = "bishop";piece[2][1] = "(b)";piece[2][2] = "132";
        piece[3][0] = "queen";piece[3][1] = "(b)";piece[3][2] = "120";
        piece[4][0] = "king";piece[4][1] = "(b)";piece[4][2] = "110";
        piece[5][0] = "bishop";piece[5][1] = "(b)";piece[5][2] = "131";
        piece[6][0] = "knight";piece[6][1] = "(b)";piece[6][2] = "141";
        piece[7][0] = "rook";piece[7][1] = "(b)";piece[7][2] = "151";
        piece[8][0] = "pawn";piece[8][1] = "(b)";piece[8][2] = "168";
        piece[9][0] = "pawn";piece[9][1] = "(b)";piece[9][2] = "167";
        piece[10][0] = "pawn";piece[10][1] = "(b)";piece[10][2] = "166";
        piece[11][0] = "pawn";piece[11][1] = "(b)";piece[11][2] = "165";
        piece[12][0] = "pawn";piece[12][1] = "(b)";piece[12][2] = "164";
        piece[13][0] = "pawn";piece[13][1] = "(b)";piece[13][2] = "163";
        piece[14][0] = "pawn";piece[14][1] = "(b)";piece[14][2] = "162";
        piece[15][0] = "pawn";piece[15][1] = "(b)";piece[15][2] = "161";

        //piece[11][3]="x";
        //piece[22][3]="x";
        //piece[24][3]="x";
        //piece[25][3]="x";



        piece[48][0] = "pawn";piece[48][1] = "(w)";piece[48][2] = "261";
        piece[49][0] = "pawn";piece[49][1] = "(w)";piece[49][2] = "262";
        piece[50][0] = "pawn";piece[50][1] = "(w)";piece[50][2] = "263";
        piece[51][0] = "pawn";piece[51][1] = "(w)";piece[51][2] = "264";
        piece[52][0] = "pawn";piece[52][1] = "(w)";piece[52][2] = "265";
        piece[53][0] = "pawn";piece[53][1] = "(w)";piece[53][2] = "266";
        piece[54][0] = "pawn";piece[54][1] = "(w)";piece[54][2] = "267";
        piece[55][0] = "pawn";piece[55][1] = "(w)";piece[55][2] = "268";
        piece[56][0] = "rook";piece[56][1] = "(w)";piece[56][2] = "251";
        piece[57][0] = "knight";piece[57][1] = "(w)";piece[57][2] = "241";
        piece[58][0] = "bishop";piece[58][1] = "(w)";piece[58][2] = "231";
        piece[59][0] = "king";piece[59][1] = "(w)";piece[59][2] = "210";
        piece[60][0] = "queen";piece[60][1] = "(w)";piece[60][2] = "220";
        piece[61][0] = "bishop";piece[61][1] = "(w)";piece[61][2] = "232";
        piece[62][0] = "knight";piece[62][1] = "(w)";piece[62][2] = "242";
        piece[63][0] = "rook";piece[63][1] = "(w)";piece[63][2] = "252";

    }

    public static void printBoard(){
        for(int i =0; i<33; i++){
            for(int j=0; j<65; j++){
                if((i==0 && j==0) || (i==0 && j==64) ){
                    System.out.print(",");
                } else if(i==0){
                    System.out.print("_");
                } else if (j%8==0) {
                    System.out.print("|");
                } else if (i%4==0){
                    System.out.print("_");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void printBoardPlus(){
        for(int i =0; i<33; i++){
            for(int j=0; j<65; j++){
                if((i==0 && j==0) || (i==0 && j==64) ){
                    System.out.print(",");      // for design purpose
                } else if(i==0){
                    System.out.print("_");
                } else if (j%8==0) {
                    System.out.print("|");
                } else if (i%4==0){
                    System.out.print("_");
                }else if((((i/4)*8)+(j/8) + ((i/4)%2))%2 == 0){     // i/4 and j/8 gives us  position (
                    System.out.print(".");    //equation for the printing the dots "." for the black and white look
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void printBoardPlusPlus(){
        int count=0, count2=0;
        for(int i =0; i<33; i++){
            for(int j=0; j<65; j++){
                if((i==0 && j==0) || (i==0 && j==64) ){
                    System.out.print(",");      // for design purpose
                } else if(i==0){
                    System.out.print("_");
                } else if (j%8==0) {
                    System.out.print("|");
                } else if (i%4==0){
                    System.out.print("_");
                } else if(piece[((i/4)*8)+(j/8)][0] != ""){
                    if((j%8)==1) {
                        String s1 = piece[((i / 4) * 8) + (j / 8)][(i % 4) - 1];
                        count = 7-s1.length();
                        System.out.print(s1);
                    }
                    if(count==0){       //the other two block will not execute and that is our goal
                    }
                    else{
                        count--;
                        if((((i/4)*8)+(j/8) + ((i/4)%2))%2 == 0){     // i/4 and j/8 gives us  position (
                            System.out.print(".");    //equation for the printing the dots "." for the black and white look
                        } else {
                            System.out.print(" ");
                        }
                    }
                }else if((((i/4)*8)+(j/8) + ((i/4)%2))%2 == 0){     // i/4 and j/8 gives us  position (
                    System.out.print(".");    //equation for the printing the dots "." for the black and white look
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void printBoardPPP(){
        int count=0, count2=0;
        for(int i =0; i<33; i++){
            for(int j=0; j<65; j++){
                if((i==0 && j==0) || (i==0 && j==64) ){
                    System.out.print(",");      // for design purpose
                } else if(i==0){
                    System.out.print("_");
                } else if (j%8==0) {
                    System.out.print("|");
                } else if (i%4==0){
                    System.out.print("_");
                } else if(piece[((i/4)*8)+(j/8)][3] == "x") {
                    if(piece[((i/4)*8)+(j/8)][0] == ""){
                        if((i%4==1 || i%4==3) || (j%8==1 ) || (j%8==7 )){
                            if((((i/4)*8)+(j/8) + ((i/4)%2))%2 == 0){     // i/4 and j/8 gives us  position (
                                System.out.print("#");    //equation for the printing the dots "." for the black and white look
                            } else {
                                System.out.print("#");     // this can be cool but my luck
                            }
                        }
                        else if(i%4==2){
                            if(j%8==2) {
                                count2= Integer.toString(((i / 4) * 8) + (j / 8)).length();
                                System.out.print(((i / 4) * 8) + (j / 8));
                                count2--;
                            }
                            else{
                                if(count2!=0){
                                    count2--;
                                }
                                else {
                                    if ((((i / 4) * 8) + (j / 8) + ((i / 4) % 2)) % 2 == 0) {     // i/4 and j/8 gives us  position (
                                        System.out.print(".");    //equation for the printing the dots "." for the black and white look
                                    } else {
                                        System.out.print(" ");
                                    }
                                }
                            }
                        }
                    }
                    else if(piece[((i/4)*8)+(j/8)][0] != ""){
                        if((i%4==3) || (j%8==7 )){
                            if((((i/4)*8)+(j/8) + ((i/4)%2))%2 == 0){     // i/4 and j/8 gives us  position (
                                System.out.print("#");    //equation for the printing the dots "." for the black and white look
                            } else {
                                System.out.print("#");     // this can be cool but my luck
                            }
                        }
                        else if((i%4)==1) {
                            if (((j % 8) == 1)) {
                                String s1 = piece[((i / 4) * 8) + (j / 8)][(i % 4) - 1];
                                count = 6 - s1.length();
                                System.out.print(s1);
                            }
                            if (count == 0) {       //the other two block will not execute and that is our goal
                            } else {
                                count--;
                                if ((((i / 4) * 8) + (j / 8) + ((i / 4) % 2)) % 2 == 0) {     // i/4 and j/8 gives us  position (
                                    System.out.print(".");    //equation for the printing the dots "." for the black and white look
                                } else {
                                    System.out.print(" ");
                                }
                            }
                        }
                        else if(i%4==2){
                            if(j%8==2) {
                                count2= Integer.toString(((i / 4) * 8) + (j / 8)).length();
                                System.out.print(((i / 4) * 8) + (j / 8));
                                count2--;
                            }
                            else{
                                if(count2!=0){
                                    count2--;
                                }
                                else {
                                    if ((((i / 4) * 8) + (j / 8) + ((i / 4) % 2)) % 2 == 0) {     // i/4 and j/8 gives us  position (
                                        System.out.print(".");    //equation for the printing the dots "." for the black and white look
                                    } else {
                                        System.out.print(" ");
                                    }
                                }
                            }
                        }
                    }

                } else if(piece[((i/4)*8)+(j/8)][0] != ""){
                    if((j%8)==1) {
                        String s1 = piece[((i / 4) * 8) + (j / 8)][(i % 4) - 1];
                        count = 7-s1.length();
                        System.out.print(s1);
                    }
                    if(count==0){       //the other two block will not execute and that is our goal
                    }
                    else{
                        count--;
                        if((((i/4)*8)+(j/8) + ((i/4)%2))%2 == 0){     // i/4 and j/8 gives us  position (
                            System.out.print(".");    //equation for the printing the dots "." for the black and white look
                        } else {
                            System.out.print(" ");
                        }
                    }
                }else if((((i/4)*8)+(j/8) + ((i/4)%2))%2 == 0){     // i/4 and j/8 gives us  position (
                    System.out.print(".");    //equation for the printing the dots "." for the black and white look
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printBoardMinimized(){
        int count=0, count2=0;
        for(int i =0; i<33; i++){
            for(int j=0; j<65; j++){
                if((i==0 && j==0) || (i==0 && j==64) ){
                    System.out.print(",");      // for design purpose
                } else if(i==0){
                    System.out.print("_");
                } else if (j%8==0) {
                    System.out.print("|");
                } else if (i%4==0){
                    System.out.print("_");
                } else {
                    var b = (((i / 4) * 8) + (j / 8) + ((i / 4) % 2)) % 2 == 0;
                    if(piece[((i / 4) * 8) + (j / 8)][3].equals("x")) {
                        var s = Integer.toString(((i / 4) * 8) + (j / 8));
                        if(piece[((i / 4) * 8) + (j / 8)][0].equals("")){
                            if((i%4==1 || i%4==3) || (j%8==1 ) || (j%8==7 )){
                                if(b){     // i/4 and j/8 gives us  position (
                                    System.out.print("#");    //equation for the printing the dots "." for the black and white look
                                } else {
                                    System.out.print("#");     // this can be cool but my luck
                                }
                            }
                            else {
                                if(j%8==2) {
                                    count2= s.length();
                                    System.out.print(((i / 4) * 8) + (j / 8));
                                    count2--;
                                }
                                else{
                                    if(count2!=0){
                                        count2--;
                                    }
                                    else {
                                        if (b) {     // i/4 and j/8 gives us  position (
                                            System.out.print(".");    //equation for the printing the dots "." for the black and white look
                                        } else {
                                            System.out.print(" ");
                                        }
                                    }
                                }
                            }
                        }
                        else if(!piece[((i / 4) * 8) + (j / 8)][0].equals("")){
                            if((i%4==3) || (j%8==7 )){
                                if(b){     // i/4 and j/8 gives us  position (
                                    System.out.print("#");    //equation for the printing the dots "." for the black and white look
                                } else {
                                    System.out.print("#");     // this can be cool but my luck
                                }
                            }
                            else if((i%4)==1) {
                                if (((j % 8) == 1)) {
                                    String s1 = piece[((i / 4) * 8) + (j / 8)][(i % 4) - 1];
                                    count = 6 - s1.length();
                                    System.out.print(s1);
                                }
                                if (count == 0) {       //the other two block will not execute and that is our goal
                                } else {
                                    count--;
                                    if (b) {     // i/4 and j/8 gives us  position (
                                        System.out.print(".");    //equation for the printing the dots "." for the black and white look
                                    } else {
                                        System.out.print(" ");
                                    }
                                }
                            }
                            else {
                                if(j%8==2) {
                                    count2= s.length();
                                    System.out.print(((i / 4) * 8) + (j / 8));
                                    count2--;
                                }
                                else{
                                    if(count2!=0){
                                        count2--;
                                    }
                                    else {
                                        if (b) {     // i/4 and j/8 gives us  position (
                                            System.out.print(".");    //equation for the printing the dots "." for the black and white look
                                        } else {
                                            System.out.print(" ");
                                        }
                                    }
                                }
                            }
                        }

                    } else if(!piece[((i / 4) * 8) + (j / 8)][0].equals("")){
                        if((j%8)==1) {
                            String s1 = piece[((i / 4) * 8) + (j / 8)][(i % 4) - 1];
                            count = 7-s1.length();
                            System.out.print(s1);
                        }
                        if(count==0){       //the other two block will not execute and that is our goal
                        }
                        else{
                            count--;
                            if(b){     // i/4 and j/8 gives us  position (
                                System.out.print(".");    //equation for the printing the dots "." for the black and white look
                            } else {
                                System.out.print(" ");
                            }
                        }
                    }else if(b){     // i/4 and j/8 gives us  position (
                        System.out.print(".");    //equation for the printing the dots "." for the black and white look
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        //com.Chess.PrintBoard.printBoard();
        //com.Chess.PrintBoard.printBoardPlus();
        //printBoardPlusPlus();
        //printBoardPPP();
        printBoardMinimized();

    }

}
