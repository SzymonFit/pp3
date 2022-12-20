public class Triangle extends Shape{

    private double a;
    private double height;


    public Triangle(double a, double height) {
        this.a = a;
        this.height = height;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double area(){
        return (a*height)/2;
    }

    public double perimeter(){
        return 3*a;
    }
    public static void main(String[] args) {
        Triangle t = new Triangle(8, 5.5);
        System.out.println(t.area());
        System.out.println(t.perimeter());
    }

}
