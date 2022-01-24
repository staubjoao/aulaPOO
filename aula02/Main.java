public class Main {
  public static void main(String[] agrs) {
    Carro c1 = new Carro();
    c1.setCor("vermelho");
    c1.setModelo("Fusca");
    c1.setMarca("Volkswagen");
    c1.setRoda(4);
    c1.setAno(1999);
    c1.setAr(true);
    c1.setDirecao(false);
    c1.ligar();
    c1.setParado(true);
    c1.aumentarVelocidade();
    c1.aumentarVelocidade();
    c1.aumentarVelocidade();

    System.out.println(".........." + c1.hashCode());
    System.out.println("Ano do carro: " + c1.getAno());
    System.out.println("A cor do carro: " + c1.getCor());
    System.out.println("Marca do carro: " + c1.getMarca());
    System.out.println("Modelo do carro: " + c1.getModelo());
    System.out.println("Possui dieção: " + c1.getDirecao());
    System.out.println("Possui ar: " + c1.getAr());
    System.out.println("Velocidade: " + c1.getVelocidade());

    c1.diminuirVelocidade();

    System.out.println("Nova velocidade: " + c1.getVelocidade());
  }
}