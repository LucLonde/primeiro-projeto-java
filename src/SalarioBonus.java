/*1009 - Faça um programa que leia o nome de um vendedor, 
o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). 
Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
informar o total a receber no final do mês, com duas casas decimais.

Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) 
e 2 valores de dupla precisão (double) com duas casas decimais, 
representando o salário fixo do vendedor e montante total das 
vendas efetuadas por este vendedor, respectivamente.

Saída
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido. */
import java.util.Scanner;

public class SalarioBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // lendo nome, salário e total de vendas
        String nome = sc.nextLine();
        double salarioFixo = sc.nextDouble();
        double totalVendas = sc.nextDouble();

        // calculando o salário final com a comissão de 15% sobre as vendas
        double salarioFinal = salarioFixo + (totalVendas * 0.15);

        // exibindo o resultado com duas casas decimais
        System.out.printf("TOTAL = R$ %.2f\n", salarioFinal);

        sc.close();
    }
}
