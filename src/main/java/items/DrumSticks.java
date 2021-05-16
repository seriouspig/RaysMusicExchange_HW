package items;

import behaviours.Isell;

public class DrumSticks extends Item {

    private String material;

    public DrumSticks(String material, Double buyPrice, Double sellPrice) {
        super(buyPrice, sellPrice);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
