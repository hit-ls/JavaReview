package Sort;

import java.util.Scanner;

public class HeapSort {
    public static void heapAdjust(int[] a, int i, int len){
        int temp = a[i];
        for(int k = 2 * i +1; k < len; k = k*2+1){
            if( k + 1 < len)
                if( a[k+1] > a[k])
                    ++k;
            if( a[k] > temp){
                a[i] = a[k];
                i = k;
            }else
                break;
        }
        a[i] = temp;
    }
    public static void heapSort(int[] a){
        for(int i = a.length/2-1; i >= 0; --i)
            heapAdjust(a,i,a.length);
        for(int i = a.length-1; i > 0; --i){
            int temp = a[i];
            a[i] = a[0];
            a[0] = temp;
            heapAdjust(a,0,i);
        }
    }
    public static void main(String[] args) {
        int[] a;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];
        for(int i=0; i < n; ++i)
            a[i] = sc.nextInt();
        heapSort(a);
        for(int i=0; i < n; ++i)
            System.out.printf(a[i]+" ");
    }
}
