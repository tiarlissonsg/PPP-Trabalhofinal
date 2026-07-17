package quiz.framework.exibicao;
import quiz.framework.modelo.Pergunta;

public interface IExibicaoQuiz {
    void exibirPergunta(Pergunta pergunta);
    int capturarResposta();
    void exibirResultadoFinal(int acertos, int erros, int pontuacaoFinal);
}