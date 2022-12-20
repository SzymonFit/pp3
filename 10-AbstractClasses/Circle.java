public class Circle extends Shape {
    
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public double area(){
        return 3.14*radius*radius;
    }

    public double perimeter(){
        return 2*3.14*radius;
    }
    
    public static void main(String[] args) {
        Circle c1 = new Circle(7);
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
    }
}
