import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;


//exercicio 1020
public class Main21 {
    

    public static void main(String[] args ) throws IOException{

        int time;
        int days = 0;
        int years = 0;
        int month = 0;

        Scanner read = new Scanner(System.in);
        
        time = read.nextInt();

        for(int i = 0; time != 0;i++){

            if(time >= 365){

                time = time -365;
                years++;

            }else if(time >= 30){

                time = time - 30;
                month++;

            }else if(time != 0){

                days = time;
                time = 0;
            }
        }
        

        System.out.println(years +" ano(s)");
        System.out.println(month +" mes(es)");
        System.out.println(days +" dia(s)");
        
        read.close();
    }
}
