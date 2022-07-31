import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

//exercicio 1036
public class Main24 {

    public static void main(String[] args){

        double a,b,c;
        double delta,x1,x2;

        Scanner read = new Scanner(System.in);
        
       a = read.nextDouble();
       b = read.nextDouble();
       c = read.nextDouble();
        if(a == 0){
            System.out.println("Impossivel calcular");
        }else{

            delta = Math.pow(b,2) - (4 * a * c);

            if(delta < 0){
                System.out.println("Impossivel calcular");
            }else{

                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.printf("R1 = %.5f", x1);
                System.out.printf("R2 = %.5f", x2);

            }

        }
        
        read.close();
    }
    
}
