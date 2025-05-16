
package exercicio04;


public class Exercicio04 {

  
   public static int contarV(String s) {
          int contar = 0;
        s = s.toLowerCase();
        for (char c : s.toCharArray()) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contar++;
            }
        }
        return contar;
    }
public static String maisV(String[] palavras) {
        String comMaisVogais = "";
        int maximoVogais = 0;

        for (String palavra : palavras) {
            int quantidade = contarV(palavra);
            if (quantidade > maximoVogais) {
                maximoVogais = quantidade;
                comMaisVogais = palavra;
            }
        }

        return comMaisVogais;
    }
    public static void main(String[] args) {
        String[] palavras = {"cachorro", "mediocre", "universos", "python", "palavra"};
        String resultado = maisV(palavras);
        System.out.println("String com mais vogais: " + resultado);
    }
}