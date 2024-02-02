package desafios.aula01;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibeFichaDoCarro() {
        System.out.println("Modelo do carro: " + modelo);
        System.out.println("Ano do carro: " + ano);
        System.out.println("Cor do carro: " + cor);
    }

    void idadeDoCarro(int anoAtual) {
        System.out.println("A idade do carro é: " + (anoAtual - ano));
    }
}
