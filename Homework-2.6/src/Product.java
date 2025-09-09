public class Product {

    private int id;
    private  String name;
    private double priceUSD;

    public Product(int id,String name, double priceUSD){
        this.id = id;
        this.name = name;
        this.priceUSD =priceUSD;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPriceUsd() {
        return priceUSD;
    }

    @Override
    public String toString() {
        return "Product(id=" + id + ", name=" + name + ", priceUsd=" + priceUSD + ")";
    }


}
