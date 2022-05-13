public class Programa {
  public static void main(String[] args) {
    boolean exec = true;

    while (exec) {
      System.out.println("BEM VINDO AO MEU PROGRAMA JAVA!");
      System.out.println("1 - JOGO");
      System.out.println("2 - SAIR");
      System.out.print("Escolha sua Opcao: ");
      int opcao = Integer.parseInt(System.console().readLine());

      switch (opcao) {
        case 1:
          System.out.println("Rodando o jogo...");
          break;

        case 2:
          System.out.println("Bye bye!");
          exec = false;
          break;
      
        default:
          System.out.println("Ops! Sua opcao é invalida!");
          break;
      }
    }
  }
}
