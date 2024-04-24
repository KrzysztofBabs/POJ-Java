public class Cat extends Animal{

    public Cat(String name, String color) {
        super(name, color);
    }

    public void makeSound(){
        System.out.println("miauuu" + " " + this.name + " " + this.color);
    }
}
