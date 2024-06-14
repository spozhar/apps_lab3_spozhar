class Car {
    String brand;
    String model;
    int year;
    double fuelConsumption;
    public Car() {}    public Car(int y, String m, String b, double fc) {
        brand = b;
        model = m;
        year = y;
        fuelConsumption = fc;
    }
    public Car(int year) {
        this.year = year;
    }
    public String getinfo() {
        return "Our Car is: " + brand + "; Model: " + model + "; Year:" + year;
    }
    public double calculateConsumption(double distance, double fuelPrice) {
        double fuelPer100km = (fuelConsumption / 100) * distance;
        return fuelPer100km * fuelPrice;
    }
    public static void main(String[] args) {
        Car firstCar = new Car(1997,"Corolla", "Toyota", 10.5);
        Car secondCar = new Car(1999,"Master", "Renault", 9.8);
        Car thirdCar = new Car(2018,"Accord", "Honda", 7.6);
        Car fouthCar = new Car(2005, "Сamry", "Toyota", 10.8);
        Car fifthCar = new Car(2011, "Rio", "Kia", 7);
        double fuelPrice = 50;
        System.out.println(firstCar.getinfo());
        System.out.println(secondCar.getinfo());
        System.out.println(thirdCar.getinfo());
        System.out.println(fouthCar.getinfo());
        System.out.println(fifthCar.getinfo());
        System.out.println("==================");
        System.out.println("Consumption for car1: " + firstCar.calculateConsumption(30, fuelPrice));
        System.out.println("Consumption for car2: " + secondCar.calculateConsumption(100, fuelPrice));
        System.out.println("Consumption for car3: " + thirdCar.calculateConsumption(50, fuelPrice));
        System.out.println("Consumption for car4: " + fouthCar.calculateConsumption(100, fuelPrice));
        System.out.println("Consumption for car5: " + thirdCar.calculateConsumption(45, fuelPrice));

    }
}