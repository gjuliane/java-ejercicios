package Herencia;


public class SportVehicle extends Vehicle {
    int doors;

    /**
     * @param mark
     * @param model
     * @param age
     */
    public SportVehicle(int doors, String mark, String model, int age) {
        super(mark, model, age);
        this.doors = doors;
    }

    public void showInfo(){
        System.out.println(
            "\nMark: " + getMark()
            +"\nModel: "+ getModel()
            +"\nAge: "+ getAge()
            +"\nDoors: "+ doors
        );
    }

}