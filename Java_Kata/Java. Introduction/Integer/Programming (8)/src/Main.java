import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int number = new Scanner(System.in).nextInt();
    if (number % 2 == 1) {
      number += 1;
    } else {
      number += 2;
    }
    System.out.println(number);
  }
}