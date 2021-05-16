package instruments.stringInstruments;

import behaviours.IPlay;
import instruments.Instrument;
import instruments.InstrumentType;

public class Violin extends Instrument implements IPlay {

    private int numberOfStrings;
    private PlayType playType;
    private InstrumentType type;

    public Violin(String material, String colour, double buyPrice, double sellPrice) {
        super(material, colour, buyPrice, sellPrice);
        this.numberOfStrings = 4;
        this.playType = PlayType.BOWED;
        this.type = InstrumentType.STRING;
    }

    public String play() {
        return "Weee weee";
    }
}



