import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      Scanner input = new Scanner(System.in);
      String name = input.nextLine();
      System.out.println("Hi, "+ name);
      input.close();
    }
}
