package Vehicle;

public class Vehicle {
    private int wheels, steeringWheel, mirrors,  wipers;
    private String color;

    public Vehicle(int wheels, int steeringWheel, int mirrors, String color, int wipers) {
        this.wheels = wheels;
        this.steeringWheel = steeringWheel;
        this.mirrors = mirrors;
        this.color = color;
        this.wipers = wipers;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(int steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMirrors() {
        return mirrors;
    }

    public void setMirrors(int mirrors) {
        this.mirrors = mirrors;
    }

    public int getWipers() {
        return wipers;
    }

    public void setWipers(int wipers) {
        this.wipers = wipers;
    }

    public void steer(String dir){
        System.out.println("Steering " + dir);
    }

    public void accelarate(){
        System.out.println("Accelerating");
    }

    public void brake(){
        System.out.println("Breaking");
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "wheels=" + wheels +
                ", steeringWheel=" + steeringWheel +
                ", mirrors=" + mirrors +
                ", color=" + color +
                ", wipers=" + wipers +
                '}';
    }
}
