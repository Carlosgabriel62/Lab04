//Iago Leite 10418120, Carlos Gabriel 10410489

import java.util.*;

public class GerenciadorNomesMem implements GerenciadorNomes {
  private List<String> nomes = new ArrayList<String>();

  @Override
  public List<String> obterNomes() {
    return nomes;
  }

  @Override
  public void adicionarNome(String nome) {
    nomes.add(nome);
  }
}
