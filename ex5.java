import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String palavra, palavraInvertida = "";
        int tamanho;

        System.out.print("Digite uma palavra: ");
        palavra = input.nextLine();

        tamanho = palavra.length();

        for (int i = tamanho - 1; i >= 0; i--) {
            palavraInvertida += palavra.charAt(i);
        }

        System.out.println("A palavra invertida é: " + palavraInvertida);
    }
}
