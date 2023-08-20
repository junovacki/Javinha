// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       escreverFrase("Hello World!");
       incrementando(5);
    }

    public static void escreverFrase(String frase){
        System.out.println(frase);
    }

    public static void incrementando(int parada){
        for (int i = 1; i <= parada; i++) {
            String frase = "i = " + i;
            escreverFrase(frase);
        }
    }
}