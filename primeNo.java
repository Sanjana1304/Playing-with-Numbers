//check whether the given number is prime or not
import java.util.Scanner;
public class primeNo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the num : ");
        int num=scn.nextInt();
        int count=0;
        for(int i=2;i<(num/2);i++){
            if(num%i==0){
                count+=1;
            }
        }
        if(count==0)
            System.out.println("It is a prime number");
        else
            System.out.println("It is not a prime number");
        scn.close();
    }
}
