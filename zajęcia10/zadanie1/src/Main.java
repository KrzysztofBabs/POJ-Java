import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        try {
            int a=0;
            Scanner scanner = new Scanner(new File("Input"));
            while(scanner.hasNextLine()){
                String linia = scanner.nextLine();
                if(a%2==0) {
                    linia = scanner.nextLine();
                    System.out.println(linia);
                }
                a++;


            }



        } catch(FileNotFoundException e){
            System.out.println(e.getMessage());



        }



    }
}