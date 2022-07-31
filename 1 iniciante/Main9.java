import java.io.IOException;
import java.util.Scanner;


// exercicio 1008
public class Main9 {
    
    public static void main(String[] args ) throws IOException{

        int number,hours;
        float valorh,salary;

        Scanner read = new Scanner(System.in);

        number = read.nextInt();
        hours = read.nextInt();

        valorh = read.nextFloat();

        salary = hours * valorh;

        System.out.println("NUMBER = "+ number);
        System.out.printf("SALARY = U$ %.2f", salary);

        read.close();
    }
}
