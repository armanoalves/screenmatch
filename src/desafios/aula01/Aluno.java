package desafios.aula01;

public class Aluno {
    String nome;
    int idade;

    void exibeInformacoes() {
        System.out.println("O nome do aluno é: " + nome);
        System.out.println("A idade do aluno é: " + idade);
    }

    static class Main {
        public static void main(String[] args) {
            Aluno aluno01 = new Aluno();
            aluno01.nome = "Armano";
            aluno01.idade = 21;

            aluno01.exibeInformacoes();
        }
    }

}
