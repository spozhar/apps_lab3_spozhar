package op.edu.ua.spozhar;

public class Vehicle {
    private String model;
    private int year;
    private double mileage;
    private boolean status;

    public Vehicle(String model, int year, double mileage, boolean status) {
        this.model = model;
        this.year = year;
        this.mileage = mileage;
        this.status = status;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String serviceVehicle() {
        if (status) {
            return "Технічне обслуговування пройдено";
        } else {
            return "Технічне обслуговування не пройдено";
        }
    }

    public String toString() {
        return "Vehicle" +
                "model= " + model + '\''+
                "year= " + year +
                "mileage=" + mileage +
                "status=" + status +
                "}";
    }
}



