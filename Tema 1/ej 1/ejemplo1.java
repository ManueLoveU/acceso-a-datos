import java.io.File;

public class ejemplo1 {

    public static void main(String[] args) {
        try {
            File fichero = new File(".\\Tema 1\\Ejemplos\\crearfichero.txt");
            if (fichero.createNewFile()) {
                System.out.println("Fichero creado: " + fichero.getName());
            } else {
                System.out.println("El fichero ya existe.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 }