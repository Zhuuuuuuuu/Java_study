package learn_2.增强for循环;

import java.util.ArrayList;

/*增强for循环：底层使用的也是迭代器，使用for循环的格式，简化了迭代器的书写
* Collection<E> extends Iterable<E>:所有单列集合都可以使用增强for
* public interface Iterable<T> 实现这个接口允许对象成为foreach语句的目标
*
* 增强for循环：用来遍历【集合】和【数组】
*
* 格式：
*   for(集合/数组的数据类型 变量名: 集合名/数组名){
*       sout(变量名)
* }*/
public class 增强for_each {
    public static void main(String[] args) {
        demo02();
    }

    //使用增强for循环遍历集合
    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("ddd");
        list.add("eee");
        for (String s :list) {
            System.out.println(s);
        }
    }

        //使用增强for循环遍历数组
    private static void demo01() {
        int[] arr = {1,2,3,4,5};
        for (int i:arr){
            System.out.println(i);

        }
    }
}
