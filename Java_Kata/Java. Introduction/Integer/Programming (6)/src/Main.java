import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    int number = (new Scanner(System.in)).nextInt();
    //We accept as the number has 3 digits
    int reversedNumber = (number % 10) * 100;
    reversedNumber += ((number/10)%10)*10;
    reversedNumber += number/100;
    System.out.println(reversedNumber);
  }
}