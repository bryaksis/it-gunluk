import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int H = scanner.nextInt();
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int totalFeet = 0;

    for (int day = 1; day <100 ; day++) {
      totalFeet += A;
      if(totalFeet>=H){
        System.out.println(day);
        break;
      }
      totalFeet -= B;
    }
  }
}