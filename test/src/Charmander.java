public class Charmander extends Pokemon {
    public Charmander(int level) {
        super("파이리", level, 100);
    }
    @Override
    public void attack(Pokemon target){
        System.out.println("파이리의 불꽃 셰례!");
        target.takeDamage(level * 10);
    }
}
