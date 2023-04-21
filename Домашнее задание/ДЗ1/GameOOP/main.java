
import Units.*;
import Units.Shooter.Crossbowman;
import Units.Shooter.Shooter;
import Units.Shooter.Sniper;

public class main {

    public static void main(String[] args) {
        
        Sniper sh = new Sniper("Кулебяка");
        
        System.out.println(sh);

        Shooter sho = new Shooter("Шайтан", 0, 0, 0, 0, 0, 0, 0);
        System.out.println(sho);

        Crossbowman cr = new Crossbowman("Лука");
        System.out.println(cr);

        


    }
}