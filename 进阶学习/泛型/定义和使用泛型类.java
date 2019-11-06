package learn_2.泛型;

import javax.lang.model.element.NestingKind;

public class 定义和使用泛型类 {
    public static void main(String[] args) {
//        不写泛型默认是Object类型
        SelfClass gc = new SelfClass();
        gc.setName("只能是字符串");
        Object obj = gc.getName();

//        创建SelfClass对象，泛型使用Integer
        SelfClass<Integer> gc2 = new SelfClass<>();
        gc2.setName(1);

        Integer name = gc2.getName();
        System.out.println(name);

//        创建SelfClass对象，泛型使用String类型
        SelfClass<String> gc3 = new SelfClass<>();
        gc3.setName("小明");
        String name1 = gc3.getName();
        System.out.println(name1);
    }
}
