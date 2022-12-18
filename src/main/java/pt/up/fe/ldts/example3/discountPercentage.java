package pt.up.fe.ldts.example3;

public class discountPercentage extends Discount {
    public discountPercentage(double discount) {

        super(discount);
    }

    @Override
    public double applyDiscount(double price) {

        return price - price * getDiscount();
    }
}