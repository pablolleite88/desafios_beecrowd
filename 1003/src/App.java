import java.io.IOException;
import java.util.Scanner;
 
/**
 * IMPORTANT: 
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */
public class App {
 
    public static void main(String[] args) throws IOException {
 
        Scanner myKey = new Scanner(System.in); 

        int a = myKey.nextInt(); 
        int b = myKey.nextInt(); 
        int x = a + b;

        System.out.println("SOMA = " + x);
        
    }
 
}