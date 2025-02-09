
import java.util.Scanner;

public class Flute {
    public static String[] Sa = {".",".",".","o","o","o"};
    public static String[] Re = {".",".","o","o","o","o"};
    public static String[] Ga = {".","o","o","o","o","o"};
    public static String[] Ma = {"o","o","o","o","o","o"};
    public static String[] Pa = {".",".",".",".",".","."};
    public static String[] Dha = {".",".",".",".",".","o"};
    public static String[] Ni = {".",".",".",".","o","o"};


    public static void printNode(String[] note, String noteName){
        System.out.print("\t");
        for(int i = 0; i< note.length/2; i++ )
            System.out.print(note[i]+" ");
        System.out.print("  ");
        for(int i = note.length/2; i< note.length; i++ )
            System.out.print(note[i]+" ");
        System.out.println("\t"+noteName);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter notes :");
        String notes = sc.nextLine();
        notes = notes.toLowerCase();
        System.out.println(notes);
        for(int i = 0; i < notes.length(); i++){
            switch (notes.charAt(i)){
                case 's' :
                    printNode(Sa,"Sa");
                    break;
                case 'r' :
                    printNode(Re,"Re");
                    break;
                case 'g' :
                    printNode(Ga,"Ga");
                    break;
                case 'm' :
                    printNode(Ma,"Ma");
                    break;
                case 'p' :
                    printNode(Pa,"Pa");
                    break;
                case 'd' :
                    printNode(Dha,"Dha");
                    break;
                case 'n' :
                    printNode(Ni,"Ni");
                    break;
                case ' ' :
                    System.out.println();
                    break;
                default :
                    System.out.println(notes.charAt(i));
            }
        }

    }




}
