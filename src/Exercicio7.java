
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alan <alanjuniorestudo@gmail.com>
 */
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vlPar = 0;
        int vlMultiplo =0;
        int vlValor[] = new int[8];
        
        System.out.println(" ------------ entrada dos dados -----------------");
        for (int i = 0; i < vlValor.length; i++) {
            System.out.print(" Digite o " + (i + 1) + "º valor : ");
            vlValor[i] = teclado.nextInt();
        }
        
        /* ------------ Processamento -------------------*/
        for (int i = 0; i < vlValor.length; i++) {
            if (vlValor[i] % 2 == 0) {
                vlPar ++ ;
            }
            
            if(vlValor[i] % 5 == 0){
               vlMultiplo ++; 
            }
        }
        System.out.println(" ------------ Saida dos dados -----------------");
        System.out.println(" Contem " + vlPar + " de numeros pares " );
        System.out.println(" Contem " + vlMultiplo + " de multiplos de 5 ");
    }
}
