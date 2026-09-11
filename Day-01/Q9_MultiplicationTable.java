import java.util.Scanner;

class Q9_MultiplicationTable {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(int i = n; i <= n * 10; i = i + n) {
            System.out.println(i);
        }
    }
}
