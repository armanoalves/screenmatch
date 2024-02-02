package desafios.aula02;

public class Livro {
    private String titulo;
    private String autor;

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {
        System.out.println("O título do livro é: " + this.titulo);
        System.out.println("O nome do autor é: " + this.autor);
    }

    public static void main(String[] args) {
        Livro livro1 = new Livro();

        livro1.setTitulo("Pachinko");
        livro1.setAutor("Min Jin Lee");

        livro1.exibirDetalhes();
    }
}
