package com.company;

import java.util.Objects;

public class Lamp {
    String color;
    int power;
    int temperature;
    Boolean sensor;
    String led;
    int garantyTermin;
    String produceDate;
    String Country;
    String city;

    public Lamp(String color, int power, int temperature) {
        this.color = color;
        this.power = power;
        this.temperature = temperature;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lamp)) return false;
        Lamp lamp = (Lamp) o;
        return power == lamp.power && temperature == lamp.temperature && color.equals(lamp.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, power, temperature);
    }
}
