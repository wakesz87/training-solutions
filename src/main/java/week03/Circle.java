package week03;



public class Circle {



    public static final double PI = 3.14;
     private  final double r;

     public Circle(double r){
         r = 10;
         this.r = r;
     }
     public  double calculatePerMeter(double r) {
         return 2 * r *PI;
     }



}
