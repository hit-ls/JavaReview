package Sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] bubble = new int[]{9,8,7,6,5,4,3,2,1};
        int size = bubble.length;
        bubbleSort(bubble);
        for(int i = 0 ; i < size; ++i)
            System.out.println(bubble[i]);
    }
    public static void bubbleSort(int[] bubble){
        int size = bubble.length;
        int temp = 0;
        boolean flag = false;
        for(int i = 0; i < size-1; ++i) {
            for (int j = 0; j < size - 1 - i; ++j) {
                if (bubble[j] > bubble[j + 1]) {
                    flag = true;
                    temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                }
            }
            if (!flag)
                break;
            else
                flag = false;
        }
    }
}
