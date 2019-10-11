package learn.project024;

/*向上转型一一定是安全的，没有问题，正确的，但是也有一个弊端
* 对象一旦向上转型成为父类，那么就无法调用子类原本特有的内容*/

//解决方法：向下转型进行【还原】
public class Main {
    public static void main(String[] args) {
        //对象的向上转型，就是，父类引用指向子类对象
        Animal animal = new Cat();
        animal.eat(); //向上转型成了animal

        //向下转型还原成Cat
        Cat cat = (Cat) animal;
        cat.catchMouse();

        //下面是错误的向下转型
        //本来new的是一只猫，现在非要转型成狗
        //错误的写法，虽然不会报错，但是会出现异常
        Dog dog = (Dog) animal; //出现异常：java.lang.ClassCastException
        dog.eat();
    }
}
