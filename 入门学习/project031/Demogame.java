package learn.Project031;

public class Demogame {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setName("埃希");

//        方法一：使用单独定义的实现类
        hero.setSkill(new SkillImpl());

//        方法二：使用内名内部类和对象名
        Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("123");
            }
        };


//        方法三：匿名对象和匿名内部类
        hero.setSkill(new Skill() {
            @Override
            public void use() {
                System.out.println("456");
            }
        });
    }
}
