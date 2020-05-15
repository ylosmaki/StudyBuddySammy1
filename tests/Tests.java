import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class Tests {

    private PineConeCalculator p = new PineConeCalculator();

    @Test
    public void rightNoOfTotalPineCones() {
        int total = p.TotalPineCones();
        assertEquals("incorrect calculation", 280, total);
    }

    @Test
    public void pineConesPerDay() {
        int total = p.NoOfPineConesPerDay();
        assertEquals("incorrect calculation", 30, total);

    }

}
