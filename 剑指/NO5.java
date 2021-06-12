package 剑指;

public class NO5 {
    public static void main(String[] args) {
        String s = "We are happy.";
        System.out.println(replaceSpace(s));
    }
    public static String replaceSpace(String s) {
        char[] a = s.toCharArray();
        StringBuilder res = new StringBuilder();
        int length = a.length;
        for(int i = 0; i < length ; ++i){
            if(a[i]==' '){
                res.append("%20");
            }
            else{
                res.append(a[i]);
            }
        }
        return res.toString();
    }
}
