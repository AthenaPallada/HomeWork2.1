package HW_2course.Car.transport.driver;

import HW_2course.Car.transport.Truck;
import HW_2course.Car.transport.category.CategoryC;
import HW_2course.Car.transport.category.CategoryD;

public class DriverC extends Driver<Truck> {
    //private CategoryC categoryC;

    public DriverC(String fullName, boolean hasDrivingLicense, int experience) { //CategoryC categoryC) throws IllegalAccessException {
        super(fullName, hasDrivingLicense, experience);
        //setCategory(categoryC);
    }

    @Override
    public void startMove(Truck transport) {
        transport.start();
    }

    @Override
    public void stopMove(Truck transport) {
        transport.end();
    }

    @Override
    public void refillMove(Truck transport) {
        System.out.println("Водитель: " + getFullName() + " заправляет грузовик " + transport.getBrand());
    }
}