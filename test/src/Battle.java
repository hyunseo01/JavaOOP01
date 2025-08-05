public class Battle {
    public void start(Pokemon p1, Pokemon p2) {
        System.out.println("배틀 시작! " + p1.getName() + " vs " + p2.getName());

        while (true) {
            p1.attack(p2);
            if (p2.isFainted()) {
                System.out.println(p2.getName() + "이(가) 쓰러졌습니다!");
                System.out.println(p1.getName() + " 승리!");
                break;
            }

            p2.attack(p1);
            if (p1.isFainted()) {
                System.out.println(p1.getName() + "이(가) 쓰러졌습니다!");
                System.out.println(p2.getName() + " 승리!");
                break;
            }
        }
    }
}
