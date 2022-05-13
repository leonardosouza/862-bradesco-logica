public class Repeticao {
  public static void main(String[] args) {

    // Imprimir número de 1 à 5

    // WHILE
    int i = 1; // valor_inicial
    while (i <= 5) { // condicao_logica
      System.out.print(i);
      i++; // incremento_decremento
    }

    System.out.print("\n\n\n");

    // FOR
    /*
    for(valor_inicial; condicao_logica; incremento_decremento) { ... }
    */
    for (i = 1; i <= 5; i++) {
      System.out.print(i);
    }

  }
}
