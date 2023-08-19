import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Declaracao de variaveis e setar posicoes do array
        Random r = new Random();
        int numeroMulheres = r.nextInt(1,20);
        String[][] pessoas = new String[20][2];

        for (int i = 0; i < numeroMulheres; i++) {
            double altMulheres = r.nextDouble(1.5,1.8);
            pessoas[i][0] = "M";
            pessoas[i][1] = String.valueOf(altMulheres);
        }
        for (int i = numeroMulheres; i <= 19; i++) {
            double altHomens =r.nextDouble(1.6,2.2);
            pessoas[i][0] = "H";
            pessoas[i][1] = String.valueOf(altHomens);
        }

        int qtdMulheres=0,qtdHomens=0;
        double maiorPessoa=0,menorPessoa=1000000,mediaAltHomens,somaAlturaHomens=0;

        for (int i=0; i<20;i++){
            if (pessoas[i][0] == "M")
                qtdMulheres++;
            else{
                qtdHomens++;
                somaAlturaHomens = somaAlturaHomens+Double.parseDouble(pessoas[i][1]);
            }
            if (maiorPessoa < Double.parseDouble(pessoas[i][1]))
                maiorPessoa = Double.parseDouble(pessoas[i][1]);
            if (menorPessoa > Double.parseDouble(pessoas[i][1]))
                menorPessoa = Double.parseDouble(pessoas[i][1]);
        }
        mediaAltHomens = somaAlturaHomens/qtdHomens;
        System.out.println("Quantidade de mulheres: "+qtdMulheres);
        System.out.println("Quantidade de homens: "+qtdHomens);
        System.out.println("Altura da maior pessoa: "+maiorPessoa);
        System.out.println("Altura da menor pessoa: "+menorPessoa);
        System.out.println("Media de altura entre os homens: "+mediaAltHomens);
    }
}