
import java.util.Scanner;


public class PatikaDevMukkemmelSayi {
    public static void main(String[] args){
        
        Scanner scan=new Scanner(System.in);
        System.out.print("Please enter the number :");
        int number=scan.nextInt();
        int total=0;
        for(int i=1;i<number;i++) {
            if (number % i == 0) {
                total = total + i;
            }
        }
                if(total==number){

                    System.out.println(number+" Sayisi Mükemmeldir.");
                }
                else System.out.println(number+" Sayisi mükemmel Değildir.");
            }
}
