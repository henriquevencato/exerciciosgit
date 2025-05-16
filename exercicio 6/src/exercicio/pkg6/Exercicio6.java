
package exercicio.pkg6;


public class Exercicio6 {

   public static boolean Palindromo(String texto) {
        
        String textoF = texto.replaceAll("\\s+", "").toLowerCase();

      
        StringBuilder reverso = new StringBuilder(textoF).reverse();
       
        return textoF.equals(reverso.toString());
    }

    public static void main(String[] args) {
      
        String[] exp = {"Radar", "Deified", "A man a plan a canal Panama", "Não é palíndromo"};

        for (String exemplo : exp) {
            System.out.println("\"" + exemplo + "\" é palíndromo? " + Palindromo(exemplo));
        }
    }
}