package mediator;

import mx.iteso.mediator.aircrafts.impl.Airplane;
import mx.iteso.mediator.aircrafts.impl.Jet;
import mx.iteso.mediator.commandCenter.Mediator;
import mx.iteso.mediator.commandCenter.impl.ControlTower;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fernando on 13/11/16.
 */
public class JetTest {
    private Mediator tower;
    private Jet jet;

    @Before
    public void setup() {
        tower = new ControlTower();
        jet = new Jet(tower, "Jet1");
    }

    @Test
    public void testAirplane() {
        assertEquals("Jet1",jet.getName());
    }

    @Test
    public void testReceiveMessage() {
        assertEquals("Airplane receive: Im leaving!",jet.receiveMessage("Im leaving!"));
    }
}
