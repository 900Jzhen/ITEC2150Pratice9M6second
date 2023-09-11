package HomeWork;

public class Cake extends Pastry{

    private String size;
    private String flavor;
    private int layer;

    public Cake(String name, double price, String description, String size, String flavor, int layer) {
        super(name, price, description);
        this.size = size;
        this.flavor = flavor;
        this.layer = layer;
    }

    public String getSize() {
        return size;
    }

    public String getFlavor() {
        return flavor;
    }

    public int getLayer() {
        return layer;
    }
}
