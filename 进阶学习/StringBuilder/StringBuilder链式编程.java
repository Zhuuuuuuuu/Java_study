package learn_2.StringBuilder_;

//链式编程：方法返回值是一个对象，可以继续调用方法
public class StringBuilder链式编程 {
    public static void main(String[] args) {
        //创建StringBuilder对象
        StringBuilder bu = new StringBuilder();

        bu.append("abc");
        bu.append(123);
        bu.append(true);
        bu.append(9.99);
        System.out.println(bu);


        //以上append可以用下面的【链式编程】代替
        System.out.println("abc".toUpperCase().toLowerCase().toUpperCase());
        bu.append("abc").append(123).append(true).append(9.99);


    }
}
