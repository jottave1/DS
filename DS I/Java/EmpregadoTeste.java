package empregadoteste;
import java.util.Scanner;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
    //--------------------------------------------------------------------------// 
    
    
        Empregado salario1 = new Empregado();
        Empregado salario2 = new Empregado();
        
        System.out.println("Digite os dados do primeiro empregado ");
        System.out.println("Codigo: ");
        
        salario1.setCodigo(scanner.nextInt());
        scanner.nextLine();
        
        System.out.println("Nome: ");
        salario1.setNome(scanner.nextLine());
        
        System.out.println("Sobrenome: ");
        salario1.setSobrenome(scanner.nextLine());
        
        System.out.println("Salario Mensal: ");
        salario1.setSalariomensal(scanner.nextInt());
        
        scanner.nextLine();
        
        
    //--------------------------------------------------------------------------//
    
    
        System.out.println("Digite os dados do segundo empregado ");
        System.out.println("Codigo: ");
        
        salario2.setCodigo(scanner.nextInt());
        scanner.nextLine();
        
        System.out.println("Nome: ");
        salario2.setNome(scanner.nextLine());
        
        System.out.println("Sobrenome: ");
        salario2.setSobrenome(scanner.nextLine());
        
        System.out.println("Salario Mensal: ");
        salario2.setSalariomensal(scanner.nextInt());
        
        scanner.nextLine();
        
        
    //--------------------------------------------------------------------------//
    
     
        System.out.println("O salario anual do primeiro empregado é: " + salario1.getSalarioAnual());
    
        System.out.println("O salario anual do segundo empregado é: " + salario2.getSalarioAnual());
        
    }
    
}





