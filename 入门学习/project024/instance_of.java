package learn.project024;

/*
* 如何才能知道一个父类引用的对象，本来是什么子类
* 格式：
* 对象 instanceof 类名称
* 这将会得到一个[boolean]值得结果，也就是判断前面的对象能不能作为后面类型的实例*/
public class instance_of {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.eat();

//    如果希望调用子类特有方法，需要向下转型
//    需要判断是哪个子类实例
        if (animal instanceof Dog){
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

//        判断一下是否是Cat
        if (animal instanceof Cat){
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }

    }

}
