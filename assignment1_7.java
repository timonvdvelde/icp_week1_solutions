import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double length, weight, bmi;
    Scanner input = new Scanner(System.in);

    // Getting data
    System.out.println("Please enter your length in m:");
    length = input.nextDouble();
    System.out.println("Please enter your weight in kg:");
    weight = input.nextDouble();

    // Calculations
    bmi = weight / Math.pow(length, 2);
    System.out.println("Your BMI is:");
    System.out.println(bmi);
  }
}

