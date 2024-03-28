import java.util.Arrays;
import java.util.Scanner;

public class zadanie5 {

    public static void ZrobZadanie5() {
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[5];

        for(int i=0;i<5;i++) {
            tablica[i] = scanner.nextInt();
            tablica[i] *= 3;
        }

        System.out.println(Arrays.toString(tablica));
    }
}
