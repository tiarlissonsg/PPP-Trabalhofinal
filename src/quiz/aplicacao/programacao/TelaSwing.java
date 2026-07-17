package quiz.aplicacao.programacao;

import quiz.framework.exibicao.IExibicaoQuiz;
import quiz.framework.modelo.Pergunta;
import javax.swing.JOptionPane;
import java.util.List;

public class TelaSwing implements IExibicaoQuiz {
    private int ultimaResposta;

    @Override
    public void exibirPergunta(Pergunta pergunta) {
        List<String> alternativas = pergunta.getAlternativas();

        String[] opcoes = new String[alternativas.size()];

        for (int i = 0; i < alternativas.size(); i++) {
            opcoes[i] = String.valueOf(alternativas.get(i));
        }

        ultimaResposta = JOptionPane.showOptionDialog(
                null,
                pergunta.getEnunciado(),
                "Quiz de Programação",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
        );
    }

    @Override
    public int capturarResposta() {
        return ultimaResposta;
    }

    @Override
    public void exibirResultadoFinal(int acertos, int erros, int pontuacaoFinal) {
        String mensagem = "Fim de Jogo!\n\nAcertos: " + acertos + "\nErros: " + erros + "\nPontuação Final: " + pontuacaoFinal;

        JOptionPane.showMessageDialog(null, mensagem, "Resultado Final", JOptionPane.INFORMATION_MESSAGE);
    }
}