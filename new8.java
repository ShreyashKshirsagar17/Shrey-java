package MatrixRotation;

//Runtime Polymorphism Example using Shapes

class Shape {
 void draw() {
     System.out.println("Drawing a shape");
 }
}

class Circle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a Circle");
 }
}

class Rectangle extends Shape {
 @Override
 void draw() {
     System.out.println("Drawing a Rectangle");
 }
}

public class new8 {
 public static void main(String[] args) {
     Shape s1 = new Circle();      // Upcasting
     Shape s2 = new Rectangle();   // Upcasting
     Shape s3 = new Shape();

     s1.draw();   // Drawing a Circle
     s2.draw();   // Drawing a Rectangle
     s3.draw();   // Drawing a shape
 }
}