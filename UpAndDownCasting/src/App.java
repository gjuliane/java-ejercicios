import Herencia.Vehicle;
import Herencia.ChargeVehicle;
import Herencia.SportVehicle;
public class App {
    public static void main(String[] args) throws Exception {
        // Polymorfism
        Vehicle vehicles[] = new Vehicle[3];
        vehicles[0] = new Vehicle("Audi", "A3", 2020);
        vehicles[1] = new SportVehicle(2,"Audi", "A11", 2022);
        vehicles[2] = new ChargeVehicle(25, "Dina", "D1000", 1959);

        System.out.println("Polymorfism");
        for(Vehicle vehicle:vehicles) {
            vehicle.showInfo();
        }

        // Upcasting
        // Convertir un objeto de la subclase en uno de la super clase
        System.out.println("Upcasting");
        SportVehicle vup1 = new SportVehicle(2,"Audi", "A11", 2022);
        Vehicle vehicle1 = vup1;
        vehicle1.showInfo();
        Vehicle vehicle2 = new SportVehicle(2,"Audi", "A12", 2023);
        vehicle2.showInfo();

        // Downcasting
        System.out.println("Downcasting");
        Vehicle vd2 = new SportVehicle(2, "Mazda", "M5", 2022);
        vd2.showInfo();
        SportVehicle vd3 = (SportVehicle) vd2;  // Downcasting
        vd3.showInfo();
    }
}
