package quiz.framework.modelo;

import java.util.List;

public class Pergunta {
    private String enunciado;
    private List alternativas;
    private int indiceAlternativaCorreta;

    public Pergunta(String enunciado, List alternativas, int indiceAlternativaCorreta) {
        this.enunciado = enunciado;
        this.alternativas = alternativas;
        this.indiceAlternativaCorreta = indiceAlternativaCorreta;
    }

    public String getEnunciado() { return enunciado; }
    public List getAlternativas() { return alternativas; }
    public boolean verificarResposta(int respostaUsuario) {
        return this.indiceAlternativaCorreta == respostaUsuario;
    }
}