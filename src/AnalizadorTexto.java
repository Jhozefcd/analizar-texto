import java.util.Scanner;

public class AnalizadorTexto {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un texto para analizar:"); //Le pedimos al usuario que ingrese un texto por teclado con el scanner
        String texto = scanner.nextLine();

        int[] frecuencia = analizarFrecuenciaLetras(texto); 
        int totalLetras = contarTotalLetras(frecuencia);
        int totalPalabras = contarPalabras(texto);
        int totalVocales = contarVocales(texto);

        mostrarResultados(totalLetras, totalPalabras, totalVocales, frecuencia); //guardamos las variables en una nueva variable llamda "mostrar resultados"

        scanner.close();
    }

    private static int[] analizarFrecuenciaLetras(String texto) {
        int[] frecuencia = new int[26]; //se utilizo un array
        for (char c : texto.toCharArray()) {
            if (Character.isLetter(c)) {
                frecuencia[c - 'a']++;
            }
        }
        return frecuencia;
    }

    private static int contarTotalLetras(int[] frecuencia) {
        int totalLetras = 0;
        for (int f : frecuencia) {
            totalLetras += f;
        }
        return totalLetras;
    }

    private static int contarPalabras(String texto) {
        String[] palabras = texto.trim().split("\\s+");
        return palabras.length;
    }

    private static int contarVocales(String texto) {
        int totalVocales = 0;
        for (char c : texto.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                totalVocales++;
            }
        }
        return totalVocales;
    }

    private static void mostrarResultados(int totalLetras, int totalPalabras, int totalVocales, int[] frecuencia) {
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
    }
}
