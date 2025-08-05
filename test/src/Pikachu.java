public class Pikachu extends Pokemon {
    public Pikachu(int level) {
        super("피카츄", level, 100);
    }

    @Override
    public void attack(Pokemon target) {
        System.out.println("피카츄의 백만볼트");
        target.takeDamage(level * 10);
    }
}
