package instruments.stringInstruments;

import behaviours.IPlay;
import instruments.InstrumentType;
import instruments.Instrument;

public class Piano extends Instrument implements IPlay {

    private int numberOfStrings;
    private PianoType pianoType;
    private InstrumentType type;

    public Piano(String material, String colour, PianoType pianoType, double buyPrice, double sellPrice) {
        super(material, colour, buyPrice, sellPrice);
        this.numberOfStrings = 230;
        this.pianoType = pianoType;
        this.type = InstrumentType.STRING;
    }

    public String play() {
        return "Pim pim";
    }
}

