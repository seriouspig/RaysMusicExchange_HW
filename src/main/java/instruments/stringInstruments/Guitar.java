package instruments.stringInstruments;

import behaviours.IPlay;
import instruments.Instrument;
import instruments.InstrumentType;

public class Guitar extends Instrument implements IPlay {

    private GuitarType guitarType;
    private InstrumentType type;

    public Guitar(String material, String colour, GuitarType guitarType, double buyPrice, double sellPrice) {
        super(material, colour, buyPrice, sellPrice);
        this.guitarType = guitarType;
        this.type = InstrumentType.STRING;
    }

    public String play() {
        return "Plonk plonk";
    }

}
