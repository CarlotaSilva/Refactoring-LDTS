package pt.up.fe.ldts.example3;

public class fixedDiscount extends Discount {

    public fixedDiscount(double fixed) {

        super(fixed);
    }

    @Override
    public double applyDiscount(double price) {

        return price - getDiscount();
    }
}
