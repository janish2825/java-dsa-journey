// Q8: Sum of odd numbers from 1 to N

import java.util.Scanner;

class Main{
    public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        
        int i=1;
        int sum=0;
        do{
            if(i%2==0)
            {
                
            }
            else{
                sum=sum+i;
            }
            i++;
        }while(i<=n);
        System.out.print(sum);
    }
}
