import org.junit.Before;
import org.junit.Test;
import staff.techstaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Clive Cheddar", 3000, 35000);
    }

    @Test
    public void canRaiseSalary() {
        databaseAdmin.raiseSalary(10000.00);
        assertEquals(45000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canGetRaiseAmount() {
        assertEquals(350.00, databaseAdmin.payBonus(), 0.0);
    }
}
