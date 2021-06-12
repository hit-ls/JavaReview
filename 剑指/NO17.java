package 剑指;

public class NO17 {
//    public int[] printNumbers(int n) {
//        int a = (int)Math.pow(10,n)-1;
//        int[] res = new int[a];
//        for(int i = 0; i < a; ++i ){
//            res[i] = i+1;
//        }
//        return res;
//    }
    public int[] printNumbers(int n) {
        int a = (int)Math.pow(10,n)-1;

        int[] res = new int[a];
        for(int i = 0; i < a; ++i ){
            res[i] = i+1;
        }
        return res;
    }
}
