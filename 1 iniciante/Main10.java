import java.io.IOException;
import java.util.Scanner;


// exercicio 1009
public class Main10 {
    
    public static void main(String[] args) throws IOException{

        String name;
        float salaryfix,sales,result;

        Scanner read = new Scanner(System.in);

        name = read.next();

        salaryfix = read.nextFloat();

        sales = read.nextFloat();

        result = (float) ((sales * 0.15) + salaryfix);

        System.out.println(name);
        System.out.printf("TOTAL = %.2f", result);

        read.close();

    }
}
