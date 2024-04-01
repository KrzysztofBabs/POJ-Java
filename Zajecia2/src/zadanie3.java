import java.util.Scanner;

public class zadanie3 {

    public static String AMczyPM(boolean a){
        return a ? "PM" : "AM";
    }
    public static void Zrobzadanie3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj godzinę w formacie HH:mm ");
        String text = scanner.nextLine();
        String[] czesci = text.split(":");
        String Godzina = czesci[0];
        String Minuta = czesci[1];
        int godzina = Integer.parseInt(Godzina);
        int minuta = Integer.parseInt(Minuta);

         boolean a=false;
            if(godzina>=12){
                a=true;
                godzina = godzina - 12;
            }
            System.out.println(godzina + ":" + minuta + " "  + AMczyPM(a));
    }

}
