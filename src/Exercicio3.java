
import java.util.Scanner;

/**
 *
 * @author Alan <alanjuniorestudo@gmail.com>
 */
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vlQnt=0;
        int vlValor[] = new int[20];
        for (int i = 0; i < vlValor.length; i++) {
            System.out.print(" Digite o " + (i + 1) + "º valor : ");
            vlValor[i] = teclado.nextInt();
        }

        for (int i = 0; i < vlValor.length; i++) {
            
            if (vlValor[i] % 2 == 0) {
                vlQnt ++;
                System.out.println(" numeros pares : " + vlValor[i]);
            }
           
        }
         System.out.println(" Foram " + vlQnt + " numero pares ");
    }
}
