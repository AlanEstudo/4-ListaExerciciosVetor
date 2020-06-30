
import java.util.Scanner;

/*
 * Faça um algoritmo que solicite vinte idades (um vetor de vinte posições) e ao final apresente apenas as idades nas posições pares
 */
/**
 *
 * @author Alan <alanjuniorestudo@gmail.com>
 */
public class Exercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /*Declarando as variaveis
         * onde: vlIdade do tipo Vetor 
         */
        int vlIdade[] = new int[20];
        
        System.out.println(" -------- Entradado dos dados  --------- ");
        /*Carregando o vetor com as idades */
        for (int i = 0; i < vlIdade.length; i++) {
            System.out.print(" Digite a " + (i + 1) + " º idade:");
            vlIdade[i] = teclado.nextInt();
        }
        /*Calculo para mostar apenas os valores PAR*/
        System.out.println(" -------- Saida dos dados --------- ");
        for (int i = 0; i < vlIdade.length; i++) {
            if (vlIdade[i] % 2 == 0) {
                System.out.println(" " + vlIdade[i]);
            }
        }
    }
}
