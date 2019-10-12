package learn.project025;

/*
* 对于成员变量来说，如果使用final关键字进行修饰，那么这个变量也照样是不可变的
*
* 1.由于成员变量具有默认值，所有用了final之后【必须手动赋值】，不会再给默认值了
* 2.对于final的成员变量，要么使用【直接赋值】(在final处直接赋值)，要么通过【构造方法进行赋值】（在无参构造处赋值，并注掉setter方法）
*   【二者选其一】
* 3.必须保证类当中【所有重载的构造方法】，【都最终对final成员变量进行了赋值】*/

public class Person {

    private final String name ;//= "鹿晗";

    public Person(String name) {
        this.name = name;
    }

    public Person() {
        name = "鹿晗";
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
