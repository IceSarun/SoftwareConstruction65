package electricBill;

public class Bill {
    private int unit;

    public Bill(int unit) {
        this.unit = unit;

    }

    public double calculateBill(){
        if(unit<=150){
            return (unit*3.25)+38.22;
        }
        else if(unit>150 && unit <=400){
            return (unit*4.22)+38.22;

        }
        return (unit*4.42)+38.22;

    }

}