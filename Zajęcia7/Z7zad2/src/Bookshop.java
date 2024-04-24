import java.util.Arrays;

public class Bookshop extends Shop{

    private String[] products;
    public Bookshop(String adress, int size, String[] Products) {
        super(adress, size);
        this.products = Products;
    }
    public void getInformation(){
        System.out.println(this.adress + " " + this.size + " " + Arrays.toString(this.products));
    }
}
