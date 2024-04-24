//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Wyscigowe auto1 = new Wyscigowe("czarny", "Mercedes", 300);
        Miejskie auto2 = new Miejskie("szara", "Toyota",7);
        Sportowe auto3 = new Sportowe("czerwone", "Porsche",3);

        auto1.getInfo();
        auto2.getInfo();
        auto3.getInfo();

        Car[] auta = {auto1, auto2, auto3};
        for(Car car:auta){
            System.out.println(car.getKolor() + " " + car.getMarka());
//
        }




    }
}