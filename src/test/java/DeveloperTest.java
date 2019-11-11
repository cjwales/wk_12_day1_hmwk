import org.junit.Before;
import org.junit.Test;
import staff.techstaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Johnny Mahonny", 2002, 35000);
    }

    @Test
    public void canRaiseSalary() {
        developer.raiseSalary(10000.00);
        assertEquals(45000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void canGetRaiseAmount() {
        assertEquals(350.00, developer.payBonus(), 0.0);
    }

    @Test
    public void canNotRaiseSalaryByNegative() {
        developer.raiseSalary(-20000.00);
        assertEquals(35000, developer.getSalary(), 0.00);
    }
}
