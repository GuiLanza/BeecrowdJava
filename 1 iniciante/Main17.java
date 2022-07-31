import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;


// exercicio 1016
public class Main17 {

    public static void main(String[] args) throws IOException{

        int x;

        Scanner read = new Scanner(System.in);

        x = read.nextInt();

        x = x+x;
        System.out.println(x+" Minutos");

        read.close();
    }
    
}
