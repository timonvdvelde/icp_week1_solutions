import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    double start, interest, years, result;
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter a start amount: ");
    start = input.nextDouble();
    System.out.print("Please enter a monthly interest rate: ");
    interest = input.nextDouble();
    System.out.print("Please enter a number of years: ");
    years = input.nextDouble();

    // Formula for exponential growth.
    result = start * Math.pow(1 + interest / 100, years * 12);

    System.out.println("Money afterwards is: " + result);
  }
}

