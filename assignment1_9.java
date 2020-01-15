import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int number;
    int digit1, digit2, digit3;
    Scanner input = new Scanner(System.in);

    System.out.print("Enter a number between 0 and 999: ");
    number = input.nextInt();
    
    digit1 = number % 10;
    number = number / 10;
    digit2 = number % 10;
    digit3 = number / 10;

    // System.out.printf("%d %d %d\n", digit1, digit2, digit3);

    int value = digit1 * digit2 * digit3;
    System.out.println("The multiplied value of the digits is: " + value);
  }
}

