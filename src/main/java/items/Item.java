package items;

import behaviours.Isell;

public abstract class Item implements Isell {

    private Double buyPrice;
    private Double sellPrice;

    public Item(Double buyPrice, Double sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup() {
        double markup = (((this.sellPrice - this.buyPrice) / this.buyPrice) * 100);
        return markup;
    }
}
