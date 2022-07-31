import java.io.IOException;
import java.util.Scanner;


// exercicio 1006
public class Main7 {

    public static void main(String[] args) throws IOException{

        double x,y,z,result;

        Scanner read = new Scanner(System.in);

        x = read.nextDouble();
        y = read.nextDouble();
        z = read.nextDouble();
        result = ((x *2) + (y * 3) + (z * 5))/10.0;

        System.out.printf("MEDIA = "+ result);

        read.close();

    }
    
}
