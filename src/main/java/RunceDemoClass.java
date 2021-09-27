/*
pspspspsps
 */
public class RunceDemoClass implements Tradable, Drivable{
    private int speed;

    @Override
    public int getPrice() {
        return 0;
    }

    @Override
    public void upgradeSpeed() {
        this.speed++;
    }

    @Override
    public void downgradeSpeed() {
        this.speed--;

    }

    @Override
    public int getMaxSpeed() {
        return 0;
    }

    public static void main(String[] args) {

    }
}
