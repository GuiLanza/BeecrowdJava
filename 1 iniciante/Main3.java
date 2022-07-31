import java.io.IOException;
import java.util.Scanner;


// exercicio 1002
public class Main3 {
    
    public static void main(String[] args) throws IOException{

        float n,r;
        float resultado;

        n = (float) 3.14159;

        Scanner read = new Scanner(System.in);

        r = read.nextFloat();

        resultado = n * (r * r);

        System.out.printf("A=%.4f", resultado);

        read.close();
    }
}
