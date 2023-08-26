import com.example.Numeric;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumericTestDecision {
    private Numeric number;
    @BeforeEach
    public void setUp(){
        number = new Numeric();
    }
    @Test
    public void oddNumberAndPositive() {
        int[] x = {13,15,17,39,103,125,1021};
        assertEquals(7, number.oddOrPos(x));
    }
    @Test
    public void oddNumberButNegative() {
        int[] x = {-13,-15,-17,-39,-103,-125,-1021};
        assertEquals(7, number.oddOrPos(x));
    }

    @Test
    public void positiveNumberButNotOdd() {
        int[] x = {22,24,108,1390,96,2022};
        assertEquals(6, number.oddOrPos(x));
    }

    @Test
    public void negativeNumberAndNotOdd() {
        int[] x = {-22,-24,-108,-1390,-96,-2022};
        assertEquals(0, number.oddOrPos(x));
    }
    @Test
    public void zeroLoop() {
        int[] x = {};
        assertEquals(0, number.oddOrPos(x));
    }

    @Test
    public void oneLoop() {
        int[] x = {11};
        assertEquals(1, number.oddOrPos(x));
    }

    @Test
    public void moreThanOneLoop() {
        int[] x = {12,13,14,15,-16,-17,-190,100};
        assertEquals(6, number.oddOrPos(x));
    }




}
