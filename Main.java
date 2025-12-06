import java.util.Random; // pesquise no gogle(gemini) para sortear
import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner imput = new Scanner (System.in);
        Random Random = new Random(); // peguei do google (gemini) tambem, gerador de números aleatórios

        String[] animais ={
            "cachorro", "gato", "foca", "baleia", "arara", "golfinho", "zebra"
        };

        String[] dicas ={
            "Eu faço auau!", 
            "Eu gosto de arranhar as coisas", 
            "Eu sou comparado com o Lucas Netto", 
            "Minha espécie possui um sonar", 
            "Sou conhecido por um filme e passaros que se passa no Rio de janeiro", 
            "Sou comparado com um dos contos do folclore brasileiro que é namoradeiro", 
            "Eu sou o melhor amigo do Allex o Leão"
        };

        System.out.println("JOGO DO BICHO - DIGITE 'sair' PARA ENCERRAR");

        while (true) { // coloquei esse laço para repetir o jogo infinitamente até digitar 'sair'

            int sorteado = Random.nextInt(animais.length); 
            // peguei no google (gemini), combina funcionalidades do Java para garantir que o número gerado seja válido para acessar um elemento do array

            System.out.println("\nDica: " + dicas[sorteado]);

            System.out.println("Qual animal eu sou? ");
            String resposta = imput.nextLine().toLowerCase(); 
            // peguei do google(gemini) Converte o texto digitado para minúsculas antes de comparar

            if(resposta.equals("sair")) {  
                // condição que eu adicionei: se digitar sair o jogo acaba (essa parte do codigo)
                System.out.println("Fechando jogo... Até mais carrinhaaaaa");
                break; // encerra o laço
            }

            if(resposta.equals(animais[sorteado])) // peguei no google(gemini)
            {
                System.out.println("UhUUuuuuuuuUuUuuU Você acertou, carrinhaaaaa");
            } else {
                System.out.println("UUUUUUUU Burrão, não sabe adivinhar um animal! o animal era: " + animais[sorteado]);
            }
        }
    }
}
