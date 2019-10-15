package learn.project030;

/*类作为[成员变量]
* */
public class Demomain {
    public static void main(String[] args) {
        Hero hero = new Hero();
        hero.setAge(20);
        hero.setName("盖伦");

        Weapon weapon = new Weapon();
        hero.setWeapon(weapon);
    }
}
