import java.util.Scanner;

class InvalidDimensionException extends Exception{
    public InvalidDimensionException(String message){
        super(message);
    }
}

interface Shape{
    public double getPerimeter();
}

class Square implements Shape {
    private double side;

    public Square(double side){
        if (side > 0){
            this.side = side;
        }
    }

    public double getSide(){
        return this.side;
    }

    public double getPerimeter(){
        return 4 * this.side;
    }
}

class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        if (radius > 0){
            this.radius = radius;
        }
    }

    public double getPerimeter(){
        return 2 * this.radius * Math.PI;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Unesite stranicu velikog kvadrata (a):");
            double a = scanner.nextDouble();

            if (a <= 0){
                throw new InvalidDimensionException("Stranica kvadrata mora biti veća od 0!");
            }

            Square largeSquare = new Square(a);

            double inscribedSquareSide = Math.sqrt(Math.pow(a / 2, 2) + Math.pow(a / 2, 2));
            Square inscribedSquare = new Square(inscribedSquareSide);

            double circleRadius = inscribedSquareSide / 2;
            Circle inscribedCircle = new Circle(circleRadius);

            System.out.println("Obim velikog kvadrata je: " + largeSquare.getPerimeter());
            System.out.println("Obim upisanog kvadrata: je: " + inscribedSquare.getPerimeter());
            System.out.println("Obim upisanog kruga je: " + inscribedCircle.getPerimeter());
        
        } catch (InvalidDimensionException e){
            System.out.println("Greska: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}