public class CynthiaCar implements Drivable, Domesticatable, Tradable {
    private int maxSpeed;

    public CynthiaCar() {
        this.maxSpeed = 100;
    }
    /**
     * Return the sound made by this creature.
     *
     * @return The sound made by this creature.
     **/
    @Override
    public String sound() {
        return "Buzz...";
    }

    /**
     * Increase the maximum speed of this Vehicle.
     **/
    @Override
    public void upgradeSpeed() {
        this.maxSpeed += 10;
    }

    /**
     * Decrease the maximum speed of this Vehicle.
     **/
    @Override
    public void downgradeSpeed() {
        this.maxSpeed -= 10;
    }

    /**
     * Return the maximum speed of this Vehicle.
     *
     * @return The current maximum speed of this Vehicle.
     **/
    @Override
    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    @Override
    public int getPrice() {
        return 20;
    }

    @Override
    public String toString(){
        String id = super.toString();
        return id + " (Max speed: " + this.maxSpeed +")";
    }
}
