import java.text.Normalizer;
import java.util.Scanner;

/*
     * Escribe una función que reciba un texto y retorne verdadero o
     * falso (Boolean) según sean o no palíndromos.
     * Un Palíndromo es una palabra o expresión que es igual si se lee
     * de izquierda a derecha que de derecha a izquierda.
     * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
     * Ejemplo: Ana lleva al oso la avellana.
     */
   public class Palindromo {
       public static void main (String[] arg){

           Scanner sc = new Scanner(System.in);
           String texto;

           while(true){
               //OBTENERMOS LA PALABRA
               System.out.println("Ingrese la palabra o el texto, (coloque la palabra 'salir' para terminar)");
               texto = sc.nextLine();

               //CONDICION DE CIERRE DE PROGRAMA
               if (texto.equalsIgnoreCase("salir")){
                   System.out.println("Programa terminado");
                   break;
               }

               //CONVIERTE TODO A MINUSCULA PARA VALIDACIÓN
               String palabraLimpia = texto.toLowerCase().replace(" ","");
               boolean palindromo = true;

               //NORMALIZA EL TEXTO (SEPARA LETRAS DE TILDES
               palabraLimpia = Normalizer.normalize(palabraLimpia, Normalizer.Form.NFD);

               //ELIMINA TILDES Y SÍMBOLOS
               palabraLimpia = palabraLimpia.replaceAll("\\p{M}","");

               //FILTRAMOS LETRAS DE SIMBOLOS COMPLEJOS
               palabraLimpia = palabraLimpia.replaceAll("[^a-z]","");

               //OBTENEMOS LA MEDIDA DE TODO EL TEXTO
               int medida = palabraLimpia.length();

               //CICLO DE COMPARACIÓN
               for (int i = 0; i < medida/2; i++){
                   if (palabraLimpia.charAt(i) != palabraLimpia.charAt(medida -1 -i)){
                       palindromo = false;
                       break;
                   }
               }

               if (palindromo){
                   System.out.println("-> '" + texto + "' si es palíndromo\n");
               }else {
                   System.out.println("-> '"+ texto + "' no es palíndromo\n");
               }

           }


       }

}