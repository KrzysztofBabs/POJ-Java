//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Punkt punkt1 = new Punkt(3,4);

        Punkt punktCzy = new Punkt(2,1);
        Okrag okrag1 = new Okrag(punkt1,7);

        System.out.println(okrag1.CzyJest(punktCzy));






    }
}