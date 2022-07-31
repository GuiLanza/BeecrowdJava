import java.io.IOException;
import java.util.Scanner;


// exercicio 1012 Modificado interativo com cliente
public class Main13 {
    
    public static void main(String[] args) throws IOException{

        int opc;
        float a,b,c,result;

        Scanner read = new Scanner(System.in);

        do{
            System.out.println("ESCOLHA UMA OPCAO");
            System.out.println("(1) AREA TRIANGULO");
            System.out.println("(2) AREA CIRCULO");
            System.out.println("(3) AREA TRAPEZIO");
            System.out.println("(4) AREA QUADRADO");
            System.out.println("(5) AREA RETANGULO");
            System.out.println("(0)SAIR");

            opc = read.nextInt();

            if(opc == 1){

                System.out.println("Digite os valores:");

                a = read.nextFloat();
                b = read.nextFloat();

                result = (a * b)/2;

                System.out.println("Area triangulo = "+ result);
            }else if(opc == 2){

                System.out.println("Digite os valores:");

                a = read.nextFloat();
                b =(float) 3.14159;

                result = (a * a) * b;

                System.out.println("Area do circulo = "+ result);

            }else if(opc == 3){

                System.out.println("Digite os valores:");

                a = read.nextFloat();
                b = read.nextFloat();
                c = read.nextFloat();

                result = ((a + b)*c)/2;

                System.out.println("Area do trapezio = "+ result);

            }else if(opc == 4){

                System.out.println("Digite os valores:");

                b = read.nextFloat();

                result = b *b;

                System.out.println("Area di quadrado = "+ result);

            }else if(opc == 5){

                System.out.println("Digite os valores:");

                a = read.nextFloat();
                b = read.nextFloat();

                result = a * b;

                System.out.println("Area retangulo = "+ result);
            }else if(opc > 5 || opc < 0){
                System.out.println("OPCAO INVALIDA:");
            }

        }while(opc != 0);

        System.out.println("FECHANDO PROGRAMA");

        read.close();
    }
}
