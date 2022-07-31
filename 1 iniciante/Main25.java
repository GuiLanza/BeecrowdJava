import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;


//exercicio 1037
public class Main25 {

    public static void main(String[] args) throws IOException{

        double x;
        

        Scanner read = new Scanner(System.in);

        x = read.nextDouble();
        if(x < 0 || x > 100){
            System.out.println("Fora de intervalo");
        }
        else if(x >= 0 && x <= 25){
            System.out.println("Intervalo (0,25)");
        }else if(x >= 25 && x <= 50){
            System.out.println("Intervalo (25,50)");
        }else if(x >= 50 && x <= 75){
            System.out.println("Intervalo (50,75)");
        }else if(x >= 75 && x <= 100){
            System.out.println("Intervalo (75,100)");
        }

        read.close();
    }
    
}
