import java.util.Scanner;

public class reverseNo {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=scn.nextInt();

        String new_num=String.valueOf(num); //converting to string so that we can find the no of digits
        int n=new_num.length();

        String rev="";
        for(int i=0;i<n;i++){
            int rem=num%10;
            num=num/10;
            
            String new_rem=String.valueOf(rem); //so that I can concatenate
            rev=rev+new_rem;
        }
        System.out.println("Reverse is : "+rev);
        scn.close();
    }
}
