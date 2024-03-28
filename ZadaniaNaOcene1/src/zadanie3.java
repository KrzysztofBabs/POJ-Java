

import java.util.Scanner;

public class zadanie3{
    public static void compare(int x, int y) {

    }
    public static void ZrobZadanie3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwsza liczbe: ");
        int a = scanner.nextInt();
        System.out.println("podaj druga liczbe: ");
        int b = scanner.nextInt();
        if(a==b){
            System.out.println("0");
        }

        if(a>b){
            System.out.println("-1");
        }

        if(a<b){
            System.out.println("1");
        }

        compare(a, b);
    }
}

