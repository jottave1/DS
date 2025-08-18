
package cadastro;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Pessoa registro1 = new Pessoa();
        Pessoa registro2 = new Pessoa();
        Pessoa registro3 = new Pessoa();

        System.out.println("Digite os dados da primeira pessoa:");
        System.out.print("Código: ");
        registro1.setCodigo(scanner.nextInt());
        scanner.nextLine(); 
        System.out.print("Nome: ");
        registro1.setNome(scanner.nextLine());
        System.out.print("Idade: ");
        registro1.setIdade(scanner.nextInt());

        scanner.nextLine();
        
        System.out.println("\nDigite os dados da segunda pessoa:");
        System.out.print("Código: ");
        registro2.setCodigo(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nome: ");
        registro2.setNome(scanner.nextLine());
        System.out.print("Idade: ");
        registro2.setIdade(scanner.nextInt());

        scanner.nextLine(); 
        System.out.println("\nDigite os dados da terceira pessoa:");
        System.out.print("Código: ");
        registro3.setCodigo(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Nome: ");
        registro3.setNome(scanner.nextLine());
        System.out.print("Idade: ");
        registro3.setIdade(scanner.nextInt());

        
        Pessoa maisVelha = registro1;
        if (registro2.getIdade() > maisVelha.getIdade()) {
            maisVelha = registro2;
        }
        if (registro3.getIdade() > maisVelha.getIdade()) {
            maisVelha = registro3;
        }

        System.out.println("\nA pessoa com a maior idade é: " + maisVelha.getNome());

        scanner.close();
    }
}

