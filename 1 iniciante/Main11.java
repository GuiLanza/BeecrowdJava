import java.io.IOException;
import java.util.Scanner;


// exercicio 1010
public class Main11 {

    public static void main(String[] args) throws IOException{
        
        int cod1,unid1,cod2,unid2;
        float price1,price2;
        float result;

        Scanner read = new Scanner(System.in);

        cod1 = read.nextInt();
        unid1= read.nextInt();
        price1 = read.nextFloat();
        cod2 = read.nextInt();
        unid2= read.nextInt();
        price2 = read.nextFloat();

        result = (unid1 * price1) + (unid2 * price2);

        System.out.printf("VALOR A PAGAR: R$ %.2f", result);


        read.close();
    }
} 
