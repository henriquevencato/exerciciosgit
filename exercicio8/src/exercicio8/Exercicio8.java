package exercicio8;

import java.util.Arrays;

public class Exercicio8 {

    public static int[] inverterA(int[] arrayOriginal) {
        int tam = arrayOriginal.length;
        int[] arrayIn = new int[tam];

        for (int i = 0; i < tam; i++) {
            arrayIn[i] = arrayOriginal[tam - 1 - i];
        }

        return arrayIn;
    }

    public static void main(String[] args) {
        int[] exemplo = {1, 2, 3, 4, 5};

        int[] invertido = inverterA(exemplo);

        System.out.println("Array original: " + Arrays.toString(exemplo));
        System.out.println("Array invertido: " + Arrays.toString(invertido));
    }
}
