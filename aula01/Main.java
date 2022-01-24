public class Main {
  public static void main(String[] agrs) {
    Carro c1 = new Carro();
    Carro c2 = new Carro();
    c1.ano = 1999;
    c1.ar = true;
    c1.cor = "vermelho";
    c1.direcao = false;
    c1.ligado = false;
    c1.marca = "Volkswagen";
    c1.modelo = "Fusca";
    c1.parado = true;
    c1.roda = 5;
    c1.velocidade = 0;

    System.out.println(".........." + c1.hashCode());
    System.out.println("Ano do carro: " + c1.ano);
    System.out.println("Marca do carro: " + c1.marca);
    System.out.println("Modelo do carro: " + c1.modelo);
    System.out.println("Possui dieção: " + c1.direcao);
    System.out.println("Possui ar: " + c1.ar);

    c2.ano = 2000;
    c2.ar = false;
    c2.cor = "prata";
    c2.direcao = true;
    c2.ligado = false;
    c2.marca = "Volkswagen";
    c2.modelo = "Fusca";
    c2.parado = true;
    c2.roda = 4;
    c2.velocidade = 0;

    System.out.print("\n");
    System.out.println(".........." + c2.hashCode());
    System.out.println("Ano do carro: " + c2.ano);
    System.out.println("Marca do carro: " + c2.marca);
    System.out.println("Modelo do carro: " + c2.modelo);
    System.out.println("Possui dieção: " + c2.direcao);
    System.out.println("Possui ar: " + c2.ar);

  }
}