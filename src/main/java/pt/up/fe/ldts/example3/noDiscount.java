package pt.up.fe.ldts.example3;

public class noDiscount extends Discount {

    public noDiscount() {

        super(0);
    }

    @Override
    public double applyDiscount(double price) {

        return price;
    }
}
