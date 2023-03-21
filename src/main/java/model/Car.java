package model;

public class Car {
    private String brand;
    private int series;
    private String color;

    public Car() {
    }

    public Car(String brand, int series, String color) {
        this.brand = brand;
        this.series = series;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
