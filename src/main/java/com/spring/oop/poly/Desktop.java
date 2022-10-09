package com.spring.oop.poly;

import com.spring.oop.inherit.Player;
import com.spring.oop.inherit.Warrior;

public class Desktop {

    Monitor monitor;

    Monitor[] arr;

    public Desktop() {
        this.monitor = new LgMonitor();

        arr = new Monitor[] {
            new LgMonitor(),
                new HpMonitor()
        };
    }
}
