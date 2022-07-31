import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

// exercicio 1015
public class Main16 {
    
    public static void main(String[] args) throws IOException{

        float x1,x2;
        float y1,y2;
        float distancia;

        Scanner read = new Scanner(System.in);

        x1 = read.nextFloat();
        y1 = read.nextFloat();
        x2 = read.nextFloat();
        y2 = read.nextFloat();

        distancia = (float) Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2));

        System.out.printf("%.4f", distancia);
    }
}
