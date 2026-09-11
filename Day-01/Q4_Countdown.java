// Q4: Print numbers from N down to 1 using while loop

import java.util.Scanner;

class Main{
    public static void main (String[] args) {
       Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
       
       int i=n;
       while(i>=1)
       {
           System.out.println(i);
           i--;
       }
    }
}
