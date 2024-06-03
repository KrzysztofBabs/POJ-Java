import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
            File plik = new File("basedir");
            File[] katalogi = plik.listFiles();
            System.out.println(Arrays.toString(katalogi));
            int a=0;
            for(int i=0;i<katalogi.length;i++){
                File nowy = katalogi[i];
                File[] katalogi1 = nowy.listFiles();
                if(katalogi1!=null && katalogi1.length > a)
                    a = katalogi1.length;
            }
        System.out.println(a);


    }
}