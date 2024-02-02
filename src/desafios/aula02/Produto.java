package desafios.aula02;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto(double porcentagem) {
        this.preco = this.preco - (this.preco * (porcentagem / 100));
        System.out.println("O preco do produto " + this.nome + " foi alterado para: " + this.preco);
    }

    public static void main(String[] args) {
        Produto primeiraCompra = new Produto();
        primeiraCompra.setNome("Arroz");
        primeiraCompra.setPreco(100);

        primeiraCompra.aplicarDesconto(40);
    }
}
