public class ejercicio4 {

public static void main(String[] args) {

    int tamano_buffer = 1024;
    byte[] buffer = new byte[tamano_buffer];

    try {

        BufferedInputStream entrada = new BufferedInputStream(
            new FileInputStream(name: "./Bloque1/Tema1/psk.jpg")
        );

        int bytesleidos;
        int bloque = 1;
        while((bytesleidos= entrada.read(buffer)) != -1){
            salida.write(buffer, off: 0, bytesleidos);
            System.out.println("Fin bloque: " + bloque + ", se han leido ")
        }

        entrada.close();
        salida.close();
    }catch (Exception e) {
        // TODO: handle exception
    }
}
}
    