public class NotacaoPonto {
  public static void main(String[] args) {
    
    // Variáveis
    // tipo chave = valor;
    String nome = "Leonardo";
    /*
    nome = nome.toUpperCase();
    nome = nome.replace("LEON", "Edu");
    nome = nome.concat("!!!");
    */
    nome = nome
              .replace("Leon", "Edu")
              .toUpperCase()
              .concat("!!!");
    
    System.out.println(nome);

    // int idade = 39;
    // idade.
    // Atenção: não existe notação de ponto para tipos primitivos!!!

  }
}
