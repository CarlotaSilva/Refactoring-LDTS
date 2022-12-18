package pt.up.fe.ldts.example3;

public abstract class Discount {
    private final double discount;

    public Discount(double discount) {
        this.discount = discount;
    }

    public getDiscount(double discount) {
        return discount;
    }

    public double applyDiscount(double price) ;
}
