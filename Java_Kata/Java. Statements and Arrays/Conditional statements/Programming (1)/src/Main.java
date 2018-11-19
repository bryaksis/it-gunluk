import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int edge1 = scanner.nextInt();
    int edge2 = scanner.nextInt();
    int edge3 = scanner.nextInt();

    boolean isTriangle;

    isTriangle = Math.abs(edge2 + edge3) > edge1;
    isTriangle &= edge1 >= Math.abs(edge2 - edge3);
    isTriangle &= Math.abs(edge1 + edge3) > edge2;
    isTriangle &= edge2 >= Math.abs(edge1 - edge3);
    isTriangle &= Math.abs(edge2 + edge1) > edge3;
    isTriangle &= edge3 >= Math.abs(edge2 - edge1);

    if (isTriangle) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }

  }
}