package Units;

import java.util.ArrayList;

public class Monk extends Magican {

    public Monk(String name, ArrayList<Unit> team) {
        super(name, 20, 0.6f, 2, 2, 20, 5, 1, 10, 50, team);
    }

    @Override
    public String toString() {
        return "Монах";
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

}
