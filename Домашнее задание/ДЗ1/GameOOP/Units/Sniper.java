package Units;

public class Sniper extends Shooter {
    public Sniper(String name){
        super(name, 20, 0.6f, 2, 4, 5, 10, 0.5f);
    }
    public String getName() {
        return " Его имя " + name;
    }
}
