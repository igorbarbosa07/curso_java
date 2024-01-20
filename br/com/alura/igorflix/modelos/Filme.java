package br.com.alura.igorflix.modelos;

public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    int durancacaoEmMinutos;

    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

    public void exibeFichaTecnica () {

        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    public double pegaMedia () {
        return somaDasAvaliacoes / totalDeAvaliacao;
    }

}

