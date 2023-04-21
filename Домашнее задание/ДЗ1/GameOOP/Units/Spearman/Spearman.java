package Units.Spearman;

import Units.Unit;

public class Spearman extends Unit {
    Spearman(String name){
        super(name, 30, 0.6f, 2, 4);
    }

    @Override
    public String toString() {
        return name;
    }
}
