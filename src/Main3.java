import java.util.Scanner;

interface Body {
    double surfaceArea();
    double volume();
    
    @Override
    String toString();
    
    @Override
    boolean equals(Object obj);
}

class Parallelepiped implements Body {
    private double length;
    private double width;
    private double height;

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double surfaceArea() {
        return 2 * (length * width + width * height + height * length);
    }

    @Override
    public double volume() {
        return length * width * height;
    }

    @Override
    public String toString() {
        return String.format("Parallelepiped [Length=%.2f, Width=%.2f, Height=%.2f, Surface Area=%.2f, Volume=%.2f]",
                             length, width, height, surfaceArea(), volume());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Parallelepiped that = (Parallelepiped) obj;
        return Double.compare(that.length, length) == 0 &&
               Double.compare(that.width, width) == 0 &&
               Double.compare(that.height, height) == 0;
    }
}

class Ball implements Body {
    private double radius;

    public Ball(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public String toString() {
        return String.format("Ball [Radius=%.2f, Surface Area=%.2f, Volume=%.2f]",
                             radius, surfaceArea(), volume());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Ball ball = (Ball) obj;
        return Double.compare(ball.radius, radius) == 0;
    }
}
public class Main3 {
    public static void main(String[] args) {
        Body[] bodies = new Body[2];
        try(Scanner in = new Scanner(System.in)){;
        System.out.println("Enter Parallelepiped details:");
        System.out.print("Length: ");
        double length = in.nextDouble();
        System.out.print("Width: ");
        double width = in.nextDouble();
        System.out.print("Height: ");
        double height = in.nextDouble();
        bodies[0] = new Parallelepiped(length, width, height);

        // Створення об'єкта Ball
        System.out.println("Enter Ball details:");
        System.out.print("Radius: ");
        double radius = in.nextDouble();
        bodies[1] = new Ball(radius);

        // Виведення інформації про всі об'єкти у масиві
        for (Body body : bodies) {
            System.out.println(body);
        }

        // Перевірка рівності двох об'єктів
        System.out.println("Checking equality:");
        if (bodies[0].equals(bodies[1])) {
            System.out.println("The two objects are equal.");
        } else {
            System.out.println("The two objects are not equal.");
        }
    }
    }
}
