package week10;

public class Lingkaran extends BangunDatar {
    private int radius;
    private static final double Pi = 3.14;

    public Lingkaran(int radius) {
        this.radius = radius;
    }

    //overriding
    public double luas() {
        return radius * radius * Pi;
    }

    //overriding
    public double keliling() {
        return 2 * Pi * radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}