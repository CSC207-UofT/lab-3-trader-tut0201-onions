public class Vehicle implements Tradable, Drivable{

    private int maxSpeed;
    private int price;

    public Vehicle() {
        this.maxSpeed = 100;
        this.price = 20000;
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed = this.maxSpeed + 100;
    }

    @Override
    public void downgradeSpeed() {
        this.maxSpeed = this.maxSpeed - 100;
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
