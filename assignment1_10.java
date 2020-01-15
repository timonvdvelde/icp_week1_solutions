import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int hours, days, years;
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter a number of hours: ");
    hours = input.nextInt();

    // One year is 365 days
    // One day is 24 hours
    // This is the amount of days for the total hours
    days = hours / 24;

    // This many years have passed after so many days
    years = days / 365;

    // Now we need to subtract the amount of full years from days
    days = days - years * 365;
    
    // Show result
    System.out.println(years + " years and " + days + " days have passed since then.");
  }
}


