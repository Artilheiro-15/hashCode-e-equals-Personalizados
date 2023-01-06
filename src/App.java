import entities.Client;

public class App {

  public static void main(String[] args) throws Exception {
    System.out.println("=================================");

    Client c1 = new Client("Maria", "maria@gmail.com");
    Client c2 = new Client("Maria", "maria@gmail.com");

    System.out.println(c1.hashCode());
    System.out.println(c2.hashCode());
    System.out.println(c1.equals(c2));

    //aki ele vai dar um resultado falso diferente do String poeque deu falso?
    //E porque o ""=="" com exçesao de tipo que tem o tratamento especial como o String
    //ele vai comparar nao o conteudo ele vai comparar as referencia de memoria como nois criou dois objetos diferentes
    //forao alocado la na memoria rip dois objetos diferentes eles tem posiçao de memoria diferente por isso que
    //esse "==" ele deu falso
    System.out.println(c1 == c2);

    System.out.println("=================================");
  }
}
