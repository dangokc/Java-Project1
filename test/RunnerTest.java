import dangokc.com.Runner;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class RunnerTest {
    
    private Runner r;
    private int racerId = 123456;
    private String raceActivity = "Running";
    private String name = "Huy";
    private int age = 32;
    private String brand = "Adidas";
    
    public RunnerTest() {
    }
    
    @Before
    public void setUp() {
        r = new Runner();
    }
    
    @After
    public void tearDown() {
        r = null;
    }
    
    @Test
    public void testRunnerConstructor() {
        assertNotNull("Default runner could not be created", r);
        Runner r2 = new Runner(racerId, name, age, brand);
        assertNotNull("Explicit Runner could not be created", r2);
        assertEquals("RacerID not set correctly on r2"
                        , racerId
                        , r2.getRacerId()
                    );
        assertEquals("Name not set correctly on r2"
                        , name
                        , r2.getName()
                    );
        assertEquals("Age not set correctly on r2"
                        , age
                        , r2.getAge()
                    );
        assertEquals("Shoe Brand not set correctly on r2"
                        , brand
                        , r2.getShoeBrand()
                    );
    }    
       
}
