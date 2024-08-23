public class ShapeInterface {
    interface Shape {
        double area();
        double perimeter();
    }

    static class Rectangle implements Shape {
        private double length;
        private double width;
        
        public Rectangle(double length, double width) {
            this.length = length;
            this.width = width;
        }
        
        @Override
        public double area() {
            return length * width;
        }
        
        @Override
        public double perimeter() {
            return 2 * (length + width);
        }
    }

    static class Circle implements Shape {
        private double radius;
        
        public Circle(double radius) {
            this.radius = radius;
        }
        
        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
        
        @Override
        public double perimeter() {
            return 2 * Math.PI * radius;
        }
    }
    
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 7);
        Circle circle = new Circle(3.5);
        
        System.out.println("Rectangle Area: " + rectangle.area());            // Output: 35.0
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());  // Output: 24.0
        
        System.out.println("Circle Area: " + circle.area());                  // Output: 38.48451
        System.out.println("Circle Perimeter: " + circle.perimeter());        // Output: 21.99115
    }
}
