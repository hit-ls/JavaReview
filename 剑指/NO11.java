package 剑指;

public class NO11 {
    public static void main(String[] args) {

    }
//    public int minArray(int[] numbers) {
//        if(numbers.length == 0)
//            return -2147483648;
//        else if(numbers.length == 1)
//            return numbers[0];
//        for( int i = 0; i < numbers.length-1; ++i){
//            if(numbers[i]>numbers[i+1])
//                return numbers[i+1];
//        }
//        return numbers[0];
//    }
    public int minArray(int[] numbers){
        if(numbers.length == 0)
            return -2147483648;
        else if(numbers.length == 1)
            return numbers[0];
        int left = 0, right = numbers.length - 1,mid=0;
        while(left < right){
            mid = (right-left)/2 + left;
            if(numbers[right] > numbers[mid])
                right = mid;
            else if(numbers[right] < numbers[mid])
                left = mid+1;
            else
                right--;
        }
        return numbers[mid];
    }
}
