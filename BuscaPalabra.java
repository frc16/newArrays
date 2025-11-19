import java.util.Scanner;

public class BuscaPalabra {
    
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

    System.out.println("texto a buscar: ");

    String textoRemplazar = scanner.nextLine();

    System.out.println("nuevo texto: ");

    String textoNuevo = scanner.nextLine();

    System.out.println(reemplazarPalabra(texto, textoRemplazar, textoNuevo));
    

    scanner.close();
}

}
