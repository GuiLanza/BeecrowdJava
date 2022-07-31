import java.io.IOException;
import java. util.Scanner;

// exercicio 1013
public class Main14 {
    
    public static void main(String[] args) throws IOException{

        int a,b,c;
        
        Scanner read = new Scanner(System.in);

        a = read.nextInt();
        b = read.nextInt();
        c = read.nextInt();

        if(a > b && a > c){
        
            System.out.println(a +" e o maior");
            
        }else if(b > a && b > c){

            System.out.println(b +" e o maior");

        }else{
            System.out.println(c +" e o maior");
        }

        read.close();
    }
}
