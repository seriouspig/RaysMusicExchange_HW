package instruments;

import behaviours.Isell;

import java.text.DecimalFormat;

public abstract class Instrument implements Isell {

    private String material;
    private String colour;
    private Double buyPrice;
    private Double sellPrice;

    public Instrument(String material, String colour, Double buyPrice, Double sellPrice) {
        this.material = material;
        this.colour = colour;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }

    public double calculateMarkup() {
//        DecimalFormat df = new DecimalFormat("#.00");
        double markup = (((this.sellPrice - this.buyPrice)/this.buyPrice)*100);
//        System.out.println(markup);
//        System.out.println(df.format(markup));
        return markup;
    }
}
