package Units.Shooter;

import Units.Unit;

public class Shooter extends Unit {
    protected int distance, maxCountBullet, currentCountBullet;
    protected float accuracy;

    public Shooter(String name, float hp, float luck, int speed, int damage,
            int distance, int maxCountBullet, float accuracy) {
        super(name, hp, luck, speed, damage);
        this.distance = distance;
        this.maxCountBullet = maxCountBullet;
        this.currentCountBullet = maxCountBullet;
        this.accuracy = accuracy;
    }

    void shoot() {

    }

    public String getName() {
        return " Его имя " + name;
    }
    @Override
    public String toString() {
        
        return getName();
    }



}
    
