import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Shape the_shape = null;
    int size = 10;
    int which;
    Scanner input = new Scanner(System.in);

    System.out.println("Enter 1-Circle, 2-Square, 3-Triangle");
    which = input.nextInt();
    
    switch (which) {
      case 1: the_shape = new Circle(size); break;
      case 2: the_shape = new Square(size); break;
      case 3: the_shape = new Triangle(size); break;
    }

    // polymorphism
    System.out.println("The area of the " + 
          the_shape.getName() + " is " + the_shape.area());
    
    System.out.println("The perimeter of the " + 
        the_shape.getName() + " is " + the_shape.perimeter());

    System.out.println("The num of vertices of the " + 
      the_shape.getName() + " is " + the_shape.numVertices());

    if(the_shape.isPolygon())
      System.out.println("The " + the_shape.getName() + " is a polygon");
    else
      System.out.println("The " + the_shape.getName() + " is NOT a polygon");    
   }
}