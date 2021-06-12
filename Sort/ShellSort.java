package Sort;

import java.util.Scanner;

public class ShellSort {
    public static int[] a = new int[10000];
    public static int n;

    public static void ShellSort(){
        int k = 1,temp;
        while( k < n/3){
            k = k * 3 + 1;
        }
        while(k >= 1){
            for(int i = k; i <=n; ++i){
                for(int j = i ; j > k && a[j] < a[j-k]; j -= k){
                    temp = a[j];
                    a[j] = a[j-k];
                    a[j-k] = temp;
                }
            }
            k = k/3;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1; i <= n; ++i)
            a[i] = sc.nextInt();
        ShellSort();
        for(int i=1; i <= n; ++i)
            System.out.printf(a[i]+" ");
    }
}
