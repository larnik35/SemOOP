package Seminar1Task1.Units;

public class Peasant extends Player {
    public Peasant() {
        super(100, 100, 1, 1, 0, "hobbit", "Kolyan");
        this.brave = 10;
    }

    protected int brave; // храбрость

    public void prick (){

    }// колоть(укол)

    @Override
    public void step() {

    }

    @Override
    public String getInfo() {
        return name + " здоровье "+ helth +" макс. уровень здоровья: " + maxHelth +" скорость: "+ speed +
                " урон: " + damage + " защита: " +def + " раса " + race;
        }

    }

