package desafios.aula02;

import java.util.List;

public class Aluno {
    private String nome;
    private List<Double> notas;

    public String getNome() {
        return nome;
    }

    public List<Double> getNotas() {
        return notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private void setNotas(double v, double v1, double v2, double v3) {
        this.notas = List.of(v, v1, v2, v3);
    }

    public double calcularMedia() {
        Double soma = 0.0;
        for (int nota = 0; nota < this.notas.size(); nota++) {
            soma += this.notas.get(nota);
        }
        return (soma / this.notas.size());
    }

    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.setNome("Armano");
        aluno1.setNotas(7.4, 8.5, 10.0, 6.2);

        double media = aluno1.calcularMedia();
        System.out.println("A sua média é: " + media);
    }


}
