import java.util.Scanner;

public class Main {

    public static int NWD(int a, int b){
        while(b!=0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        System.out.println("Podaj dwie liczby: ");
        x = scanner.nextInt();
        y = scanner.nextInt();
        System.out.println(NWD(x,y));
    }
}