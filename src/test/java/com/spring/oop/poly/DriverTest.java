package com.spring.oop.poly;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {

    @Test
    void dTest() {

        Driver d = new Driver();

        Avante car = (Avante) d.buyCar(2000);

        System.out.println("car = " + car);
        System.out.println(car instanceof Avante);
        car.run();
        car.nMode();
    }
}