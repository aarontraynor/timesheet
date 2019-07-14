import model.Employer;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EmployerTests {
    private Employer e;

    @Before
    public void createEmployerStruct() {
        e = new Employer("This is a Company Ltd.", 10.0);
    }

    @Test
    public void constructorWithParametersShouldStoreParametersInObjectStates() {
        assertEquals("This is a Company Ltd.", e.getCompanyName());
        assertEquals(10.0, e.getHourlyRate(), 0.001);
    }

    @Test
    public void companyNameSetterShouldChangeCompanyName() {
        e.setCompanyName("A New Company Name LLP");

        assertEquals("A New Company Name LLP", e.getCompanyName());
    }

    @Test
    public void hourlyRateSetterShouldChangeHourlyRate() {
        e.setHourlyRate(15.0);

        assertEquals(15.0, e.getHourlyRate(), 0.001);
    }
}
