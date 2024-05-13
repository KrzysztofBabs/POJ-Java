import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Podaj liczbe: ");
        a = Metoda();
        System.out.println("Podaj dzielnik: ");
        b = Metoda();
        boolean v = true;
        while(v){
            try{
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("Nie mozna dzielic przez zero!");
                b = Metoda();
                if(b!=0) v = false;

            }
        }
        System.out.println("wynik dzielenia to: " + (double)a/b);
    }

    public static int Metoda() {
        Scanner scanner = new Scanner(System.in);
        int x;
        try {
            x = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Podaj cyfre, a nie znak(i)!");
            x = Metoda();
        }
        return  x;

    }
}


