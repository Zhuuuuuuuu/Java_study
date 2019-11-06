package learn_2.泛型;

/*
* 定义一个【含有泛型的类】，模拟ArrayList集合
* 泛型是一个未知的数据类型，当我们【不确定什么数据类型】的时候，可以使用泛型
* 泛型可以【接受任意类型数据】，可以使用Integer，String,Student....
* 【创建对象】的时候确定泛型的数据类型*/
public class SelfClass<E> {
    private E name;

    public E getName() {
        return name;
    }

    public void setName(E name) {
        this.name = name;
    }
}
