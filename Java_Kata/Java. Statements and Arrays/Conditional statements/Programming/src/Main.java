import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

  public static void main(String[] args) {

    AtomicInteger number = new AtomicInteger();
    number.set(new Scanner(System.in).nextInt());
    if (number.get() > 0) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}