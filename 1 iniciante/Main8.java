import java.io.IOException;
import java.util.Scanner;


// exercicio 1007
public class Main8 {
    
    public static void main(String[] args) throws IOException{

        int a,b,c,d,result;

        Scanner read = new Scanner(System.in);

        a = read.nextInt();
        b = read.nextInt();
        c = read.nextInt();
        d = read.nextInt();

        result = (a * b) - (c * d);

        System.out.println("DIFERENCA = " + result);

        read.close();
    }
}
