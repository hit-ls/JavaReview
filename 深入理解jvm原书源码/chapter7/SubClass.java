package 深入理解jvm原书源码.chapter7;

/**
 * @author zzm
 */
public class SubClass extends SuperClass {

    static {
        System.out.println("SubClass init!");
    }
}
