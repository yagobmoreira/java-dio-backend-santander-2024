public class MinhaClasse {

  public static void main(String[] args) {
    int mediaFinal = 5;
    if (mediaFinal<6) {
      System.out.println("REPROVADO");
    }
    else if(mediaFinal==6) {
      System.out.println("PROVA MINERVA");
    }
    else {
      System.out.println("APROVADO");
    }
    System.out.println("Hello World");
    System.out.println(nomeCompleto("Yago", "Moreira"));

  }

  public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return primeiroNome + " " + segundoNome;
  }
}
