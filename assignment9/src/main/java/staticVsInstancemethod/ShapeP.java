package staticVsInstancemethod;

public class ShapeP {
    // Method overriding target
    public boolean isValid() {
        return true; // By default, any shape is valid
    }

    // Different return types (examples)
    public int getSides() {
        return 0; // generic shape has no fixed sides
    }

    public double getArea() {
        return 0.0; // base shape has no area
    }

    public String getName() {
        return "Shape";
    }
}