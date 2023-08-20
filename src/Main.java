// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Insira a quantidade de pessoas: ");
        int qtdPessoas = teclado.nextInt();
        double valorSalario=0,valorFinal,valorAtual;

        if(qtdPessoas > 0){
            for (int i =0; i < qtdPessoas; i++){
                System.out.println("Insira o valor de salario do funcionario: ");
                valorAtual = teclado.nextDouble();
                valorSalario = valorSalario + valorAtual;
            }
            valorFinal = valorSalario / qtdPessoas;
            System.out.println("Valor da media salarial: "+ valorFinal);

        }else{
            System.out.println("Insira um numero maior que zero");
        }

    }
}