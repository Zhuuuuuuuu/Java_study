package learn.project003;

/*如果
x>=3    y=2x+1
1<x<3   y=2x
x<=1    y=2x-1
* */
public class ifelseif语句 {
    public static void main(String[] args) {
        int x = 10;
        int y;

        if (x >= 3){
            y = 2*x+1;

        }else if(x > 1 && x < 3){
            y = 2*x;

        }else {
            y = 2*x - 1;
        }
        System.out.println("结果是" + y);
    }
}
