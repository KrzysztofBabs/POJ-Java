import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static List<String> metoda(List<String> lista) {
        Scanner scanner = new Scanner(System.in);

//        for (int i = 0; i < 6; i++) {
//            String wyraz;
//            wyraz = scanner.next();
//            if (wyraz.length() % 2 == 0) {
//                Lista.add(wyraz);
//            }
//
//        }
        List<String> nowaLista = new ArrayList<>();
            for (String wyraz : lista) {
                if(wyraz.length() % 2 == 0) {
                    nowaLista.add(wyraz);
                }
            }

        return nowaLista;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> Lista = new ArrayList<>();
        Lista.add("pies");
        Lista.add("kot");
        Lista.add("plik");
        Lista.add("lista");
        Lista.add("liga");
        Lista.add("Polska");
        System.out.println(metoda(Lista));












    }
}