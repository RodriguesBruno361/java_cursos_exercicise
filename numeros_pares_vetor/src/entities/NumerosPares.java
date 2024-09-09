package entities;

public class NumerosPares {
    private int[] numeros;

    public NumerosPares(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] capturarPares() {
        int count = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                count++;
            }
        }

        int[] pares = new int[count];
        int index = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares[index++] = numero;
            }
        }

        return pares;
    }

    public int contarPares() {
        int count = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
