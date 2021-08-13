package exercises.technology.main;

import exercises.technology.main.Computer;

public class Smartphone extends Computer {
    //fields - data types
    private String carrierName;

    //constructor- called when new objects are created
    public Smartphone(String carrierName, String  deviceType, String color, String make, String model, int screenSize, int weight) {
        super(deviceType, color, make, model, screenSize, weight ); //allows us to access constructor from parent class
    }

    //methods- what object does

    public String getCarrierName() {
        return carrierName;
    }

    public void setCarrierName(String carrierName) {
        this.carrierName = carrierName;
    }
}
