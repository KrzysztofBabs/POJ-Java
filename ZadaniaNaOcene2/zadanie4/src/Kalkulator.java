public class Kalkulator {
    double cena;
    Czas czas;
    Ulga ulga;

    double x=0;

    public void obliczCene(Ulga ulga, Czas czas){

//        if(ulga == Ulga.normalny) x=1;
//
//        if(ulga == Ulga.ulgowy) x=0.5;



        if(czas == Czas.jednorazowy && ulga==Ulga.ulgowy)  {cena = 4.80;
        System.out.println(cena*0.5);}
        if(czas == Czas.jednorazowy && ulga==Ulga.normalny) { cena = 4.80;
        System.out.println(cena);}


        if(czas == Czas.godzinny && ulga==Ulga.ulgowy)  {cena = 4.80;
        System.out.println(cena*1.5*0.5);}
        if(czas == Czas.godzinny && ulga==Ulga.normalny) { cena = 4.80;
        System.out.println((cena*1.5));}


        if(czas == Czas.dobowy && ulga==Ulga.ulgowy) {cena=4.80;
        System.out.println(cena*4.5*0.5);}
        if(czas == Czas.dobowy && ulga==Ulga.normalny) {cena=4.80;
        System.out.println(cena*4.5);}







    }


}
