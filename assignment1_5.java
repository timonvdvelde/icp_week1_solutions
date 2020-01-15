/*
Write code to print the area of a circle with radius r. The radius should
be obtained as user input using a Scanner.

Make sure the output of your program looks like this:

  What is the radius of the circle?
  3.4
  The area of the circle is:
  36.2984
*/

/*
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double radius;
    Scanner input = new Scanner(System.in);
    System.out.println("What is the radius of the circle?");
    radius = input.nextDouble();
    // Your code goes here:
    
  }
}
*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double radius;
    double area;
    Scanner input = new Scanner(System.in);
    System.out.println("What is the radius of the circle?");
    radius = input.nextDouble();
    area = radius * radius * 3.14;
    System.out.println("The area of the circle is:");
    System.out.println(area);
  }
}

