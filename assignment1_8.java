/*
\section{1.8}
Write code that calculates the distance between two 2D points (x1, y1) and
(x2, y2) as specified by a user.

The formula for distance between two points is:
$$ \sqrt{(x1 - x2)^2 + (y1 - y2)^2} $$

You can use the method Math.pow(a, 2) to calculate $a^2$ and Math.sqrt(a)
to calculate $\sqrt{a}$.

Make sure your output looks like this:

  Specify x1:
  2.3
  Specify y1:
  -8.3
  Specify x2:
  4
  Specify y2:
  1.1
  The distance between the two points is:
  9.552486587271401

*/

/*
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  }
}

*/

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double x1, y1, x2, y2, distance;
    Scanner input = new Scanner(System.in);

    // Gathering user input.
    System.out.println("Specify x1:");
    x1 = input.nextDouble();
    System.out.println("Specify y1:");
    y1 = input.nextDouble();
    System.out.println("Specify x2:");
    x2 = input.nextDouble();
    System.out.println("Specify y2:");
    y2 = input.nextDouble();
    
    // Calculating distance.
    distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
    System.out.println("The distance between the two points is:");
    System.out.println(distance);
  }
}

