/*1002 - A fórmula para calcular a área de uma 
circunferência é: area = π . raio2. Considerando 
para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de 
raio ao quadrado e multiplicando por π.*/
import java.util.Scanner;

public class AreaCircunferencia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        final double PI = 3.14159;
        
        double raio = sc.nextDouble();
        double area = PI * Math.pow(raio, 2);
        
        System.out.printf("A=%.4f%n", area);
        
        sc.close();
    }
}
