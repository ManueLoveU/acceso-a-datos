import java.io.File;

public class Ejemplo2 {

    public static void main(String[] args) {

        File ficheroOrigen = new File(".\\crearFichero.txt");
        String nombreCarpeta = "Backup";
        File carpeta = new File(".\\", nombreCarpeta);
        carpeta.mkdirs();
        
        File ficheroDestino = new File(".\\Backup\\Fichero_movido.txt");
        if (ficheroOrigen.renameTo(ficheroDestino))
        System.out.println("El fichero se movio correcramente.");
        else
        System.out.println("El fichero no pudo moverse.");
    }
}