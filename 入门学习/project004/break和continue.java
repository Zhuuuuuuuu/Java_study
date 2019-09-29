package learn.project004;
/*注意事项
break
* 1.可以用在switch中，一旦执行，整个swith立即结束
* 2.还可以用在循环语句中，一旦执行，整个循环语句立即结束，打断循环
* continue
1.一旦执行，跳过当前批次剩余内容，马上开始下一次循环
*/
public class break和continue {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            if (i == 4) {
//                break;
//            }
//                System.out.println("hello" + i);
//        }
//    }


    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }
    }
}