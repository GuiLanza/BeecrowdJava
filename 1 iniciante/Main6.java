import java.io.IOException;
import java.util.Scanner;


// exercicio 1005
public class Main6 {
    
    public static void main(String[] args) throws IOException{

        float x,y,result;

        Scanner read = new Scanner(System.in);

        x = read.nextFloat();
        y = read.nextFloat();

        result = ((float) (3.5 *x) + (float) (7.5 * y))/11;

        System.out.printf("MEDIA = %.5f", result);

        read.close();

    }
}
