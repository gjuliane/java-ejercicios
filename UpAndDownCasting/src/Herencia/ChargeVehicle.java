package Herencia;

public class ChargeVehicle extends Vehicle{
    int seats;

    /**
     * @param mark
     * @param model
     * @param age
     * @param seats
     */
    public ChargeVehicle( int seats,String mark, String model, int age ) {
        super(mark, model, age);
        this.seats = seats;
    }

    /**
     * @return the seats
     */
    public int getSeats() {
        return seats;
    }

    /**
     * @param seats the seats to set
     */
    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void showInfo(){
        System.out.println(
            "\nMark: " + getMark()
            +"\nModel: "+ getModel()
            +"\nAge: "+ getAge()
            +"\nSeats: "+ seats
        );
    }
}
