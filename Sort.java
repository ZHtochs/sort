package sort;

public abstract  class Sort {
    public  abstract  void    sort(int arrays[]);
    public static void exchange(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
