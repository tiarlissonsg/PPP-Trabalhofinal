package quiz.aplicacao.console;

import quiz.framework.fabrica.FabricaDeQuiz;
import quiz.framework.fluxo.JogoQuizTemplate;

public class MainConsole {

    static class FabricaConsole extends FabricaDeQuiz {
        @Override
        public JogoQuizTemplate criarQuiz() {
            return new QuizDeBits(new TelaConsole(), new PontuacaoSimples());
        }
    }

    public static void main(String[] args) {
        FabricaConsole fabrica = new FabricaConsole();
        fabrica.iniciarJogo();
    }
}