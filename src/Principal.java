import br.com.alura.screenmatch.calculos.CaculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinuntos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinuntos());

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média das avaliações: " + meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setMinuntosPorEpisodio(50);
        lost.setEpisodiosPorTemporada(10);
        System.out.println("Duração da série: " + lost.getDuracaoEmMinuntos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("O Poderoso Chefão");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinuntos(200);

        CaculadoraDeTempo calculadora = new CaculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());
    }
}
