package mediator;

import mx.iteso.mediator.aircrafts.impl.Airplane;
import mx.iteso.mediator.aircrafts.impl.Helicopter;
import mx.iteso.mediator.commandCenter.Mediator;
import mx.iteso.mediator.commandCenter.impl.ControlTower;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by fernando on 13/11/16.
 */
public class HelicopterTest {
    private Mediator tower;
    private Helicopter helicopter;

    @Before
    public void setup() {
        tower = new ControlTower();
        helicopter = new Helicopter(tower,"Helicopter1");
    }

    @Test
    public void testAirplane() {
        assertEquals("Helicopter1",helicopter.getName());
    }

    @Test
    public void testReceiveMessage() {
        assertEquals("Airplane receive: Im leaving!",helicopter.receiveMessage("Im leaving!"));
    }
}
