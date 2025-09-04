package teste.exercicios.pica.em.java.de.algorithms.mermao.ala;
import java.util.Scanner;


public class Exerciciodouze {
    public static void main(String []args){
    Scanner input = new Scanner(System.in);
    double L,R,pi,calcL,calcR;
    
    System.out.print("Digite o valor do lado do quadrado: ");
    L = input.nextDouble();
    System.out.print("Digite agora o valor do raio do circulo: ");
    R = input.nextDouble();
    
    pi = Math.PI;
    calcL = (L * L) * 2;
    calcR = pi * (R * R);
    
        
    if(calcL > calcR){
        System.out.println("A area do quadrado e maior!");
    }else{
        System.out.println("A area da circunferencia e maior!");
        }
    }
}
