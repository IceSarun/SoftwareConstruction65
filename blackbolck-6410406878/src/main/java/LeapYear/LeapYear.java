package LeapYear;

public class LeapYear {
    private int year;

    public LeapYear(int year) {
        this.year = year;
    }

    public boolean isLeapYear() throws IllegalArgumentException{
        if(year<=0){
            throw new IllegalArgumentException("Invalid Year");
        }
        else {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                return true;
            } else {
                return false;
            }
        }

    }

    public int getYear() {
        return year;
    }
}
