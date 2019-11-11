import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("Gemma Wangle", 1000, 100000, "Management", 1000000);
    }

    @Test
    public void canRaiseSalary() {
        director.raiseSalary(10000.00);
        assertEquals(110000, director.getSalary(), 0.0);
    }

    @Test
    public void canGetRaiseAmount() {
        assertEquals(1000.00, director.payBonus(), 0.0);
    }
}
