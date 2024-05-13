import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe1: ");
        int x = PodajLiczbe();
        System.out.println("Podaj liczbe2: ");
        int y = PodajLiczbe();
        System.out.println("Podaj znak dzialania: ");
        Dzialanie(x,y);
    }
    public static int PodajLiczbe(){
        Scanner scanner = new Scanner(System.in);
        int a;
        try{
            a = scanner.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Podaj cyfre, a nie znak!");
            a = PodajLiczbe();
        }
        return a;
    }

    public static void Dzialanie(int a, int b){
        Scanner scanner = new Scanner(System.in);
        String znak;
        znak = scanner.next();
        switch(znak){
            case "+":
                System.out.println((a+b));
                break;
            case "-":
                System.out.println((a-b));
                break;
            case "*":
                System.out.println((a*b));
                break;
            case "/":
                boolean v = true;
                while(v) {
                    if(b == 0) {
                        System.out.println("Nie mozna dzielic przez 0, podaj inna liczbe!");
                        b = PodajLiczbe();
                        if(b!=0) v=false;
                    }
                }
                System.out.println((double)a/b);
                break;
            default:
                System.out.println("Podaj odpowiedni znak!");
                Dzialanie(a,b);

        }

    }
}