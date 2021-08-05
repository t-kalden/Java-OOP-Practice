package CarpetCostCalculator;

public class Floor {
    private double width, length;

    public Floor(double width, double length) {
        this.width = width;
        this.length = length;
        if(width < 0)
            this.width = 0;
        if(length < 0)
            this.length = 0;
    }
    public Floor(){

    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea() {
        return this.width * this.length;
    }
}
