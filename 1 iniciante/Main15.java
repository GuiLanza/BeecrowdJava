import java.io.IOException;
import java.util.Scanner;


// exercicio 1014
public class Main15 {

    public static void main(String[] args) throws IOException{

        int km; 
        float litros;
        float result;

        Scanner read = new Scanner(System.in);

        km = read.nextInt();
        litros = read.nextFloat();

        result = (km/litros);

        System.out.printf("%.3f km/l", result);

        read.close();
    }
    
}
