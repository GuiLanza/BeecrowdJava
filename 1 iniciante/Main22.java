import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;


//exercicio 1021
public class Main22 {

    private static int vintcent;

    public static void main(String[] args) throws IOException{

        double valor;
        int cem = 0;
        int cinq = 0;
        int vint = 0;
        int dez = 0;
        int cinco = 0;
        int dois = 0;
        int um = 0;
        int cinqcent = 0;
        int vintcinqcent = 0;
        int dezcent = 0;
        int cincocent = 0;
        int umcent = 0;

        Scanner read = new Scanner(System.in);

        valor = read.nextDouble();

        for(int i = 0; valor != 0;i++){

            if(valor >= 100){

                valor = valor - 100;
                cem++;

            }else if(valor >= 50){

                valor = valor - 50;
                cinq++;

            }else if(valor >= 20){

                valor = valor - 20;
                vint++;

            }else if(valor >= 10){

                valor = valor - 10;
                dez++;

            }else if(valor >= 5){

                valor = valor - 5;
                cinco++;

            }else if(valor >= 2){

                valor = valor - 2;
                dois++;

            }else if(valor >= 1){

                um++;
                valor = valor - 1;
                
            }else if(valor >= 0.50){

                cinqcent++;
                valor = valor - 0.50;

            }else if(valor >= 0.25){

                vintcinqcent++;
                valor = valor - 0.25;

            }else if(valor >= 0.10){

                dezcent++;
                valor = valor - 0.10;

            }else if(valor >= 0.05){

                cincocent++;
                valor = valor - 0.05;
                
            }else if(valor >= 0.01|| valor == 0.01){

                umcent++;
                valor = valor - 0.01;
                
            }

        }

        System.out.println("NOTAS:");
        System.out.println(cem +" nota (s) de R$ 100,00");
        System.out.println(cinq +" nota (s) de R$ 50,00");
        System.out.println(vint +" nota (s) de R$ 20,00");
        System.out.println(dez + " nota (s) de R$ 10,00");
        System.out.println(cinco + " nota (s) de R$ 5,00");
        System.out.println(dois + " nota (s) de R$ 2,00");
        System.out.println("MOEDAS:");
        System.out.println(um + " moeda (s) de R$ 1,00");
        System.out.println(cinqcent +" moeda (s) de R$ 0,50");
        System.out.println(vintcinqcent +" moeda (s) de R$ 0,25");
        System.out.println(dezcent + " moeda (s) de R$ 0,10");
        System.out.println(cincocent + " moeda (s) de R$ 0,05");
        System.out.println(umcent + " moeda (s) de R$ 0,01");

        read.close();

    }
    
}
