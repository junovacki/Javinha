import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Inicia as variaveis de temperatura C(celsius), K(Kelvin), F(Fahrenheit), Re(Réaumur), Ra(Rankine)
        double C,K,F,Re,Ra;

        //Instancia o scanner para logo depois receber o dado do usuario
        System.out.println("Informe o grau em celsius");
        Scanner teclado = new Scanner(System.in);

        C = teclado.nextDouble();

        //Realiza o calculo da formulas para apresentar em seguida para o usuario
        F = C * 1.8 + 32;
        K = C + 273.15;
        Re = C * 0.8;
        Ra = C * 1.8 + 32 + 459.67;

        System.out.println("Valor em Fahrenheit: "+F);
        System.out.println("Valor em Kelvin: "+K);
        System.out.println("Valor em Réaumur: "+Re);
        System.out.println("Valor em Rankine: "+Ra);

    }
}