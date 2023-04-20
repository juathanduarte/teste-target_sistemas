//Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero, anterior = 0, atual = 1, proximo = 0, contador = 0;

        System.out.print("Digite um número: ");
        numero = input.nextInt();

        while (proximo < numero) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
            contador++;
        }

        if (proximo == numero) {
            System.out.println("O número " + numero + " pertence a sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence a sequência de Fibonacci.");
        }
        
    }
}
