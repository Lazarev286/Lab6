public class Doll extends Toys{
    private double price;
    private String nameModel;

    public Doll(String colour, String nameModel, double price, double age) {
        super(colour, nameModel, price, age);
        this.price = price;
        this.nameModel = nameModel;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Doll) {
            return super.equals(obj) && this.price == ((Doll) obj).price;
        }
        return false;
    }
}
