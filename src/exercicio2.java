
import java.util.Scanner;

/**
 *
 * @author Alan <alanjuniorestudo@gmail.com>
 */
public class exercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int vlNumero[] = new int[5];

        System.out.println(" -------- Entradado dos dados  --------- ");
        for (int i = 0; i < vlNumero.length; i++) {
            System.out.print(" Digite o " + (i + 1) + " º numero:");
            vlNumero[i] = teclado.nextInt();
        }

        System.out.println("--------- Saida dos dados --------------");

        int vlMaior = vlNumero[0];
        int vlPosicao = 0;
        for (int i = 0; i < vlNumero.length; i++) {
            if (vlNumero[i] > vlMaior) {
                vlMaior = vlNumero[i];
                vlPosicao = i;
            }
        }
        System.out.println(" O numero maior é --: " + vlMaior);
        System.out.println(" A posição é -------: " + (vlPosicao + 1));

    }
}

