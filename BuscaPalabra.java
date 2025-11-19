import java.util.Scanner;

public class BuscaPalabra {

    public static int buscarCaracter(String texto, char c){
        int contador = 0;
        for(int i=0; i<texto.length(); i++){
               if(texto.charAt(i)==c);{
               contador++;
               }
        }
        return 0;
    }

    public static void pintarDoble(int numero){
        
        System.out.println(2*numero);
    }
    public static char buscarLetra(String texto, int posicion){
        if(posicion>=texto.length()){
            return ' ';
        }else{
            return texto.charAt(posicion);
        }
    }
    
public static String reemplazarPalabra(String textOriginal, String textoBuscar, String nuevoTexto) {
    if (textOriginal.contains(textoBuscar)) {
        return textOriginal.replace(textoBuscar, nuevoTexto);
    }else{
        return "texto no encontrado";
    }
}


 
public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
   
    System.out.print("introduce texto: ");

    String texto = scanner.nextLine();

    System.out.println("introduce caracter: ");

    char caracter = scanner.nextLine().charAt(0); 

    System.out.println("texto a buscar: ");

    int total = buscarCaracter(texto, caracter);

    System.out.printf("aparece %d veces", total);

    String textoRemplazar = scanner.nextLine();

    System.out.println("nuevo texto: ");

    String textoNuevo = scanner.nextLine();

    String textoReemplazado = (reemplazarPalabra(texto, textoRemplazar, textoNuevo));
    
    System.out.printf("texto reemplazado: %s%n", textoReemplazado);

    System.out.println("introduce la posicion: ");

    int posicion = scanner.nextInt();

   char letra = buscarLetra(textoReemplazado, posicion);

   System.out.println(letra);

    scanner.close();
}

}
