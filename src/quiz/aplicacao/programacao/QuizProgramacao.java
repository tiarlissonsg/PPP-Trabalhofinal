package quiz.aplicacao.programacao;

import quiz.framework.fluxo.JogoQuizTemplate;
import quiz.framework.modelo.Pergunta;
import quiz.framework.exibicao.IExibicaoQuiz;
import quiz.framework.pontuacao.IEstrategiaPontuacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuizProgramacao extends JogoQuizTemplate {

    public QuizProgramacao(IExibicaoQuiz exibicao, IEstrategiaPontuacao estrategia) {
        super(exibicao, estrategia);
    }

    @Override
    protected List carregarPerguntas() {
        List perguntas = new ArrayList<>();

        perguntas.add(new Pergunta("Qual tipo primitivo em Java é usado para armazenar valores lógicos?", Arrays.asList("int", "boolean", "String", "double"), 1));
        perguntas.add(new Pergunta("Qual símbolo é utilizado para comparar se dois valores são iguais em Java?", Arrays.asList("=", "==", "!=", "=>"), 1));
        perguntas.add(new Pergunta("Como iniciamos um comentário de apenas uma linha no código Java?", Arrays.asList("/*", "<--", "//", "#"), 2));
        perguntas.add(new Pergunta("Qual estrutura de repetição é ideal quando sabemos quantas vezes o laço deve executar?", Arrays.asList("while", "do-while", "if", "for"), 3));
        perguntas.add(new Pergunta("Qual é a palavra-chave utilizada para aplicar Herança em Java?", Arrays.asList("implements", "extends", "inherits", "super"), 1));

        return perguntas;
    }
}