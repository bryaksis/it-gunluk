import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int hour1 = scanner.nextInt();
    int minute1 = scanner.nextInt();
    int second1 = scanner.nextInt();

    int hour2 = scanner.nextInt();
    int minute2 = scanner.nextInt();
    int second2 = scanner.nextInt();

    System.out.println(Main.getSecond(hour2,minute2,second2) - Main.getSecond(hour1,minute1,second1));
  }

  /**
   *
   * @param hour
   * @param minute
   * @param second
   * @return
   */
  static int getSecond(int hour, int minute, int second) {
    return hour * 60 * 60 + minute * 60 + second;
  }
}