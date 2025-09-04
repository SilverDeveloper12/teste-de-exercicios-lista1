package teste.exercicios.pica.em.java.de.algorithms.mermao.ala;
import java.util.Scanner;

public class exerciciotreuze {
    public static void main(String []args){
    Scanner input = new Scanner(System.in);    
        
     byte n1,n2,n3;
        
     System.out.print("Digite o first number: ");
     n1 = input.nextByte();
     System.out.print("Digite o number two: ");
     n2 = input.nextByte();
     System.out.print("Digite o number three you nubi: ");
     n3 = input.nextByte();
     
     if((n1 > n2) && (n1 > n3)){
         System.out.println(n1 + " e o mais foda e maior" );  
     }else if((n2 > n1) && (n2 > n3)){
         System.out.println(n2 + "que eh o mais foda e maior");
     }
     else{
         System.out.println(n3 + " que na vdd era o maios fodars lkkkk");
     }
    }
}
