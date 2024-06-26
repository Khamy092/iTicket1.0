package main;

/**
 * Vehicle class - Represents a vehicle with a unique id and a plate number.
 */
public class Vehicle {

    private int id;
    private String plateNumber;

    // Constructor
    public Vehicle(String plateNumber) {
        this.id = Math.abs(plateNumber.hashCode());
        this.plateNumber = plateNumber;
    }


    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    // toString
    @Override
    public String toString() {
        return "Vehicle{" +
                "id=" + id +
                ", plateNumber='" + plateNumber + '\'' +
                '}';
    }

}
