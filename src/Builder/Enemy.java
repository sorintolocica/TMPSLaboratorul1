package Builder;

public class Enemy {
    String name;
    int health;
    int attack;
    int defense;

    public String getName() { return name; }

    private void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    private void setHealth(int health) {
        this.health = health;
    }

    public int getAttack() {
        return attack;
    }

    private void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    private void setDefense(int defense) {
        this.defense = defense;
    }

    private Enemy(){}

    public static EnemyBuilder using()
    {
        return new EnemyBuilder();
    }

    static class EnemyBuilder
    {
        private final Enemy e = new Enemy();

        public EnemyBuilder name(String n)
        {
            e.name = n;
            return this;
        }

        public EnemyBuilder health(int h)
        {
            e.health = h;
            return this;
        }

        public EnemyBuilder attack(int a)
        {
            e.attack = a;
            return this;
        }

        public EnemyBuilder defense(int d)
        {
            e.defense = d;
            return this;
        }

        public Enemy build()
        {
            return e;
        }
    }

}
