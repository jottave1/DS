package adivinhacao;

import java.util.Scanner;

public class Adivinhacao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int segredo, numero, tentativas = 0;
        
        System.out.print("Digite o valor secreto (outro jogador deve adivinhar): ");
        segredo = scanner.nextInt();
        
        do {
            System.out.print("Tente adivinhar o valor: ");
            numero = scanner.nextInt();
            tentativas++;
        } while (numero != segredo);
        
        System.out.println("Parabens! Voce acertou apos " + tentativas + " tentativas");
        scanner.close();
    }
}

