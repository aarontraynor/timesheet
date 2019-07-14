import java.util.Date;
import model.Employer;
import model.Shift;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.*;

public class ShiftTests {
    private Shift s;

    @Before
    public void createEmployerStruct() {
        Employer e = new Employer("This is a Company Ltd.", 10.0);
        Shift s = new Shift(e, new Date(2000, 1, 1, 9, 30), new Date(2000, 1, 1, 17, 30));
    }

    @Ignore
    public void constructorWithParametersShouldStoreParametersInObjectStates() {
        // Write test for getters
    }

    // Write tests for setters
}
