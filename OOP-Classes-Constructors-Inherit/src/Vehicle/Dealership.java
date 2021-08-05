package Vehicle;

public class Dealership {
    public static void main(String[] args) {
        Audi r8 = new Audi("Yellow",1,"Super Car", 2, 185, "RS8", 115_00, 2021);
        Audi q8 = new Audi("Space Gray", 1, "SUV", 5,135, "Q8", 78_000, 2021);

        q8.accelarate();
        q8.brake();
        r8.steer("left");
    }
}
