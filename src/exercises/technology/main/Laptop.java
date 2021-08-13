package exercises.technology.main;


import exercises.technology.main.Computer;

public class Laptop extends Computer {
    //fields- data types
   private int keyboardSize;
   private int trackpadSize;

    //constructor- called when new objects are created
    public Laptop(String deviceType,
                  String color,
                  String make,
                  String model,
                  int screenSize,
                  int weight) {
        super(deviceType, color, make, model, screenSize, weight);
    }

    //methods- waht objects do

    public int getKeyboardSize() {
        return keyboardSize;
    }

    public void setKeyboardSize(int keyboardSize) {
        this.keyboardSize = keyboardSize;
    }

    public int getTrackpadSize() {
        return trackpadSize;
    }

    public void setTrackpadSize(int trackpadSize) {
        this.trackpadSize = trackpadSize;
    }
}
