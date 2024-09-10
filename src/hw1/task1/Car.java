package hw1.task1;

import java.math.BigDecimal;

public class Car {

    private String model;
    private Boolean turbo;
    private BigDecimal power;
    private BigDecimal volumeEngine;


    public Car(String model, Boolean turbo, BigDecimal power, BigDecimal volumeEngine) {
        this.model = model;
        this.turbo = turbo;
        this.power = power;
        this.volumeEngine = volumeEngine;
    }

    public Car() {}

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", turbo=" + turbo +
                ", power=" + power +
                ", volumeEngine=" + volumeEngine +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Boolean getTurbo() {
        return turbo;
    }

    public void setTurbo(Boolean turbo) {
        this.turbo = turbo;
    }

    public BigDecimal getPower() {
        return power;
    }

    public void setPower(BigDecimal power) {
        this.power = power;
    }

    public BigDecimal getVolumeEngine() {
        return volumeEngine;
    }

    public void setVolumeEngine(BigDecimal volumeEngine) {
        this.volumeEngine = volumeEngine;
    }
}
