import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner myKey = new Scanner(System.in); 
        final double n = 3.14159;
        double area, raio;

        raio = myKey.nextDouble();

        area = n * (raio * raio);

        
        DecimalFormat df = new DecimalFormat("0.0000"); // Define o formato com 4 casas decimais
        System.out.println("A=" + df.format(area));


        

    }
}
