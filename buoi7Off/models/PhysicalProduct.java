package buoi7Off.models;

public class PhysicalProduct extends Product {
    @Override
    public double totalPrice() {
        return getPrice() + getQuantity();
    }

    @Override
    public String toString() {
        return super.toString() + "total price: " + totalPrice();
    }
}
