import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10.0;

        System.out.printf("MEDIA = %.1f%n", media);

        scanner.close();   
          
    }
}
