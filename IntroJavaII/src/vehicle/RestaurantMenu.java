package vehicle;

public enum RestaurantMenu {
    APPETIZER("Steamed Prawn", "caffe latte"),
    DESSERT("Cupcakes", "Milk and Chocolate Ice cream");


    private final String firstItem;
    private final String secondItem;

    RestaurantMenu(String firstItem, String secondItem) {
        this.firstItem = firstItem;
        this.secondItem = secondItem;
    }

    public String getFirstItem() {
        return firstItem;
    }

    public String getSecondItem() {
        return secondItem;
    }
}
