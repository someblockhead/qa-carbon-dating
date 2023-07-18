import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Carbon14DatingTest {
    //#1 Build a test for calculateAge();
    @Test
    public void testCalculateAge() {
        Carbon14Dating example = new Carbon14Dating(50.0);
        example.calculateAge();

        assertEquals(5730, example.calculateAge());
    }

    /* This comment was made on 7/18/2023 and is a test for git pushing. */
    
    /*
        #2 Build a test for getRemainingAmount() in the
        scenario the given remaining value is <= 1.
    */

   /*
        #3 Build a test for getRemainingAmount() in the
        scenario the given remaining value is >= 1.
    */

    // #4 Build a test for the toString() method.
}
