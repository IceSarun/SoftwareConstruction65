import LeapYear.LeapYear;
import org.junit.jupiter.api.Test;

import javax.naming.InsufficientResourcesException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class LeapYearTest {

    @Test
    public void isLeapYearNegativeYear(){
        LeapYear year = new LeapYear(-6);
        Throwable exception = assertThrows(IllegalArgumentException.class,
                ()->{year.isLeapYear();});
        assertEquals("Invalid Year",exception.getMessage());
    }
    @Test
    public void isLeapYearZeroYear(){
        LeapYear year = new LeapYear(0);

        //Throwable exception = assertThrows(.....class,()->{year.isLeapYear()});

        Throwable exception = assertThrows(IllegalArgumentException.class,
                ()->{year.isLeapYear();});
        assertEquals("Invalid Year",exception.getMessage());
    }

    @Test
    public void isLeapYearFalseYear(){
        LeapYear year = new LeapYear(2200);
        assertEquals(false,year.isLeapYear());
    }
    @Test
    public void isLeapYearTrueYearDivideFourHundredCase(){
        LeapYear year = new LeapYear(2800);
        assertEquals(true,year.isLeapYear());
    }
    @Test
    public void isLeapYearFalseYearDivideOtherCase(){
        LeapYear year = new LeapYear(2020);
        assertEquals(true,year.isLeapYear());
    }
}
