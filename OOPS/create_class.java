package OOPS;

class RectangleTest {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        // r.setLength(4.5 , 4.5);
        System.out.println(r.area());
    }
}

class Rectangle {
    private double length;
    private double breadth;

    Rectangle() {
        length = 1;
        breadth = 1;
    }
    void setLength(double len , double br) {
        length = len;
        breadth = br;
    }

    public double area() {
        return length * breadth;
    }

}