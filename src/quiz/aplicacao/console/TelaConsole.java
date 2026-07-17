package quiz.aplicacao.console;

import quiz.framework.exibicao.IExibicaoQuiz;
import quiz.framework.modelo.Pergunta;
import java.util.List;
import java.util.Scanner;

public class TelaConsole implements IExibicaoQuiz {
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void exibirPergunta(Pergunta pergunta) {
        System.out.println("\nNOVA PERGUNTA ");
        System.out.println(pergunta.getEnunciado());

        List alternativas = pergunta.getAlternativas();
        for (int i = 0; i < alternativas.size(); i++) {
            System.out.println(i + ") " + alternativas.get(i));
        }
    }
    @Override
    public int capturarResposta() {
        System.out.print("Digite a sua resposta: ");
        return scanner.nextInt();
    }
    @Override
    public void exibirResultadoFinal(int acertos, int erros, int pontuacaoFinal) {
        System.out.println("\n FIM DE JOGO ");
        System.out.println("Acertos: " + acertos);
        System.out.println("Erros: " + erros);
        System.out.println("Pontuação Total: " + pontuacaoFinal + " pontos");
    }
}