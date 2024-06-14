package ua.edu.op.opozhar;

public class Car {
    String brand;
    String model;
    int year;
    double fuelConsumption;

    public Car() {}

    public Car(int y, String m, String b, double fc) {
        brand = b;
        model = m;
        year = y;
        fuelConsumption = fc;
    }

    public Car(int year) {
        this.year = year;
    }

    public String getInfo() {
        return  "Our car is: " + brand +"; Model: " + model + "; Year: " + year;
    }

    public double calculateConsumption(double distance, double fuelPrice){
        double fuelPer100km = (fuelConsumption / 100) * distance;
        return fuelPer100km * fuelPrice;
    }

    public static void  main(String[] args) {
        Car firstCar = new Car(1997, "Corolla", "Toyota", 10.5);
        Car secondCar = new Car(1999, "Master", "Renault", 9.8 );
        Car thirdCar  = new Car(2008, "Accord", "Honda", 7.6 );
        Car fourthCar = new Car(2005, "Camry", "Toyota", 10.8 );
        Car fifthCar = new Car(2011, "Rio", "Kia", 7);
        double fuelPrice = 51.4;
        System.out.println(firstCar.getInfo());
        System.out.println(secondCar.getInfo());
        System.out.println(thirdCar.getInfo());
        System.out.println(fourthCar.getInfo());
        System.out.println(fifthCar.getInfo());
        System.out.println("================");
        System.out.println("Consumption for car1: " + firstCar.calculateConsumption(30, fuelPrice));
        System.out.println("Consumption for car2: " + secondCar.calculateConsumption(530.45, fuelPrice));
        System.out.println("Consumption for car3: " + thirdCar.calculateConsumption(350, fuelPrice));
        System.out.println("Consumption for car4: " + fourthCar.calculateConsumption(100, fuelPrice));
        System.out.println("Consumption for car5: " + fifthCar.calculateConsumption(76.43, fuelPrice));
    }
}

