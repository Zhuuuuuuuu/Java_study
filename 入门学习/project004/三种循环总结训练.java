package learn.project004;
/*
* 注意事项
* 1.如果条件判断从来没满足过，那么for和while循环一次都不执行，但do-while至少执行一次
* 2.for循环的变量在小括号中定义，只有循环内部才可以使用，出来就没用了
* 3.while循环和do-while循环初始化定义在外部，所以一直有用
* */
public class 三种循环总结训练 {
    public static void main(String[] args) {
//        //forloop
//        for(int i =1;i <= 100;i++){
//            System.out.println("这是一个forloop");
//        }

        //whileloop
////        int i = 1;
//////        while (i<=100){
//////            System.out.println("这是一个whileloop");
//////            i++;
//        }
        //dowhile循环
        int i =1;
        do{
            System.out.println("这是一个dowhile循环");
            i++;
        }while (i<=100);
    }
}

