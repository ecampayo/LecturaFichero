//Crear un fichero de texto y leeremos la información caracter a caracter y lo imprimirá por consola
import java.io.FileReader;
import java.io.IOException;
public class LecturaFichero {
    public static void main(String[] args) {
        final String nombreFichero="C:\\pruebas.txt";
        try (FileReader fr=new FileReader(nombreFichero)){
            int valor=fr.read();
            while (valor!=-1){
                //Si el valor es un espacio no lo escribirá
                if (valor!=32){
                    System.out.println((char)valor);
                }
                valor=fr.read();
            }
        }catch (IOException e){
            System.out.println("Hay problemas con la parte de datos" +e);
        }
    }

}
