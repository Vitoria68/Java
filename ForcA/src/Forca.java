
import java.util.Scanner;

public class Forca extends Jogo {

    
    
        public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) { //pedido pelo vscode pq estava dando erro
            String nome;

            //pedir o nome e inicializar jogador
            System.out.println("Qual o seu nome?");
            nome = sc.nextLine();
            Forca jogo = new Forca();
            Jogador j1 = new Jogador(nome);
            //setando o jogador dps de construir o jogo
            jogo.setJogador(j1);


            /*instrucoes*/
            jogo.instrucao();
            
            //iniciar o jogo
            jogo.iniciar();
        }
    }
}
