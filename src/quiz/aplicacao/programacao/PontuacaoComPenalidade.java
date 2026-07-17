package quiz.aplicacao.programacao;

import quiz.framework.pontuacao.IEstrategiaPontuacao;

public class PontuacaoComPenalidade implements IEstrategiaPontuacao {
    @Override
    public int calcularPontos(boolean acertou) {
        if (acertou) {
            return 10;
        } else {
            return -5;
        }
    }
}