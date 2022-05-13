public class Numeros {
  public static void main(String[] args) {
    
    // Desafio: Imprimir os números de 1 à 10 (um por linha)
    /*
    * ANTIPADRAO: EVITAR!!!
    System.out.println(1);
    System.out.println(2);
    System.out.println(3);
    System.out.println(4);
    System.out.println(5);
    System.out.println(6);
    System.out.println(7);
    System.out.println(8);
    System.out.println(9);
    System.out.println(10);
    */

    // Desafio: Imprimir os números de 1 à 10 (um por linha)
    System.out.println("Números de 1 à 10: ");
    
    int inicio = 1; // valor_inicial
    int fim = 10; // valor_final

    while (inicio <= fim) { // condicao_logica
      System.out.println(inicio); // 1234...
      // inicio = inicio + 1;
      // inicio += 1;
      inicio++; // incremento
    }

    // Desafio: Imprimir os números de 0 à 50
    // Saida: 0 1 2 3 4 5...50
    System.out.println("\nNúmeros de 0 à 50: ");

    inicio = 0;
    fim = 50;

    while (inicio <= fim) {
      System.out.print(inicio + " ");
      inicio += 1;
    }

    // Desafio: Imprimir os números de 100 à 25
    // Saída: 100 99 98 97...25
    System.out.println("\n\nNúmeros de 100 à 25: ");

    inicio = 100;
    fim = 25;

    while (inicio >= fim) {
      System.out.print(inicio + " ");
      inicio--;
    }

    // Desafio: Imprimir os números pares de 0 à 100
    // Saída: 0 - 2 - 4 - 6 - 8 ... 100
    System.out.println("\n\nNúmeros pares de 0 à 100: ");

    inicio = 0;
    fim = 100;

    while (inicio < fim) {
      System.out.print(inicio + " - ");
      inicio += 2;
      if(inicio == fim) {
        System.out.print(fim);
      }
    }

    // Desafio: Imprimir os números ímpares de 99 à 1
    // Saída: 99 - 97 - 95 ... 1
    System.out.println("\n\nNúmeros ímpares de 99 à 1: ");

    inicio = 99;
    fim = 1;

    while (inicio > fim) {
      System.out.print(inicio + " - ");
      inicio -= 2;
      if(inicio == fim) {
        System.out.print(fim);
      }
    }

  }
}
