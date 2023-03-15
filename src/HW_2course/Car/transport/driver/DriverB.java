package HW_2course.Car.transport.driver;

import HW_2course.Car.transport.Bus;
import HW_2course.Car.transport.category.CategoryB;

public class DriverB extends Driver<Bus> {

    public DriverB(String fullName, boolean hasDrivingLicense, int experience) { //CategoryB categoryB) throws IllegalAccessException {
        super(fullName, hasDrivingLicense, experience);
        //setCategory(categoryB);
    }

    @Override
    public void startMove(Bus transport) {
        transport.start();
    }

    @Override
    public void stopMove(Bus transport) {
        transport.end();
    }

    @Override
    public void refillMove(Bus transport) {
        System.out.println("Водитель: " + getFullName() + " заправляет автобус " + transport.getBrand());
    }
}