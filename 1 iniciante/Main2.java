
import java.io.IOException;
import java.util.Scanner;


// exercicio 1001
public class Main2 {
    
    public static void main (String[] args) throws IOException{

        int z,y,x;

        Scanner read = new Scanner(System.in);

        z = read.nextInt();
        y = read.nextInt();

        x = z + y;

        System.out.println("X = "+ x);
        

        read.close();
    }

    
}
