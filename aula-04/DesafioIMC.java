public class DesafioIMC {
  public static void main(String[] args) {
    // Entrada
    System.out.print("Digite seu nome: ");
    String paciente = System.console().readLine();

    System.out.print("Digite sua altura: ");
    double altura = Double.parseDouble( System.console().readLine() );

    System.out.print("Digite sua peso: ");
    double peso = Double.parseDouble( System.console().readLine() );

    // Processamento
    double imc = peso / (altura * altura);
    
    // Saída
    System.out.printf("\nPaciente: %s", paciente);
    System.out.printf("\nAltura: %f", altura);
    System.out.printf("\nPeso: %f", peso);
    System.out.printf("\n%s seu IMC é de %.2f", paciente, imc);
  }
}
