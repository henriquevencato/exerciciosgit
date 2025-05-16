
package exercicio2;

public class Exercicio2 {

    
      public static int gaveta(int [] numeros) {
     int maior = 0;
     
     for (int num : numeros) {
      int valorAbs = Math.abs(num);
       if (valorAbs > maior) {
           maior = valorAbs;
       }
     }
     
    return maior;
   
    }
    public static void main(String[] args) {
     int[] array = { 304 , 663 , 2143 , 9172 , 99};
     int resultado = gaveta(array);
        System.out.println("Maior valor absoluto: " + resultado);
    }
   
}
    
    

