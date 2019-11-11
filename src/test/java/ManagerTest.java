import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Tim Bapple", 2001, 45000, "Accounting");
    }

    @Test
    public void canRaiseSalary() {
        manager.raiseSalary(10000.00);
        assertEquals(55000.00, manager.getSalary(), 0.0);
    }

    @Test
    public void canGetRaiseAmount() {
        assertEquals(450.00, manager.payBonus(), 0.0);
    }
}
