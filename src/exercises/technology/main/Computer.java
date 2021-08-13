package exercises.technology.main;

public class Computer {
    //fields - data types
    private String deviceType;
    private String color;
    private String make;
    private String model;
    private int screenSize;
    private int weight;


    //constructor- called when new objects are created

    public Computer(String deviceType, String color, String make, String model, int screenSize, int weight){
        this.deviceType = deviceType;
        this.color = color;
        this.make = make;
        this.model = model;
        this.screenSize = screenSize;
        this.weight = weight;

    }

    //methods- what the object does

    public String getDeviceType() { return deviceType; }

    public void setDeviceType(String deviceType) { this.deviceType = deviceType; }

    public String getColor() { return color; }

    public void setColor(String color) { this.color = color; }

    public String getMake() { return make; }

    public void setMake(String make) { this.make = make; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public int getScreenSize() { return screenSize; }

    public void setScreenSize(int screenSize) { this.screenSize = screenSize;}

    public int getWeight() { return weight; }

    public void setWeight(int weight) { this.weight = weight; }



    // other methods

    //print device description



}
