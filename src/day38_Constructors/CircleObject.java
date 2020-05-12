package day38_Constructors;

public class CircleObject {

    public static void main(String[] args) {
       double r = 3;

       Circle circle1 = new Circle(r);

       double areaOfCirlce = circle1.area();

        System.out.println( areaOfCirlce  );

    }
}
