import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int var = scanner.nextInt();
    System.out.println(((var + 1) * var + 2) * var + 3);
  }
}