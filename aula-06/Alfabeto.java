public class Alfabeto {
  public static void main(String[] args) {
    
    // Desafio: Imprimir as letras do alfabeto (a - z)
    // Saída: a b c d ... z

    // char character = 76;
    // System.out.println(character);
    System.out.println("Letras do Alfabeto: ");

    int ini = 65;
    int fim = 90;

    while (ini <= fim) {
      System.out.printf(" %c ", (char) ini);
      ini = ini + 1; 
    }

  }
}
