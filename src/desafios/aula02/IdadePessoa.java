package desafios.aula02;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if (this.idade >= 18) {
            System.out.println("Você é maior de idade!");
        } else {
            System.out.println("Você não é maior de idade.");
        }
    }

    public static void main(String[] args) {
        IdadePessoa pessoa = new IdadePessoa();

        pessoa.setIdade(21);
        pessoa.setNome("Armano");

        pessoa.verificarIdade();
    }
}
