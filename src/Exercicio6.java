
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
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float vlMedia = 0;
        int vlValor[] = new int[8];
        
        System.out.println(" ------------ entrada dos dados -----------------");
        for (int i = 0; i < vlValor.length; i++) {
            System.out.print(" Digite o " + (i + 1) + "º valor : ");
            vlValor[i] = teclado.nextInt();
        }
        
        /* ------------ Processamento -------------------*/
        System.out.println(" ------------ saida dos dados -----------------");
        int vlNegativo=0;
        for (int i = 0; i < vlValor.length; i++){
            if(vlValor[i] < vlNegativo){
                vlValor[i] = 0;
            }
            System.out.println(+ (i + 1) + "º Valor : " + vlValor[i] );    
        }
        
    }
}
