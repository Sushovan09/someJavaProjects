public class test {
    public static void main(String[] args) {
        int i, j, counter = 1;
        for (i = 0; i < 7; i++) {
            for (j = 0; j < 13; j++) {
                if (((j == 0) || (j == 6) || (j == 12)) && ((i == 0) || (i == 3) || (i == 6))) {
                    System.out.print(counter);
                    counter++;
                }
                else if ((j == 3) || (j == 9)) {
                    System.out.print("|");
                }
                else if ((i == 1) || (i == 4)) {
                    System.out.print("_");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
