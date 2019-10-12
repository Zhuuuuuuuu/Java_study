package learn.project025;

/*
* final关键字表示最终，不可变的
*
* 常见的4种用法：
* 1.可以用来修饰一个【类】
* 2.可以用来修饰一种【方法】
* 3.可以用来修饰一个【局部变量】
* 4.可以用来修饰一个【成员变量】
* */
public class final_use {
    public static void main(String[] args) {
//        对于【基本类型】来说，不可变说的是变量当中的数据不可改变
//        对于【引用类型】来说，不可变说的是变量当中的地址值不可改变
        Student stu1 = new Student("赵丽颖");
        System.out.println(stu1);
        System.out.println(stu1.getName());
        stu1 = new Student("霍建华");
        System.out.println(stu1);
        System.out.println(stu1.getName());

        System.out.println("============================================");

//        对于引用类型来说，地址值不可改变，但是里面的内容是可以改变的
        final Student stu2 = new Student("高圆圆");
        System.out.println(stu2.getName());
        System.out.println(stu2);
        stu2.setName("赵又廷");
        System.out.println(stu2.getName());
        System.out.println(stu2);

    }
}
