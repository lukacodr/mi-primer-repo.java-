package TecnicasRefactorizacion.MagicNumbers.Good;

public class Main {

    private static final double PRECIO_MINIMO_COMPRA = 100;
    private static final double PRECIO_ENVIO = 4.99;
    private static final double ENVIO_GRATIS = 0;

    public static void main(String[] args) {
        double price = 129.99;

        double discountPrice = calculateDiscount(price);
        double shippingPrice = calculateShipping(price);
    }

    private static double calculateShipping(double price) {
        return price < PRECIO_MINIMO_COMPRA ? PRECIO_ENVIO : ENVIO_GRATIS; // hard coded
    }
    

    private static double calculateDiscount(double price){
        return price * 0.1; }
}
