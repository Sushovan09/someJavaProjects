public class SeqCheck {
    private static int[][] seq = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {1, 4, 7}, {2, 5, 8}, {3, 6, 9}, {1, 5, 9}, {3, 5, 7}};

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
            System.out.println(b);
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

    public static void main(String[] args) {
        int[] user = {1,2,3,4};
        check(user,4,false);

    }
}
