import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the limit : ");
        int lim=scn.nextInt();
        int x=0;
        int y=1;
        System.out.print(x+" "+y+" ");
        for(int i=0;i<lim-2;i++){
            int z=x+y;
            System.out.print(z+" ");
            x=y;
            y=z;
        }
        scn.close();

    }
}
