package app;

import java.util.Locale;
import java.util.Scanner;

import entities.MaiorPosicao;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        MaiorPosicao maiorPosicao = new MaiorPosicao(n);

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            double numero = sc.nextDouble();
            maiorPosicao.adicionarNumero(i, numero);
        }

        maiorPosicao.exibirMaiorValorEPosicao();

        sc.close();
    }
}

