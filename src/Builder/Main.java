package Builder;

public class Main {

    public static void main(String[] args) {
        Enemy enemy = Enemy.using()
                .name("Jack")
                .attack(100)
                .health(500)
                .defense(50)
                .build();

        System.out.println(enemy.getName());
        System.out.println(enemy.getHealth());
        System.out.println(enemy.getAttack());
        System.out.println(enemy.getDefense());
    }
}
