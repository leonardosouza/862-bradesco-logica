public class DiaDaSemana {
  public static void main(String[] args) {
    
    // Entrada
    System.out.print("Digite o dia da semana: ");
    int diaDaSemana = Integer.parseInt(System.console().readLine());
    String diaPorExtenso;

    switch (diaDaSemana) {
      case 1:
        diaPorExtenso = "DOM";
        break;

      case 2:
        diaPorExtenso = "SEG";
        break;

      case 3:
        diaPorExtenso = "TER";
        break;

      case 4:
        diaPorExtenso = "QUA";
        break;

      case 5:
        diaPorExtenso = "QUI";
        break;

      case 6:
        diaPorExtenso = "SEX";
        break;

      case 7:
        diaPorExtenso = "SAB";
        break;
    
      default:
        diaPorExtenso = "NENHUM";
        break;
    }

    // Saída
    System.out.printf("O dia %d é %s!", diaDaSemana, diaPorExtenso); // O dia 1 é DOM!

  }
}
