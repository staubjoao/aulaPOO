public class Carro {
  // Atibutos
  private String cor;
  private String modelo;
  private String marca;
  private int roda;
  private int ano;
  private boolean ar;
  private boolean direcao;
  private boolean ligado;
  private float velocidade;
  private boolean parado;

  public String getCor() {
    return cor;
  }

  void setCor(String cor) {
    this.cor = cor;
  }

  public String getModelo() {
    return modelo;
  }

  void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public String getMarca() {
    return marca;
  }

  void setMarca(String marca) {
    this.marca = marca;
  }

  public int getRoda() {
    return roda;
  }

  void setRoda(int roda) {
    this.roda = roda;
  }

  public int getAno() {
    return ano;
  }

  void setAno(int ano) {
    this.ano = ano;
  }

  public boolean getAr() {
    return ar;
  }

  void setAr(boolean ar) {
    this.ar = ar;
  }

  public boolean getDirecao() {
    return direcao;
  }

  void setDirecao(boolean direcao) {
    this.direcao = direcao;
  }

  public boolean getLigado() {
    return ligado;
  }

  private void setLigado(boolean ligado) {
    this.ligado = ligado;
  }

  public float getVelocidade() {
    return velocidade;
  }

  private void setVelocidade(float velocidade) {
    this.velocidade = velocidade;
  }

  boolean getParado() {
    return parado;
  }

  void setParado(boolean parado) {
    this.parado = parado;
  }

  public void aumentarVelocidade() {
    this.setVelocidade(this.velocidade + 10);
  }

  public void diminuirVelocidade() {
    this.setVelocidade(this.velocidade - 10);
  }

  void andar() {

  }

  void parar() {

  }

  void colocarAr() {

  }

  public void ligar() {
    if (!getLigado())
      this.setLigado(true);
  }

  public void desliga() {
    if (getLigado())
      this.setLigado(false);
  }

  void idade() {

  }

}