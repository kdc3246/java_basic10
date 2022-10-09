package com.spring.oop.poly;

public class Driver {

    public Driver() {

        drive(new Avante());

        Car car = buyCar(4000);
        if (car != null) car.run();
    }

    void drive(Car c) {
        c.run();
    }

    Car buyCar(int money) {
        if (money == 3000) {
            return new Sonata();
        } else if (money == 2000) {
            return new Avante();
        } else if (money == 4000) {
            return new Granduer();
        } else {
            return null;
        }
    }
}
