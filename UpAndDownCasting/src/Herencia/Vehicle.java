package Herencia;
public class Vehicle {
    private String mark;
    private String model;
    private int age;

    /**
     * @param mark
     * @param model
     * @param age
     */
    public Vehicle(String mark, String model, int age) {
        this.mark = mark;
        this.model = model;
        this.age = age;
    }

    /**
     * @return the mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    public void showInfo(){
        System.out.println(
            "\nMark: " + mark
            +"\nModel: "+ model
            +"\nAge: "+ age
        );
    }
}