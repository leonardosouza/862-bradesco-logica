import java.util.Scanner;

public class Tabuada {
  public static void main(String[] args) {
    // Montar um programa que receba um numero (base)
    // E gere a tabuada do mesmo (do 1 até o 10)

    // Digite um numero: 5
    // 5 x 1 = 5
    // 5 x 2 = 10
    // ...
    // 5 x 10 = 50

    // IMPORTANTE: USAR O FOR!!!
    // System.out.print("Digite um número: ");
    // int base = Integer.parseInt(System.console().readLine());

    // Alternativa (Captura)
    Scanner teclado = new Scanner(System.in);
    System.out.print("Digite um número: ");
    int base = teclado.nextInt(); // .nextDouble() | .nextLine()
    teclado.close();

    // Tabuada
    /*
    for(valor_inicial; condicao_logica; incremento_decremento) { ... }
    */
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d x %d = %d\n", base, i, base * i);
    }

  }
}
