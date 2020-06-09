public abstract class Toys {
    private String colour;
    private double price;
    public String getNameModel() {
        return nameModel;
    }

    public String getColour() {
        return colour;
    }

    public double getPrice() {
        return price;
    }


    public double getAge() {
        return age;
    }


    private double age;
    private String nameModel;

    public Toys(String colour, String nameModel, double price, double age) {
        this.nameModel = nameModel;
        this.colour = colour;
        this.age = age;
        this.price = price;

    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Toys) {
            return  nameModel.equals(((Toys) obj).nameModel)&&
                    colour.equals(((Toys) obj).colour) &&
                    age == ((Toys) obj).age &&
                    price == ((Toys) obj).price;
        }
        return false;
    }

    @Override
    public String toString() {
        return  "\nName of Car: " + nameModel
                +"\nColour: " + colour
                + "\nMinimum age: " + age
                +"\nPrice: " + price
                ;
    }
}
