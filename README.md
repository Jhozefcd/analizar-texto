## Aquí dejarás tu documentación, por qué decidiste realizar esas optimización y cómo resolvistes los ejercicios de lógica...
Se importa java.util.Scanner para permitir la entrada de datos desde la consola
private static final int ALFABETO_SIZE = 26;: Esta constante representa el número total de letras en el alfabeto (de 'a' a 'z')
Se crea una instancia de Scanner llamada sc para leer la entrada del usuario
Se solicita al usuario que ingrese un texto. Este texto se convierte a minúsculas para asegurar un análisis uniforme
Se crea un arreglo frecuencia para contar letras y se inicializan contadores para totalLetras, totalPalabras y totalVocales en cero
Se recorre el texto ingresado; si un carácter es una letra (de 'a' a 'z'), se actualiza su frecuencia y se incrementan los contadores de letras y vocales. Si se encuentra un espacio (no consecutivo), se incrementa el contador de palabras
Se suma uno a totalPalabras para incluir la última palabra que puede no estar seguida de un espacio
Se imprimen el total de letras, palabras y vocales, junto con la frecuencia de cada letra encontrada
