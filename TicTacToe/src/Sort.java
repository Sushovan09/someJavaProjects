public class Sort {
    //utility function sort (merge sort because that's what i know #flexing)
    public static void merge(int[] a, int b, int c, int d) {
        int m = c - b + 1;
        int n = d - c;

        int[] l = new int[m];
        int[] r = new int[n];

        for (int i = 0; i<m;i++)
            l[i] = a[b + i];
        for (int j = 0; j < n; j++)
            r[j] = a[c + j + 1];

        int x = 0;
        int y = 0;
        int z = b;

        while (x < m && y < n) {
            if (l[x] <= r[y]) {
                a[z] = l[x];
                x++;
            } else {
                a[z] = r[y];
                y++;
            }
            z++;
        }

        while (x < m) {
            a[z] = l[x];
            x++;
            z++;
        }

        while (y < n) {
            a[z] = r[y];
            y++;
            z++;
        }
    }

    public static void mergeSort(int[] arr, int beg, int end) {
        if (beg >= end) {
            return;
        } else {
            int mid = beg + (end - beg) / 2;
            mergeSort(arr, beg, mid);
            mergeSort(arr, mid + 1, end);
            merge(arr, beg, mid, end);
        }
    }

    public static void sort(int[] arr) {
        int beg = 0;
        int end = arr.length - 1;
        mergeSort(arr, beg, end);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        sort(arr);
        System.out.print("sorted array >>\t");
        for (int a:  arr) {
            System.out.print(" "+a);
        }
    }
}
