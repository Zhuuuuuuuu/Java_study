package learn.project027;

/*成员变量如果出现了重名的现象
* 格式为：
* 外部类名称.this.成员变量名*/
public class Outer {

    int num = 10;
    public class Inner{
        int num = 20;
        public void methodInner(){
            int num = 30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer.this.num);
        }

    }
}
