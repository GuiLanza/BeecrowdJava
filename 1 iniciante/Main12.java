import java.io.IOException;
import java.util.Scanner;


// exercicio 1011
public class Main12 {
    
    
    public static void main(String[] args) throws IOException{

        int r;
        float n = ((float) 3.14159);
        float vol;

        Scanner read = new Scanner(System.in);

        r = read.nextInt();

        vol = (float) (1.33333333333333333333333)*n *(r*r*r);

        System.out.printf("VOLUME = %.3f", vol);

        read.close();
    }
}
