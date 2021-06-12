package Sort;

import java.util.Scanner;

public class SelectSort {
    public static int[] a = new int[10000];
    public static int n;

    public static void SelectSort(){
        int i,j,min,temp;
        for( i = 1; i < n; ++i){
            min = i;
            for(j=i+1;j<=n;++j){
                if(a[j]<a[min])
                    min = j;
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=1;i<=n;++i)
            a[i] = sc.nextInt();
        SelectSort();
        for( i = 1;i <= n; ++i)
        System.out.printf(a[i]+" ");
    }
}
