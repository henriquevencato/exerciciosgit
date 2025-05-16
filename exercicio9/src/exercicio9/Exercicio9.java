
package exercicio9;


public class Exercicio9 {

   
    public static double calcularPorcentagem(double total, double porcentagem) {
        return (total * porcentagem) / 100.0;
    }

    public static void main(String[] args) {
        // Exemplos de uso
        double resultado = 200;
        double porcentagem = 15;

        double conta = calcularPorcentagem(resultado, porcentagem);
        System.out.println(porcentagem + "% de " + resultado + " é: " + conta); 
    }
}