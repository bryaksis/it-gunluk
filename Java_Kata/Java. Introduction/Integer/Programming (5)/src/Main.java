import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    int number = (new Scanner(System.in)).nextInt();
    System.out.println((number/100)+(number/10)%10+(number%10));
  }
}