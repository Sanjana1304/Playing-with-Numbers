import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String word=scn.next();
        String rev="";
        for(int i=word.length()-1;i>=0;i--)
            rev=rev+word.charAt(i);
        if(rev.equals(word))
            System.out.println("It is a palindrome");
        else
            System.out.println("It is not a palindrome");
        scn.close();
    }
}
