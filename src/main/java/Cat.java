/**
 * an amazing class that does stuff wow look at this documentation
 */
public class Cat implements Domesticatable, Tradable {
    /**
     * name - cat's name
     * age - cat's age
     * weight - cat's weight in pounds (freedom units)
     */
    public String name;
    public int age;
    public int weight;
    public String state;

    Cat() {
        name = "Chunky Boi Pif";
        age = 2;
        weight = 20000000;
        state = "Sleeping";
    }

    Cat(String nm, int a, int wg) {name = nm;age = a;wg = weight;state = "Awake";}

    public void sleep() {
        state = "Sleeping";
        System.out.println(name + " went to sleep. ");
    }

    public void wakeup() {
        state = "Awake";
        System.out.println(name + " woke up. ");
    }

    public String sound() {
        String sound = "h";
        sound = sound + "i";
        sound = sound + "s";
        sound = sound + "s";
        sound = sound + "s";
        sound = sound + "s";
        sound = sound + "s";
        sound = sound + "s";
        sound = sound + "s";
        sound = sound + "s";
        sound = sound + "s";
        sound = sound + "s";
        sound = sound + "s";
        sound = sound + "s";
        sound = sound + "s";
        sound = sound + "s";
        sound = sound + "s";
        return sound;
    }

    public int getPrice() {
        return 20000;
    }
}
