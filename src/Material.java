public abstract class Material {

    private String name;
    private double price;

    public Material(String name, double price) {

        if (name == null) throw new NullPointerException("Name to set cant be NULL!");
        if (name.isEmpty()) throw new IllegalArgumentException("Name to set cant be empty!");
        if (price <= 0) throw new IllegalArgumentException("Price to set has to be positive!");

        this.name = name;
        this.price = price;
    }

    public String getName() {

        return this.name;
    }

    public double getPricePerUnit() {

        return this.price;
    }

    public abstract int getMaterialReq(Surface s);


    public double getPriceOfASurface(Surface s) {

        if (s == null) throw new NullPointerException("Surface to get the price from cant be NULL!");

        return getMaterialReq(s) * getPricePerUnit();
    }

}
