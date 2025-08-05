abstract class Pokemon {
     private String name;
     public int level;
     public int hp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pokemon(String name, int level, int hp) {
        this.name = name;
        this.level = level;
        this.hp = hp;
    }

    abstract void attack(Pokemon target);

    public void takeDamage(int damage){
        hp -= damage;
        if (hp < 0) hp = 0;
        System.out.println(name + "이(가) " + damage + " 데미지를 입음! (남은 HP: " + hp + ")");
    }

    public boolean isFainted(){
        return hp <= 0;
    }
}

//객체지향적으로 프로그래밍 되었다
//유지보수
