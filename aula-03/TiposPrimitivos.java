public class TiposPrimitivos {
  public static void main(String[] args) {
    
    // Armazenamento de Dados (Variáveis)
    // tipo chave = valor;

    // São 6 tipos numericos:
    
    // numericos inteiros
    byte numByte = 127; // -128 ate 127
    short numShort = 32767; // -32.768 ate 32.767
    int numInt = 2147483647; // -2.147.483.648 a 2.147.483.647
    long numLong = 2_147_483_648L; // -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807
  
    // numericos ponto fluante
    float numFloat = 10.5F; // -3.40292347E+38 a +3.40292347E+38
    double numDouble = 1000.38282; // -1.79769313486231570E+308 a +1.79769313486231570E+308

    long valor = 274;
    int outroValor = (int) valor; // coersao (casting)
    
    // Os outros 2 tipos:
    boolean magro = false;
    char letra = 'X';

    // Saída
    System.out.println(valor + outroValor);
    System.out.println("byte: " + numByte);
    System.out.println("short: " + numShort);
    System.out.println("int: " + numInt);
    System.out.println("long: " + numLong);
    System.out.println("float: " + numFloat);
    System.out.println("double: " + numDouble);
    System.out.println("magro: " + magro);
    System.out.println("letra: " + letra);


  }
}
