public class Jogador extends Jogo {
    public int tentativas;
    private String nome;

    /*construtor*/
    public Jogador(String nome) {
        super();
        this.nome = nome;
        this.tentativas = 5;
    }

    //get e set de nome
    public String getNome() {
        return this.nome;
    }
    public int getTentativas() {
        return tentativas;
    }

    //reduzir o numero de tentativas quando tiver erro
    public void tentativaErrada() {
        tentativas--;
    }

    //checar se ainda existem tentativas
    public boolean existeTentativa() {
        return tentativas > 0;
    }

 }
