import java.io.IOException;
import java.util.Scanner;


//exercicio 1035
public class Main23 {
    
    public static void main(String[] args) throws IOException{

        int a,b,c,d;

        Scanner read = new Scanner(System.in);

        a = read.nextInt();
        b = read.nextInt();
        c = read.nextInt();
        d = read.nextInt();

        if(b > c && d > a && c + d > a + b && c >= 0 && d >= 0 && a %2 == 0){
            System.out.println("Valores aceitos");
        
        }else{
            System.out.println("Valores nao aceitos");
        }

        read.close();
    }
}
