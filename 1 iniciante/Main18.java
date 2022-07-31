import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;


// exercicio 1017
public class Main18 {

    public static void main(String[] args) throws IOException{

        int hours, km;
        float result;
        Scanner read = new Scanner(System.in);

        hours = read.nextInt();
        km = read.nextInt();
        
         result = (float) (hours * km)/ 12;

        System.out.printf("%.3f", result);

        read.close();
    }
    
}