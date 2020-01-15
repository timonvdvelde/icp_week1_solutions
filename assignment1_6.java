import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double length, width, area;
    Scanner input = new Scanner(System.in);
    System.out.println("What is the length of the rectangle?");
    length = input.nextDouble();
    System.out.println("What is the width of the rectangle?");
    width = input.nextDouble();
    area = width * length;
    System.out.println("The area of the rectangle is:");
    System.out.println(area);
  }
}

