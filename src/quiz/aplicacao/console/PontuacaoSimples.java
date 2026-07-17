package quiz.aplicacao.console;

import quiz.framework.pontuacao.IEstrategiaPontuacao;

public class PontuacaoSimples implements IEstrategiaPontuacao {
    @Override
    public int calcularPontos(boolean acertou) {
        return acertou ? 10 : 0;
    }
}