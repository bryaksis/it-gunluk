import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numStudentClass1 = scanner.nextInt();
    int numStudentClass2 = scanner.nextInt();
    int numStudentClass3 = scanner.nextInt();
    int neededDesk = 0;
    neededDesk += Main.neededDesk(numStudentClass1);
    neededDesk += Main.neededDesk(numStudentClass2);
    neededDesk += Main.neededDesk(numStudentClass3);

    System.out.println(neededDesk);
  }

  /**
   *
   * @param numberOfStudent
   * @return
   */
  static int neededDesk(int numberOfStudent) {
    return (((numberOfStudent % 2) == 0) ? (numberOfStudent / 2) : ((numberOfStudent / 2) + 1));
  }
}