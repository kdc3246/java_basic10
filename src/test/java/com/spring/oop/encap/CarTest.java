package com.spring.oop.encap;

import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    void carTest() {
        Car car = new Car("포르쉐911", 320);

        car.on();

        // Alt + Enter
        for (int i = 0; i < 7; i++) {
            car.accelerator();
        }
    }
}
