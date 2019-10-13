package learn.project027;

/**/
public class Body { //外部类
    public class Heart{ //成员内部类
        //内部类的方法
        public void beat(){
            System.out.println("蹦蹦蹦");
            System.out.println("我叫“”“”“”:" + name);
        }

    }

    //外部类的成员变量
    private String name;

    public Body() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Body(String name) {
        this.name = name;
    }

    //    外部类的方法
    public void methodBody(){
        System.out.println("外部类的方法");
        new Heart().beat();
    }
}
