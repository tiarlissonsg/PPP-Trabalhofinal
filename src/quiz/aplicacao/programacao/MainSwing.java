package quiz.aplicacao.programacao;
import quiz.framework.fabrica.FabricaDeQuiz;
import quiz.framework.fluxo.JogoQuizTemplate;

public class MainSwing {
    static class FabricaSwing extends FabricaDeQuiz {
        @Override
        public JogoQuizTemplate criarQuiz() {
            return new QuizProgramacao(new TelaSwing(), new PontuacaoComPenalidade());
        }
    }

    public static void main(String[] args) {
        FabricaSwing fabrica = new FabricaSwing();
        fabrica.iniciarJogo();
    }
}