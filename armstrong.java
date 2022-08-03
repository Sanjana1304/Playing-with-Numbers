//Eg : 153: 1^3 + 5^3 + 3^3 = 1 + 125+ 27 = 153
import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=scn.nextInt();
        
        int num_preserved=num; //finally to check if they r equal as variable num will be modified inside the loop
        
        String new_num=String.valueOf(num); //coverted to string just to get the no of digits
        int n = new_num.length();

        double sum=0;
        for(int i=0;i<n;i++){
            double rem=num%10;
            num=num/10;
            sum=sum+Math.pow(rem, n);
        }
        System.out.println("The sum is : "+sum);
        if(num_preserved==sum)
            System.out.println("It is an armstrong number");
        else
            System.out.println("It is not an armstrong number");
        scn.close();
    }
}
