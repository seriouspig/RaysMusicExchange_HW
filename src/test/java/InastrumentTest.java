import instruments.stringInstruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InastrumentTest {

    Violin violin1;
    Piano piano1;
    Guitar guitar1;

    @Before
    public void before() {

        violin1 = new Violin("Wood", "Brown" , 30.5, 45.2);
        piano1 = new Piano("Wood", "Black", PianoType.BABYGRAND, 250.5, 300.2);
        guitar1 = new Guitar("Plastic", "Red", GuitarType.BASS, 70.0, 80.5);
    }

    @Test
    public void instrumentsCanPlay() {
        assertEquals("Weee weee", violin1.play());
        assertEquals("Plonk plonk", guitar1.play());
        assertEquals("Pim pim", piano1.play());
    }

    @Test
    public void canCalculateMarkup() {
        assertEquals(48.2,violin1.calculateMarkup(),0.1);
        assertEquals(19.84,piano1.calculateMarkup(),0.1);
        assertEquals(15,guitar1.calculateMarkup(),0.1);
    }

}
