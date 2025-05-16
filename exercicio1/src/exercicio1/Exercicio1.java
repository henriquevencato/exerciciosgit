
package exercicio1;

import java.util.Scanner;

public class Exercicio1 {

   
   public static boolean Perfeito(int n1) {
    int soma = 0;
     for (int i = 1; i < n1; i++) {
            if (n1 % i == 0) {
                soma += i;
            }
        }
       
       
        return soma == n1;
    }


    public static void main(String[] args) {
          Scanner ler = new Scanner(System.in);
       
        System.out.println("Digite um número inteiro para ver se é perfeito:");
        int num = ler.nextInt();

       
        if (Perfeito(num)) {
            System.out.println(num + " é um número perfeito.");
        } else {
            System.out.println(num + " não é um número perfeito.");
        }  
    }
   
}
