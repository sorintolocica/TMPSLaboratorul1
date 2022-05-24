package Singleton;

public class Player {
    private static Player _player = null;

    int health;
    int xp;

    public int getHealth() {
        return health;
    }

    public int getXp() {
        return xp;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void takeDamage(int hitpoints) {
        this.health -= hitpoints;
    }

    public void obtainXp(int exp) {
        this.xp += exp;
    }

    private Player() {
        this.health = 100;
        this.xp = 30;
    }

    public static Player getInstance() {
        if (_player == null) {
            synchronized (Player.class) {
                if (_player == null) _player = new Player();
            }
        }
        return _player;
    }
}