public class FaixaEtaria {
  public static void main(String[] args) {
    
    // Entrada
    System.out.print("Digite seu nome: ");
    String nome = System.console().readLine();

    System.out.print("Digite sua idade: ");
    int idade = Integer.parseInt(System.console().readLine());

    String faixa;

    // Processamento
    /*
    if (idade <= 12) {
      faixa = "criança";
    } else if(idade < 18) {
      faixa = "adolescente";
    } else {
      faixa = "adulto";
    }
    */

    if (idade >= 0 && idade <= 12) {
      faixa = "criança";
    } else if(idade > 12 && idade < 18) {
      faixa = "adolescente";
    } else if(idade < 60) {
      faixa = "adulto";
    } else {
      faixa = "idoso";
    }

    // Saída
    System.out.printf("\nNome: %s", nome);
    System.out.printf("\nIdade: %d", idade);
    System.out.printf("\nFaixa Etária: %s", faixa);

  }
}
