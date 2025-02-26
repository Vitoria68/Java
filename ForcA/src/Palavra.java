import java.util.Random;
import java.util.ArrayList;

public class Palavra {

  private String palavraSecreta; // armazena qual palavra foi sorteada
  private StringBuilder tracinho; // faz o nome em forma de "-"
  ArrayList<String> palavras;

  // Construtor para inicializar a lista
  /* não se pode adicionar elementos ao ArrayList diretamente dentro da classe, só
   * dentro de um método ou de um bloco de inicialização.*/
  public Palavra() {
    palavras = new ArrayList<>();
    palavras.add("amarelo");
    palavras.add("vermelho");
    palavras.add("verde");
    palavras.add("roxo");
    palavras.add("preto");
    palavras.add("branco");
    palavras.add("laranja");

    iniciaPalavra();
  }

  /* sortear uma palavra */
  private void iniciaPalavra() {
    Random random = new Random();
    palavraSecreta = palavras.get(random.nextInt(palavras.size()));
    tracinho = new StringBuilder("_".repeat(palavraSecreta.length()));
  }

  /* verificar se o usuario acertou a letra */
  public boolean verificarLetra(char letra) {
    boolean acertou = false;
    for (int i = 0; i < palavraSecreta.length(); i++) {
      if (palavraSecreta.charAt(i) == letra) { // caso acerte a letra
        tracinho.setCharAt(i, letra); // o tracinho se transforma nela
        acertou = true;
      }
    }
    return acertou;
  }

  // se o jogador adivinhou todas as letras:
  public boolean palavraDescoberta() {
    return tracinho.toString().equals(palavraSecreta);
  }
  

  // permite acesso à variavel tracinho e retorna a palavra com ----
  public String getTracinho() {
    return tracinho.toString(); // usa-se o toString para converter o StringBuilder em string
  }

  // permite acesso à variavel palavraSecreta e retorna a palavra completa, sem
  // esconder letras
  // usada para quando o usuario acertar a palavra
  public String getPalavraSecreta() {
    return palavraSecreta;
  }
}
