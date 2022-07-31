import java.io.IOException;
import java.util.Scanner;


// exercicio 1004
public class Main5 {

    public static void main(String[] args) throws IOException{

        int x,y,result;

        Scanner read = new Scanner(System.in);

        x = read.nextInt();
        y = read.nextInt();

        result = x * y;

        System.out.println("PROD = "+ result);

        read.close();
    }
    
}
