package learn.project002;
/*题目要求:
* 比较两个数据类型是否相等
* 数据类型分别为两个byte类型，两个short类型，两个int类型，两个long类型
* 要求并在main方法中进行测试*/
public class 比较两个数据类型是否相等 {
    public static void main(String[] args) {
//        byte a = 10;
//        byte b = 20;
//        long a = 30L;
//        long b = 80L;
        System.out.println(isSame(10L,20L));
    }

    public static boolean isSame(byte a,byte b){
        System.out.println("byte执行");
        boolean same;
        if (a == b){
            same = true;
        }
        else{
            same = false;
        }
        return same;
    }

    public static boolean isSame(short a,short b){
        System.out.println("short执行");
        boolean same = a == b ? true:false;
        return  same;
    }

    public static boolean isSame(int a,int b){
        System.out.println("int执行");
        return a == b;
    }

    public static boolean isSame(long a,long b){
        System.out.println("long执行");
        if (a == b){
            return true;
        }else{
            return false;
        }
    }

}
