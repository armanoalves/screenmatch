package desafios.aula01;

public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double avaliacao;
    int numAvaliacoes;

    void exibeFicha() {
        System.out.println("Título da musica: " + titulo);
        System.out.println("Nome do artista: " + artista);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        System.out.println("Número de avaliações: " + numAvaliacoes);
    }

    void avaliarMusica(double nota) {
        avaliacao += nota;
        numAvaliacoes++;
    }


}
