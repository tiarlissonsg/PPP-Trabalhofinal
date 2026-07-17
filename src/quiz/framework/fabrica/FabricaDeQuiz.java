package quiz.framework.fabrica;

import quiz.framework.fluxo.JogoQuizTemplate;

public abstract class FabricaDeQuiz {

    public abstract JogoQuizTemplate criarQuiz();
    public void iniciarJogo() {
        JogoQuizTemplate jogo = criarQuiz();
        jogo.executarJogo();
    }
}