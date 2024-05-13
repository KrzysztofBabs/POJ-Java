import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Metoda();

    }

    public static void Metoda(){

        try{
            File plik = new File("plik.txt");
            Scanner scanner = new Scanner(plik);
        }catch (FileNotFoundException e){
            System.out.println("Podaj dobry plik!");
            System.out.println(e.getMessage());
            System.out.println(e.fillInStackTrace());
        }
    }
}