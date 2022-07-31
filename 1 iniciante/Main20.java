import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;


// exercicio 1019 conversão de tempo!!!!!
public class Main20 {

    public static void main(String[] args) throws IOException{

        int time;
        int hours = 0;
        int minuts = 0;
        int sec = 0;
        Scanner read = new Scanner(System.in);

        time = read.nextInt();

        for(int i = 0; time != 0;i++){
            if(time >= 3600){

                time = time - 3600;
                hours++;
    
            }else if(time >= 60){

                time = time - 60;
                minuts++;

            }else if(time >= 0){

                sec = time;
                time = 0;
            }
        }
        System.out.println(hours+":"+ minuts +":"+ sec);

        read.close();
        
    }
}
