
package exercicio7;


public class Exercicio7 {

   public static int calcularMDC(int cal1, int cal2) {
       
        cal1 = Math.abs(cal1);
        cal2 = Math.abs(cal2);

     
        while (cal2 != 0) {
            int temp = cal2;
            cal2 = cal1 % cal2;
            cal1 = temp;
        }

        return cal1;
    }

    public static void main(String[] args) {
     
        System.out.println("MDC de 48 e 18: " + calcularMDC(38, 18)); 
        System.out.println("MDC de 100 e 25: " + calcularMDC(130, 25)); 
        System.out.println("MDC de -81 e 153: " + calcularMDC(-76, 153)); 
    }
}