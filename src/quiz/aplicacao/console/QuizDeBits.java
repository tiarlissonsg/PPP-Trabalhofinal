package quiz.aplicacao.console;

import quiz.framework.fluxo.JogoQuizTemplate;
import quiz.framework.modelo.Pergunta;
import quiz.framework.exibicao.IExibicaoQuiz;
import quiz.framework.pontuacao.IEstrategiaPontuacao;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuizDeBits extends JogoQuizTemplate {

    public QuizDeBits(IExibicaoQuiz exibicao, IEstrategiaPontuacao estrategia) {
        super(exibicao, estrategia);
    }

    @Override
    protected List<Pergunta> carregarPerguntas() {
        List<Pergunta> perguntas = new ArrayList<>();

        perguntas.add(new Pergunta(
                "Qual é a representação em binário do número decimal 10?",
                Arrays.asList("1010", "1001", "1100", "1111"),
                0
        ));

        perguntas.add(new Pergunta(
                "Na representação de complemento de dois, o bit mais significativo indica o quê?",
                Arrays.asList("O valor máximo", "O sinal (0 para positivo, 1 para negativo)", "O byte de paridade", "O bit de overflow"),
                1
        ));

        return perguntas;
    }
}