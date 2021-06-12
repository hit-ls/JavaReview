package 笔试真题;

//笔试题：
//        公司组织去外地旅游，现在安排分车。
//        输入总共员工个数membercount和大巴车的最大载容量carcount(不包括司机)，以及员工到达集合点的先后顺序。输出上车顺序。
//        例子：
//        输入：8 3
//        2 1 5 3 4 6 8 7
//        输出：
//        8 7 3 4 6 2 1 5
//        解释：车容量为3，即每3人一组，被安排进入一辆车。到达的顺序是第一组（2 1 5）、第二组（3 4 6）、第三组（8 7），输出即为第三组、第二组、第一组。
//
//        2 1 5 / 3 4 6 / 8 7
//        8 7 / 3 4 6 / 2 1 5

import java.util.Scanner;

public class Yuan2018 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, carCon, i, j, group, remain;
        size = sc.nextInt();
        carCon =sc.nextInt();
        int[] memNum = new int[size];
        for (i = 0; i < size; ++i) {
            memNum[i]=sc.nextInt();
        }

        group = size / carCon;
        remain = size % carCon;
        for (i = remain; i > 0; --i) {
            System.out.print(memNum[size - i]+" ");
        }
        for (j = 0; j < group; ++j) {
            for (i = carCon; i > 0; --i) {
                System.out.print(memNum[size - remain - j * carCon - i]+" ");
            }
        }
    }
}
