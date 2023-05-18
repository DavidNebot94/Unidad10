package aplicacion10.pkg12;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main12 {

    public static void main(String[] args) {
        System.out.print("Nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.print("Edad: ");
        int edad = new Scanner(System.in).nextInt();
        try ( BufferedWriter salida = new BufferedWriter(
                new FileWriter("datos.txt", true))) {
            salida.write(nombre + "\t" + edad);
            salida.newLine();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}
