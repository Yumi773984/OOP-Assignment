package Java_Coursework;

class Sphere {
    private double diameter;

    // Constructor
    public Sphere(double diameter) {
        this.diameter = diameter;
    }

    // Getter
    public double getDiameter() {
        return diameter;
    }

    // Setter
    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    // Method to calculate the radius
    private double getRadius() {
        return diameter / 2;
    }

    // Method to calculate the volume
    public double getVolume() {
        double radius = getRadius();
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Method to calculate the surface area
    public double getSurfaceArea() {
        double radius = getRadius();
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    // Method to return a one-line description of the sphere
    @Override
    public String toString() {
        return "Sphere with diameter: " + diameter;
    }
}

public class MultiSphere {
    public static void main(String[] args) {
        // Creating Sphere objects
        Sphere sphere1 = new Sphere(2);
        Sphere sphere2 = new Sphere(10);
        // Displaying initial spheres' information
        System.out.println(sphere1);
        System.out.println("Volume: " + sphere1.getVolume());
        System.out.println("Surface Area: " + sphere1.getSurfaceArea());

        System.out.println();

        System.out.println(sphere2);
        System.out.println("Volume: " + sphere2.getVolume());
        System.out.println("Surface Area: " + sphere2.getSurfaceArea());

        System.out.println();

        // Changing the diameter of sphere1
        sphere1.setDiameter(33);

        // Displaying updated sphere1 information
        System.out.println("Updated " + sphere1);
        System.out.println("Updated Volume: " + sphere1.getVolume());
        System.out.println("Updated Surface Area: " + sphere1.getSurfaceArea());
    }
}
