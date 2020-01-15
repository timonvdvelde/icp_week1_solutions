class Main {
  public static void main(String[] args) {
    // time in ms since January 1st, 1970
    long milliSeconds= System.currentTimeMillis();    
    long seconds = milliSeconds / 1000;
    long currentSeconds = seconds % 60;
    long minutes = seconds / 60;
    long currentMinutes = minutes % 60;
    long hours = minutes / 60;
    long currentHours = hours % 24;

    // timezone correction
    currentHours = currentHours + 1;
    System.out.printf("%d:%d:%d\n", currentHours, currentMinutes, currentHours);
  }
}

