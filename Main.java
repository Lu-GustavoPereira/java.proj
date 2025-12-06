import java.util.Random; // pesquise no gogle(gemini) para sortear
import java.io.IOException;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner imput = new Scanner (System.in);
        Random Random = new Random();//peguei do google (gemini) tambem, gerador de números aleatórios
        String[] animais ={
            "cachorro", "gato", "foca", "baleia", "arara", "golfinho", "zebra"
        };
        String[] dicas ={
            "Eu faço auau!", "Eu gosto de arranhar as coisas", "Eu sou comparado com o Lucas Netto", "Minha espécie possui um sonar", "Sou conhecido por um filme e passaros que se passa no Rio de janeiro", "Sou comparado com um dos contos do folclore brasileiro que é namoradeiro", "Eu sou o melhor amigo do Allex o Leão"
        };
        int sorteado = Random.nextInt(animais.length); //peguei no google (gemini), Ela combina duas funcionalidades principais do Java para garantir que o número gerado seja válido para acessar um elemento específico do seu array:
        System.out.println("JOGO DO BICHO");
        System.out.println("Dica: " +dicas[sorteado]);
        System.out.println("Qual animal eu sou? ");
        String resposta = imput.nextLine().toLowerCase();// peguei do google(gemini) Converte todo o texto lido para letras minúsculas. String resposta = ...: Armazena o resultado final (a string em minúsculas) na variável chamada resposta.
        if(resposta.equals(animais[sorteado]))// peguei no google(gemini)
        {
            System.out.println("UhUUuuuuuuuUuUuuU Você acertou, carrinhaaaaa");
        }else{
            System.out.println("UUUUUUUU Burrão, não sabe adivinhar um animal! o animal era:" + animais[sorteado]);
        }
    }
}