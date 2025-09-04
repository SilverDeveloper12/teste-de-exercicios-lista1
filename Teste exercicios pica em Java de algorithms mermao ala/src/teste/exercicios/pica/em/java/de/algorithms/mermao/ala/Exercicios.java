package teste.exercicios.pica.em.java.de.algorithms.mermao.ala;
import java.util.Scanner;

public class Exercicios {
    public static void main(String []args){
    Scanner input = new Scanner(System.in);    
       String name;
       float salarioFixo,vendasCash;
       double commit = 0.15 ,calcCommit,endMonth;
       
       System.out.println("*-- Formulario de funcionarios --*");
       System.out.println("----------------------------------");
        
       System.out.print("Digite o nome do funcionario: "); 
       name = input.nextLine();
       System.out.print("Digite o valor do salario fixo do funcionario: ");
       salarioFixo = input.nextFloat();
       System.out.print("Agora digite o valor em vendas do funcionario (em dinheiro): ");
       vendasCash = input.nextFloat();
       
       
       calcCommit = vendasCash * commit;
       endMonth = salarioFixo + calcCommit;
       
       System.out.println("O funcionario " + name + " recebe por mes o valor de " + endMonth + " Reais");
       
    }
    
}
