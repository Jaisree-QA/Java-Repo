package staticVsInstancemethod;

public class CircleC extends ShapeP {
	private int radius;

    // Constructor
    public CircleC(int radius) {
        this.radius = radius;
    }

    // Overriding parent isValid()
    @Override
    public boolean isValid() {
        return radius > 0;
    }

    // Overriding other methods with different return types
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    // Additional method unique to Circle
    public int getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        CircleC circle1 = new CircleC(5);
        CircleC circle2 = new CircleC(-3);

        // Circle 1
        System.out.println(circle1.getName());        // Circle
        System.out.println("Valid: " + circle1.isValid()); // true
        System.out.println("Area: " + circle1.getArea());
        

        // Circle 2
        System.out.println(circle2.getName());        // Circle
        System.out.println("Valid: " + circle2.isValid()); // false
        System.out.println("Area: " + circle2.getArea());
    }
}
