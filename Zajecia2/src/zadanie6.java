import java.util.Scanner;

public class zadanie6 {
    public static int fib(int n){
        if(n<=1) return n;
        int a=0;
        int b=1;
        int x;
        for(int i=0;i<=n-2;i++){
           x=a+b;
           a=b;
           b=x;
        }
        return b;

    }
    public static void CiagFibonaciego2(){
        Scanner scanner = new Scanner(System.in);
        int N;
        N = scanner.nextInt();
        int fibN = fib(N);
        System.out.println(fibN);
    }

    public static void CiagFibonaciego1(){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Podaj liczbe n: ");
        n = scanner.nextInt();
        int a=0;
        int b=1;
        int x;
        System.out.println(0);
        for(int i=0;i<n-1;i++){
            x=a;
            a=a+b;
            b=x;
            System.out.println(a);
        }


    }
}
