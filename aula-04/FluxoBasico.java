import java.util.Date;

public class FluxoBasico {
  public static void main(String[] args) {
    
    // Entrada de Dados
    System.out.print("Digite seu nome: ");
    String nome = System.console().readLine();

    System.out.print("Digite sua idade: ");
    int idade = Integer.parseInt( System.console().readLine() );

    // Processamento
    Date data = new Date();
    int ano = data.getYear();
    int anoNascimento = ano - idade;

    // Saída
    System.out.println("\n==============================");
    System.out.printf("Seu nome é %s", nome);
    System.out.printf("\nSua idade é %d", idade);
    System.out.printf("\nVocê nasceu no ano %d", anoNascimento);
    System.out.println("\n==============================");
  }
}
