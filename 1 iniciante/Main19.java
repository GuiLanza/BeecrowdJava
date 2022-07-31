import java.io.IOException;
import java.util.Scanner;


// exercicio 1018
public class Main19 {

    public static void main(String[] args) throws IOException{
        int valor;
        int cem = 0;
        int cinq = 0;
        int vint = 0;
        int dez = 0;
        int cinco = 0;
        int dois = 0;
        int um = 0;
        Scanner read = new Scanner(System.in);

        valor = read.nextInt();
       for(int i = 0;valor != 0;i++){
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

            }else if(valor == 1){

                um++;
                valor = 0;
                
            }

            
        }  

           

        
        System.out.println(cem +" nota (s) de R$ 100,00");
        System.out.println(cinq +" nota (s) de R$ 50,00");
        System.out.println(vint +" nota (s) de R$ 20,00");
        System.out.println(dez + " nota (s) de R$ 10,00");
        System.out.println(cinco + " nota (s) de R$ 5,00");
        System.out.println(dois + " nota (s) de R$ 2,00");
        System.out.println(um + " nota (s) de R$ 1,00");

        read.close();
    }
        
        
}
    

