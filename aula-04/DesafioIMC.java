public class DesafioIMC {
  public static void main(String[] args) {
    // Entrada
    System.out.print("Digite seu nome: ");
    String paciente = System.console().readLine();

    System.out.print("Digite sua altura: ");
    double altura = Double.parseDouble( System.console().readLine() );

    System.out.print("Digite sua peso: ");
    double peso = Double.parseDouble( System.console().readLine() );

    String grauImc;

    // Processamento
    double imc = peso / (altura * altura);

    if (imc <= 16.9) {
      grauImc = "muito abaixo do peso";
    } else if(imc <= 18.4) {
      grauImc = "abaixo do peso";
    } else if(imc <= 24.9) {
      grauImc = "peso normal";
    } else if(imc <= 29.9) {
      grauImc = "acima do peso";
    } else if(imc <= 34.9) {
      grauImc = "obesidade grau I";
    } else if(imc <= 40) {
      grauImc = "obesidade grau II";
    } else {
      grauImc = "obesidade grau III";
    }
    
    // Saída
    System.out.printf("\nPaciente: %s", paciente);
    System.out.printf("\nAltura: %.2f", altura);
    System.out.printf("\nPeso: %.2f", peso);
    System.out.printf("\n%s seu IMC é de %.2f", paciente, imc);
    System.out.printf("\nA classificação do IMC é %s", grauImc);
  }
}
