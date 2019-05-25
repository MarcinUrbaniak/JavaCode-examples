package order;

public enum TicketType {
    NORMALNY (1),
    ULGOWY (0.6);

    private final double discount;

    TicketType(double discount) {
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }
}
