public class Flooring extends Material {

    private final double limit = 0.02;
    private double widthOfFlooring;

    public Flooring(String name, double price, double width) {
        super(name, price);

        if (width <= 0) throw new IllegalArgumentException("Width to set has to be positive!");

        this.widthOfFlooring = width;
    }

    public double getWidth() {

        return this.widthOfFlooring;
    }

    @Override
    public int getMaterialReq(Surface s) {

        double notRounded = s.getArea() / widthOfFlooring;
        int rounded = (int) Math.round(notRounded);
        double diff = notRounded - rounded;

        System.out.println(notRounded);
        System.out.println(rounded);
        System.out.println(diff);

        if (diff >= 0.019999999999999574) {

            rounded++;
            return rounded;

        } else {

            return rounded;
        }
    }


}
