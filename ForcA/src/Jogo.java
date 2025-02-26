
import java.util.Scanner;
import java.util.InputMismatchException;


public abstract class Jogo implements Instrucao {
    @SuppressWarnings("FieldMayBeFinal")/*Para sumir ocom o erro em jogador, palavra e scanner*/
    private Jogador jogador;
    @SuppressWarnings("FieldMayBeFinal")
    private Palavra palavra;
    @SuppressWarnings("FieldMayBeFinal")
    private Scanner scanner; //unico jeito que consegui fazer o scnner funcionar

    //construtor
    public Jogo() {
        this.palavra = new Palavra();
        this.scanner = new Scanner(System.in);//unico jeito que consegui fazer o scnner funcionar pt.2
    }

    //get pro jogador
    public Jogador getJogador() {
        return jogador;
    }


    //set pro jogador
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }


    //Sobrescrita de Métodos, para preencher as instrucoes que estão na interface
    @Override
    public void instrucao() {
        System.out.println("Bem vindo ao Jogo da Forca!");
        System.out.println("A cada rodada voce receberá uma palavra sorteada aleatoriamente, dentro da temática de cores!");
        System.out.println("Voce terá 5 chances para adivinhar a palavra. Boa sorte e boa diversão <3");
    }

    //fazer a forca rodar
    public void iniciar() {
        while (jogador.existeTentativa() && !palavra.palavraDescoberta()) { //enquanto ainda ha tentativas e a palavra n foi descoberta
            System.out.println("\n Palavra: " + palavra.getTracinho());
            System.out.println("Tentativas restantes: " + jogador.getTentativas());
            System.out.println("Digite uma letra: ");
            char tentar = '-';
            
            
            try {
                String input = scanner.next().toLowerCase(); // Captura a entrada como string
                
                // vê se a tentativa tem exatamente uma letra e se é uma letra
                if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                    throw new InputMismatchException("Tentativa inválida! Por favor, digite apenas uma letra.");
                }
                
                // Captura o primeiro caractere válido
                tentar = input.charAt(0);
                
            } catch (InputMismatchException e) {
                System.out.println(e.getMessage()); // Exibe a mensagem de erro personalizada
            }


            //verificar se o jogador acertou a letra 
            if (!palavra.verificarLetra(tentar)) {
                jogador.tentativaErrada();
                System.out.println("Você errou a letra! Se você tiver mais tentativas, use-as.");
            } else {
                System.out.println("Ihuu! Parabéns, "+ jogador.getNome() +" você acertou uma letra!");
            }

            //verificar se o jogador acertou a palavra ou se as tentativas acabaram
            //verificar se ainda há tentativas
            
                if (palavra.palavraDescoberta()) {
                    System.out.println("Ihuu! Parabéns, "+ jogador.getNome() +" você certou a palavra " + palavra.getPalavraSecreta() + "!");
                } else {
                    if (jogador.existeTentativa() == false) {
                        System.out.println("Poxa... acabaram as tentativas e você não acertou a palavra... :(");
                        System.out.println("A palavra era: " + palavra.getPalavraSecreta());
                    }
                }
            }
        }
    }


