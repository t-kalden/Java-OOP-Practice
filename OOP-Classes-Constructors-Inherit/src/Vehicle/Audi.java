package Vehicle;

public class Audi extends Car{
    private String model;
    private double price, year;

    public Audi( String color, int wipers, String carType, int seats, int topSpeed, String model, double price, double year) {
        super(color, wipers, carType, seats, topSpeed);
        this.model = model;
        this.price = price;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getYear() {
        return year;
    }

    public void setYear(double year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Audi{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", year=" + year +
                '}';
    }

    @Override
    public void accelarate() {
        System.out.println(this.model + " is accelerating ");
//        super.accelarate();
    }

    @Override
    public void brake() {
        System.out.println(this.model + " is breaking ");
//        super.brake();
    }

    @Override
    public void steer(String dir) {
        System.out.println(this.model + " is steering " + dir);
//        super.steer(dir);
    }
}
