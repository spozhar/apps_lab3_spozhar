package op.edu.ua.spozhar;

public class Main {
    public static void main(String[] args) {
        Vehicle[] array = new Vehicle[5];
        array[0] = new Vehicle("Volvo", 2011, 150000, true);
        array[1] = new Vehicle("BMW", 2022, 53400, true);
        array[2] = new Vehicle("Toyota", 2008, 320560, false);
        array[3] = new Vehicle("Skoda", 2024, 3200, true);
        array[4] = new Vehicle("Audi", 2015, 202000, false);

        for (int counter = 0; counter < 5; counter++) {

            System.out.println(array[counter].getModel() + ";" + array[counter].getYear() + ";" + array[counter].getMileage());
            System.out.println(array[counter].toString());
            System.out.println(array[counter].serviceVehicle());

        }
    }
}
