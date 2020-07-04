
import java.util.Scanner;

/**
 *
 * @author Alan <alanjuniorestudo@gmail.com>
 */
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String vogais[] = new String['a' + 'e' + 'i' + 'o' + 'u' + ' '];
        String frase[] = new String[999];
        int vlConta =0;
        
        System.out.println(" ------------ entrada dos dados -----------------");
        System.out.print(" Frase:");
        frase[0]= teclado.next();
        frase[0] = frase[0].toLowerCase();

        /* ------------ Processamento -------------------*/
        frase[0] = frase[0].toLowerCase();
        for (int i = 0; i < frase[0].length(); i++) {
            char vlVogais = frase[0].charAt(i);
            
            if(vlVogais == 'a' | vlVogais == 'e' | vlVogais == 'i' | vlVogais == 'o' | vlVogais == 'u' | vlVogais == ' '){
               vlConta ++; 
            }
        } 
        System.out.println(" ------------ entrada dos dados -----------------");
        System.out.println("Total de vogais : " +  vlConta);
        
    }
}
