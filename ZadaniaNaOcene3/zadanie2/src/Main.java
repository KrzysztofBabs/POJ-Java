//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            int[] bokiKwadratu = {2, 2, 2, 2};
            int[] bokiProstokata = {2, 3, 2, 3};
            int[] bokiProstopadloscianu = {2, 3, 4};
            int[] bokiSzescianu = {3, 3, 3};

            try {


                Figura2D kwadrat = new Figura2D(bokiKwadratu);
                Figura3D prostopadloscian = new Figura3D(bokiProstopadloscianu);

                System.out.println("Pole kwadratu to: " + kwadrat.ObliczPole());
                System.out.println("Obwod kwadratu to: " + kwadrat.ObliczObwod());
                System.out.println();

                System.out.println("Pole prostopadloscianu to: " + prostopadloscian.ObliczPole());
                System.out.println("Suma krawedzi prostopadloscianu to: " + prostopadloscian.ObliczObwod());
                System.out.println("Objetosc prostopadloscianu to: " + prostopadloscian.ObliczObjetosc());
                System.out.println();

                Kwadrat kwadrat1 = new Kwadrat(bokiKwadratu);
                System.out.println(kwadrat1.ObliczPole());
                System.out.println(kwadrat1.ObliczObwod());
                System.out.println();

                Prostokat prostokat = new Prostokat(bokiProstokata);
                System.out.println(prostokat.ObliczPole());
                System.out.println(prostokat.ObliczObwod());
                System.out.println();


                Szescian szescian = new Szescian(bokiSzescianu);
                System.out.println(szescian.ObliczPole());
                System.out.println(szescian.ObliczObwod());
                System.out.println(szescian.ObliczObjetosc());
                System.out.println();


                Prostopadloscian prostopadloscian1 = new Prostopadloscian(bokiProstopadloscianu);
                System.out.println(prostopadloscian1.ObliczPole());
                System.out.println(prostopadloscian1.ObliczObwod());
                System.out.println(prostopadloscian1.ObliczObjetosc());
            }catch (IllegalArgumentException e){
//                if(bokiKwadratu[0] == 0) System.out.println("nie moze byc 0");
                System.out.println(e.fillInStackTrace());
            }


    }

}