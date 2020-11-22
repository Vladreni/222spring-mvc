package web.model;

public class Car {
    private String model;
    private short year;
    private String colour;

    public Car() {

    }

    public Car(String model, short year, String colour) {
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", colour='" + colour + '\'' +
                '}';
    }
}
