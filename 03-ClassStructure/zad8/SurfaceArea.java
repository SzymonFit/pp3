public class SurfaceArea {
    
    public static double circleArea(double radius){
        return radius * radius * 3.14;
    }
    public static double rectangleArea(double recRow1, double recRow2){
       return recRow1 * recRow2;
    }
    public static double triangleArea(double triBasis, double triHeight){
        return (triBasis * triHeight)/2;
    }
    
    public static void main (String[] args) {
        System.out.println(circleArea(2));
        System.out.println(rectangleArea(3,6));
        System.out.println(triangleArea(2,10));
    }
    
}
