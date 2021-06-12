package Sort;

import java.util.Scanner;

public class InsertSort {
    public static int[] a = new int[10000];
    public static int n;

    public static void InsertSort(){
        int i,j,temp;
        for(i = 2; i <= n; ++i){
            for(j = i; j > 1 && a[j] < a[j-1] ; --j){
                temp = a[j];
                a[j] = a[j-1];
                a[j-1] =temp;
            }
        }
    }
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i = 1; i <= n; ++i)
            a[i] = sc.nextInt();
        InsertSort();
        for(i = 1; i <= n; ++i)
            System.out.printf(a[i]+" ");
    }
}
