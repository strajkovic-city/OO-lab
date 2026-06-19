import java.util.ArrayList;
import java.util.List;

// Custom exception needed for the code to compile
class FullCollectionException extends Exception {
    public FullCollectionException(String message) {
        super(message);
    }
}

// Interface needed for the code to compile
interface Shape {
    public double getArea();
}

// Rectangle class needed for the code to compile
class Rectangle implements Shape {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        if (height > 0) this.height = height;
        if (width > 0) this.width = width;
    }

    public double getArea() {
        return width * height;
    }
}

// Circle class needed for the code to compile
class Circle implements Shape {
    private double radius;
    private static final double PI = 3.14;

    public Circle(double radius) {
        if (radius > 0) this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }
}

// AllShapes class needed for the code to compile
class AllShapes {
    private List<Shape> shapes = new ArrayList<>();

    public void addShapes(Shape sh) {
        shapes.add(sh);
    }

    public void removeShapes(Shape sh) {
        shapes.remove(sh);
    }

    public void printAllAreas() {
        for (Shape s : shapes) {
            System.out.println(s.getArea());
        }
    }

    public int getCount() {
        return shapes.size();
    }
}

// YOUR EXACT PROGRAM STRUCTURE FIXED
public class ShapeProgram {
    
    // Your exact helper methods made static so they can be called directly inside main
    public static void removeShape(AllShapes Shapes, Shape sh) {
        Shapes.removeShapes(sh);
    }

    public static void addShape(AllShapes Shapes, Shape sh)
    throws FullCollectionException {

        if (Shapes.getCount() >= 50) {
            throw new FullCollectionException(
            "Collection is full!");
        }
        
        Shapes.addShapes(sh);
    }

    public static void main(String[] args) {
        AllShapes Shapes = new AllShapes();
        Rectangle r1 = new Rectangle(30, 18);
        Rectangle r2 = new Rectangle(180, 34);
        Circle c = new Circle(14.8);
        
        Shapes.addShapes(r1);
        Shapes.addShapes(r2);
        Shapes.removeShapes(c);
        Shapes.printAllAreas();

        // Your exact try-catch structure fixed 
        try {
            addShape(Shapes, r1);
            addShape(Shapes, r2);
        }
        catch (FullCollectionException e) { 
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        
        Shapes.printAllAreas();
    }
}