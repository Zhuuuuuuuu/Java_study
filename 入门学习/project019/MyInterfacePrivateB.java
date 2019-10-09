package project019;


public interface MyInterfacePrivateB {
    public static void methoddefault1(){
        System.out.println("静态方法1");
    }

    public static void methoddefault2(){
        System.out.println("静态方法2");
    }

    private static void methodcommon(){
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }
}
