/*1010 - Neste problema, deve-se ler o código de uma peça 1, 
o número de peças 1, o valor unitário de cada peça 1, 
o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. 
Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. 
Em cada linha haverá 3 valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, 
lembrando de deixar um espaço após os dois pontos e um espaço após o "R$". 
O valor deverá ser apresentado com 2 casas após o ponto. */

import java.util.Scanner;

public class CalculoSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // leitura dos dados da peça 1
        int codigoPeca1 = sc.nextInt();
        int numPecas1 = sc.nextInt();
        double valorUnitPeca1 = sc.nextDouble();

        // leitura dos dados da peça 2
        int codigoPeca2 = sc.nextInt();
        int numPecas2 = sc.nextInt();
        double valorUnitPeca2 = sc.nextDouble();

        // cálculo do valor total a ser pago
        double valorTotal = numPecas1 * valorUnitPeca1 + numPecas2 * valorUnitPeca2;

        // impressão do resultado
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

        sc.close();
    }
}
