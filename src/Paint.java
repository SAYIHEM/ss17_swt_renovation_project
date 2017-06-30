public class Paint extends Material {

    private final double limit = 0.02;
    private int noOfCoats;
    private double noOfSqMPerLiter;

    public Paint(String name, double price, int noOfCoats, double noOfSqMPerLiter) {
        super(name, price);

        if (noOfCoats <= 0) throw new IllegalArgumentException("Number of Coats has to be positive!");
        if (noOfSqMPerLiter <= 0) throw new IllegalArgumentException("Number of SqM per Liter has to be positive!");

        this.noOfCoats = noOfCoats;
        this.noOfSqMPerLiter = noOfSqMPerLiter;
    }

    public int getNoOfCoats() {

        return noOfCoats;
    }

    public double getNoOfSqMPerLiter() {

        return noOfSqMPerLiter;
    }

    public int getMaterialReq(Surface s) {

        double notRounded = (((((s.getArea() * noOfCoats) / noOfSqMPerLiter))) * 2);
        int rounded = (int) Math.round(notRounded);
        double diff = notRounded - rounded;

        if (diff > 0.020000000000000018) {

            rounded++;
            return rounded;

        } else {

            return rounded;
        }
    }
}
