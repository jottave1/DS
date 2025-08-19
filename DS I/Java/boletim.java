import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criar 4 objetos Nota
        Nota b1 = new Nota();
        Nota b2 = new Nota();
        Nota b3 = new Nota();
        Nota b4 = new Nota();

        // Array para facilitar o uso
        Nota[] notas = {b1, b2, b3, b4};

        // Ler dados de cada nota
        for (int i = 0; i < notas.length; i++) {
            System.out.println("=== Nota do " + (i+1) + "º Bimestre ===");

            notas[i].setBimestre(i+1);

            System.out.print("Digite a nota: ");
            notas[i].setValorNota(sc.nextDouble());
        }

        // Calcular média
        double soma = 0;
        for (Nota n : notas) {
            soma += n.getValorNota();
        }
        double media = soma / notas.length;

        System.out.println("\nMédia final = " + media);

        sc.close();
    }
}
