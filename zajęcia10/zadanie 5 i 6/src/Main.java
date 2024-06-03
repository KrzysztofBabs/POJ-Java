import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat(5);
        Prostokat prostokat = new Prostokat(3,4);
        TrojkatProstokatny TP = new TrojkatProstokatny(5,6,7);

//        Figura[] figury = new Figura[3];
//        figury[0] = kwadrat;
//        figury[1] = prostokat;
//        figury[2] = TP;
//        System.out.println("ich obwody to: ");
//        for(Figura figurki : figury){
//            System.out.println( figurki.toString());
//
//        }
//        System.out.println();
//        System.out.println("ich pola to: ");
//
//        for(Figura figurki : figury) {
//            System.out.println(figurki.obliczPole());
//        }


        Figura[] tablica = {kwadrat,prostokat,TP};
        Arrays.sort(tablica);
        System.out.println("posortowane obwody: ");
        for(int i=0;i<3;i++){
            System.out.println(tablica[i].toString());
        }
        System.out.println();
        System.out.println("posortowane pola: ");
        for(int i=0;i<3;i++){
            System.out.println(tablica[i].obliczPole());
        }

    }
}





