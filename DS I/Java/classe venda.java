import java.util.Scanner;

public class Venda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Criar 5 objetos Produto
        Produto item1 = new Produto();
        Produto item2 = new Produto();
        Produto item3 = new Produto();
        Produto item4 = new Produto();
        Produto item5 = new Produto();

        // Array para facilitar o uso
        Produto[] itens = {item1, item2, item3, item4, item5};

        // Ler dados de cada produto
        for (int i = 0; i < itens.length; i++) {
            System.out.println("=== Produto " + (i+1) + " ===");

            System.out.print("Número: ");
            itens[i].setNumero(sc.nextInt());
            sc.nextLine(); // consumir quebra de linha

            System.out.print("Descrição: ");
            itens[i].setDescricao(sc.nextLine());

            System.out.print("Preço: ");
            itens[i].setPreco(sc.nextDouble());
            sc.nextLine();
        }

        // Calcular total
        double total = 0;
        for (Produto p : itens) {
            total += p.getPreco();
        }

        System.out.println("\nValor total dos itens: R$ " + total);

        sc.close();
    }
}
