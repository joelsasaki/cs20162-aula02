/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios;


import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class SomaDeNaturais {
    
        public static int soma(int n){
    
            int i = 2; 
            int s = 1;
    
            while ( i <= n ){
            s += i;
            i += 1;
            }
            return (s);   
}

public static void main (String [] args){
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Digite um numero");
    
    int x = leitor.nextInt();
    
    System.out.println("A soma dos " + x + " primeiros numeros naturais é: " + soma(x));
    
    System.exit(0);
}}
    
}