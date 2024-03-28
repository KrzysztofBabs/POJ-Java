
import java.util.Scanner;
    public class zadanie1 {
        public static void ZrobZadanie1() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("podaj pierwsza liczbe: ");
            double x = scanner.nextDouble();
            System.out.println("podaj druga liczbe: ");
            double y = scanner.nextDouble();
            double wynik;
            if(y!=0){
                wynik=x/y;
                System.out.println("wynik to: " + wynik);
            }
            else{
                while(y==0){
                    System.out.println("nie mozna dzielic przez 0, podaj liczbe jeszcze raz");
                    y = scanner.nextDouble();
                    wynik=x/y;
                    System.out.println("wynik to: " + wynik);
                }
            }

        }
    }


