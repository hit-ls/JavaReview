package Sort;

import java.util.Scanner;

public class QuickSort {
    static int[] a=new int[10000];
    static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i=1;i<=n;++i)
            a[i]=sc.nextInt();
        QSort(1,n);
        for(int i=1;i<=n;++i)
            System.out.printf(a[i]+" ");
    }
    public static void QSort(int left,int right){
        int middle,temp;
        int i = left,j=right;
        middle = a[left + (right - left)/2];
        while(i<=j){
            if(a[i]<middle) ++i;
            if(a[j]>middle) --j;
            if(i<=j){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                ++i;
                --j;
            }
            if( i<right ) QSort(i,right);
            if( j>left  ) QSort(left,j);
        }
    }

}
