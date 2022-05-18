public class DesafioProgressao {
  public static void main(String[] args) {
    System.out.println("\n");
    
    for (int lin = 0; lin <= 10; lin++) {
      for (int col = 0; col < lin; col++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }

    System.out.println("\n");
  }
}
