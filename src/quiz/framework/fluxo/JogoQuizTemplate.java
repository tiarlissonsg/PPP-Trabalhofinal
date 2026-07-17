package quiz.framework.fluxo;

import quiz.framework.exibicao.IExibicaoQuiz;
import quiz.framework.pontuacao.IEstrategiaPontuacao;
import quiz.framework.modelo.Pergunta;
import java.util.List;

public abstract class JogoQuizTemplate {

    private IExibicaoQuiz exibicao;
    private IEstrategiaPontuacao estrategiaPontuacao;

    public JogoQuizTemplate(IExibicaoQuiz exibicao, IEstrategiaPontuacao estrategia) {
        this.exibicao = exibicao;
        this.estrategiaPontuacao = estrategia;
    }

    public final void executarJogo() {
        int acertos = 0;
        int erros = 0;
        int pontuacaoFinal = 0;

        List<Pergunta> perguntas = carregarPerguntas();

        for (Pergunta p : perguntas) {
            exibicao.exibirPergunta(p);
            int respostaUsuario = exibicao.capturarResposta();

            boolean acertou = p.verificarResposta(respostaUsuario);
            if (acertou) {
                acertos++;
            } else {
                erros++;
            }

            pontuacaoFinal += estrategiaPontuacao.calcularPontos(acertou);
        }

        exibicao.exibirResultadoFinal(acertos, erros, pontuacaoFinal);
    }

    protected abstract List<Pergunta> carregarPerguntas();
}