package learn.project001;
/*强制类型转换
特点：不能自动完成
规则：范围小的类型 范围小的变量名 = （范围小的类型）原本范围大的数据;
 */
public class 数据类型强制转换 {
    public static void main(String[] args) {
        //左边int,右边long,
        //long -> int

        //规则：范围小的类型 范围小的变量名 = （范围小的类型）原本范围大的数据;
        int num1 = (int)100L;
        System.out.println(num1);


    }
}
