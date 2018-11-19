import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int nSquirrels = scanner.nextInt();
    int nNuts = scanner.nextInt();
    System.out.println(nNuts%nSquirrels);
  }
}