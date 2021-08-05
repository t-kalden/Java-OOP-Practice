package Vehicle;

public class Car extends Vehicle{
    private String carType;
    private int seats, topSpeed;

    public Car( String color, int wipers, String carType, int seats, int topSpeed) {
        super(4, 1, 3, color, wipers);
        this.carType = carType;
        this.seats = seats;
        this.topSpeed = topSpeed;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                ", seats=" + seats +
                ", topSpeed=" + topSpeed +
                '}';
    }
}
