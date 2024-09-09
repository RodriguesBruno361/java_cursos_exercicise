package entities;

public class MaiorPosicao {
    private double[] numeros;

    public MaiorPosicao(int n) {
        this.numeros = new double[n];
    }

    public void adicionarNumero(int posicao, double numero) {
        this.numeros[posicao] = numero;
    }

    public double capturarMaiorValor() {
        double maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        return maior;
    }

    public int capturarPosicaoMaiorValor() {
        double maior = numeros[0];
        int posMaior = 0;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
                posMaior = i;
            }
        }
        return posMaior;
    }

    public void exibirMaiorValorEPosicao() {
        double maior = capturarMaiorValor();
        int posMaior = capturarPosicaoMaiorValor();
        System.out.printf("Maior valor: %.1f%n", maior);
        System.out.printf("Posicao do maior valor: %d%n", posMaior);
    }
}
