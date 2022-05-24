package Singleton;

public class Main {

    public static void main(String[] args)
    {
        var player  = Player.getInstance();
        System.out.println("Current HP: " + player.getHealth());
        System.out.println("Current XP: " + player.getXp());
        player.takeDamage(23);
        System.out.println("You engage in a fight with a goblin.\nYou take 23 damage! Current HP: " + player.getHealth());
        player.obtainXp(45);
        System.out.println("You defeated an enemy!\nYou gained 45 XP! Current XP: " + player.getXp());
        player.setHealth(100);
        System.out.println("Oh no! It's an ambush! Brace yourselves!\nYour HP dropped to 100! Current HP: " + player.getHealth());
        player.setXp(0);
        System.out.println("You were cursed by an evil mage!\nYou lost all your XP! Current XP: " + player.getXp());
    }
}
