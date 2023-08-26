import electricBill.Bill;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BillTest {

    @Test
    public void calculateBillLessThanOneHundredFifty(){
        Bill bill = new Bill(127);
        assertEquals(450.97,bill.calculateBill(),0.001);
    }

    @Test
    public void calculateBillBetweenOneHundredFiftyToFourHundred(){
        Bill bill = new Bill(239);
        assertEquals(1046.8,bill.calculateBill(),0.001);
    }

    @Test
    public void calculateBillMoreThanFourHundred(){
        Bill bill = new Bill(503);
        assertEquals(2261.48,bill.calculateBill(),0.001);
    }

    @Test
    public void calculateBill149Unit(){
        Bill bill = new Bill(149);
        assertEquals(522.47,bill.calculateBill(),0.001);
    }

    @Test
    public void calculateBillOneHundredFifty(){
        Bill bill = new Bill(150);
        assertEquals(525.72,bill.calculateBill(),0.001);
    }

    @Test
    public void calculateBillOneHundredFiftyOne(){
        Bill bill = new Bill(151);
        assertEquals(675.44,bill.calculateBill(),0.001);
    }
    @Test
    public void calculateBill399Unit(){
        Bill bill = new Bill(399);
        assertEquals(1722,bill.calculateBill(),0.001);
    }

    @Test
    public void calculateBillFourHundred(){
        Bill bill = new Bill(400);
        assertEquals(1726.22,bill.calculateBill(),0.001);
    }
    @Test
    public void calculateBillMoreThanFourHundredAndOne(){
        Bill bill = new Bill(401);
        assertEquals(1810.64,bill.calculateBill(),0.001);
    }

}
