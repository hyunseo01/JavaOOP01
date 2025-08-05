public class Main {
    public static void main(String[] args) {
        Pokemon pikachu = new Pikachu(2);
        Pokemon charmander = new Charmander(1);

        Battle battle = new Battle();
        battle.start(pikachu, charmander);
    }
}
