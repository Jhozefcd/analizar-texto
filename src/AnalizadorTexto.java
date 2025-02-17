import java.util.Scanner;

public class AnalizadorTexto {
    private static final int ALFABETO_SIZE = 26;// Número total de letras en el alfabeto
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un texto para analizar:");
        String texto = sc.nextLine().toLowerCase();

        int[] frecuencia = new int[ALFABETO_SIZE];
        int totalLetras = 0;
        int totalPalabras = 0;
        int totalVocales = 0;

        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c >= 'a' && c <= 'z') {
                frecuencia[c - 'a']++;
                totalLetras++;
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    totalVocales++;
                }
            } else if (c == ' ' && i > 0 && texto.charAt(i - 1) != ' ') {
                totalPalabras++;
            }
        }
        totalPalabras++; // Contar la última palabra

        System.out.println("Análisis del texto:");
        System.out.println("Total de letras: " + totalLetras);
        System.out.println("Total de palabras: " + totalPalabras);
        System.out.println("Total de vocales: " + totalVocales);
        System.out.println("Frecuencia de letras:");
        for (int i = 0; i < 26; i++) {
            if (frecuencia[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + frecuencia[i]);
            }
        }

        sc.close();
    }
}

