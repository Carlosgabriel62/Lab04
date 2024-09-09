//Iago Leite 10418120, Carlos Gabriel 10410489

public class Main {
  public static void main(String[] args) {
    GerenciadorNomes gNomes = new GerenciadorNomesMem();
    Ihm ihm = new Ihm(gNomes);
    ihm.dialogar();
  }
}
