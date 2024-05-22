//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Dog pies = new Dog();
        Cat kot = new Cat();
        Lion lew = new Lion();
        lew.biegnij();
        System.out.println();



        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Lion();

        for(Animal zwierzak : animals){
            zwierzak.makeSound();
        }



    }
}