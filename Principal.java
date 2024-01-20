import br.com.alura.igorflix.modelos.Filme;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme();
        meuFilme.setNome("Top Gun");
        meuFilme.setAnoDeLancamento(2022);
        meuFilme.setDurancacaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(7);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacao());
        System.out.println(meuFilme.pegaMedia());

        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacao = 1;
        //System.out.println(meuFilme.pegaMedia());


    }
}


