// Q1: Print numbers from 1 to N

import java.util.Scanner;

class Main{
    public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}
