import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GiantDogTest {
    GiantDog d;

    @Before
    public void setUp() throws Exception {
        d = new GiantDog("Ron");
    }

    @Test(timeout = 50)
    public void TestSound() {
        assertEquals("Woof woof!", d.sound());
    }

    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(42, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        d.upgradeSpeed();
        assertEquals(47, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        d.downgradeSpeed();
        assertEquals(37, d.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestGetPrice() {
        assertEquals(50000, d.getPrice());
    }
}
