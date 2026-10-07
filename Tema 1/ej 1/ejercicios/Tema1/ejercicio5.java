package Tema1;


import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ejercicio5 {
    public static void main(String[] args) {
       
        try {
           
            FileInputStream fis = new FileInputStream("./ejercicios/psk.jpg");
            FileOutputStream fos = new FileOutputStream("./ejercicios/psk_copia.jpg");

            int data;
            int contador = 0;
            long inicio1 = System.currentTimeMillis();
            while((data=fis.read()) != -1){
                fos.write(data);
                contador++;
            }

            System.out.println("Se han copiado " + contador + " bytes");
            long final1 = System.currentTimeMillis();
            System.out.println("FileInputStream ha tardado " + (final1-inicio1) + " ms");

            fis.close();
            fos.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}