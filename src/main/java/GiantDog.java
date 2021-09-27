public class GiantDog implements Drivable, Domesticatable, Tradable{
    private int maxSpeed;

    public GiantDog() {
        this.maxSpeed = 42;
    }

    @Override
    public String sound() {
        return "Woof woof!";
    }

    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 5;
    }

    @Override
    public void downgradeSpeed() {
       if (maxSpeed > 0) {
           this.maxSpeed -= 5;
       }
    }

    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 50000;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
