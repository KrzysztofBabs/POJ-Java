import java.util.Arrays;

public class Bakery extends Shop{

    private String[] products;
    public Bakery(String adress, int size, String[] Products) {
        super(adress, size);
        this.products=Products;
    }

    public void getInformation(){
        System.out.println(this.adress + " " + this.size + " " + Arrays.toString(this.products));
    }
}
