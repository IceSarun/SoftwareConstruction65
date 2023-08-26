import com.example.Numeric;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumericTestLoop {
    private Numeric number;
    @BeforeEach
    public void setUp(){
        number = new Numeric();
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