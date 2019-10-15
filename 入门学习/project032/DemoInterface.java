package learn.project032;

/*接口可以作为返回值和参数列表*/
//java.util,List正式Arraylist所实现的接口
//List是接口，Arraylist是实现类

import java.util.ArrayList;
import java.util.List;

public class DemoInterface {
    public static void main(String[] args) {
//        左边是接口名称，右边是实现类名称，这就是多态的写法
        List<String> list = new ArrayList<>();

        List<String> result = addNames(list);
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

    }

//    这里相当于让一个苦力去打水， 给她一个空杯子List<String>， 她就是addNames， 打完了水再还给我
    public static List<String> addNames(List<String> list ) {
        list.add("古力娜扎");
        list.add("马儿扎哈");
        list.add("撒由那拉");
        return list;
    }
}
