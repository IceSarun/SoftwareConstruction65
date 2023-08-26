package exercise2_1;

public class KiloDrivenMeasure implements Measurer {

    @Override
    public double measure(Object object) {
        Car car = (Car) object;
        return car.getKiloDriven();
    }
}
