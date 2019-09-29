package learn.project004;

public class dowhile {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("我错了" + i);
        }

        System.out.println("=====================");

        int i = 1;
        do {
            System.out.println("我错了" + i);
            i++;
        }while (i <= 10);
    }
}
