import java.util.Scanner;

public class ATM_Program {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("OPTIONS : ");
        System.out.println("1. withdraw the money");
        System.out.println("2. deposit the money");
        System.out.println("3. check the balance");
        System.out.println("4. exit.\n");
        System.out.print("Choose any 1 option : ");
        int opt=scn.nextInt();
        int balance=10000;

        switch(opt){
            case 1:
            System.out.print("Enter the amt u wanna withdraw : ");
            int with=scn.nextInt();
            balance=balance-with;
            System.out.println("Thank you. Now your balance is : "+balance);
            break;

            case 2:
            System.out.print("Enter the amt u wanna deposit : ");
            int dep=scn.nextInt();
            balance=balance+dep;
            System.out.println("Thank you. Now your balance is : "+balance);
            break;

            case 3:
            System.out.println("Your balance is : "+balance);
            break;

            case 4:
            System.out.println("Thank you. You r in the home page now");
            break;
        }
        scn.close();
    }
}
