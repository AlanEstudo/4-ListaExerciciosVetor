
import java.util.Scanner;

/**
 *
 * @author Alan <alanjuniorestudo@gmail.com>
 */
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double vlValor[] = new double[5];
        for (int i = 0; i < vlValor.length; i++) {
            System.out.print(" Digite o " + (i + 1) + "º valor : ");
            vlValor[i] = teclado.nextDouble();
        }

        double vlMenor = 9999;
        int vlPosicao = 0;
        for (int i = 0; i < vlValor.length; i++) {

            if (vlValor[i] < vlMenor) {
                vlMenor = vlValor[i];
                vlPosicao =i;
            }
        }

        System.out.println(" Menor valor   : " + vlMenor);
        System.out.println(" Posição vetor : " + (vlPosicao + 1));
    }
}
