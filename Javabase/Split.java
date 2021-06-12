package Javabase;

public class Split {
    public static void main(String[] args) {
        System.out.println("普通分割");
        String str = "Welcome-to-Runoob";
        for(String stra : str.split("-")){
            System.out.println(stra);
        }
        System.out.println("设置分割组数");
        for(String stra:str.split("-",2)){
            System.out.println(stra);
        }
        System.out.println("分割符为转义符");
        String str1 = "cs.hit.edu.cn";
        for(String stra: str1.split("\\.")){
            System.out.println(stra);
        }
        System.out.println("分割符有多个");
        String str2 = "aaaandbbborcccd";
        for(String stra : str2.split("and|or")){
            System.out.println(stra);
        }
    }
}
