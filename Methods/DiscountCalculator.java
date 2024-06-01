package Methods;

class DiscountCalculator {
    public static double calculateDiscount(double... pricesAndDiscounts)
    {
        if (pricesAndDiscounts.length % 2 != 0) {
            throw new IllegalArgumentException("Each price must have a corresponding discount rate.");
        }
        
        double totalDiscount = 0;
        for (int i = 0; i < pricesAndDiscounts.length; i += 2)
        {
            double price = pricesAndDiscounts[i];
            double discountRate = pricesAndDiscounts[i + 1];
            double discount = price * discountRate;
            totalDiscount += discount;
        }
        
        return totalDiscount;
    }

    public static void main(String[] args)
    {
        double totalDiscount = calculateDiscount(100, 0.1, 200, 0.2, 300, 0.15);
        System.out.println("Total discount: Rs " + totalDiscount);
    }
}
