package mediator;

import mx.iteso.mediator.aircrafts.impl.Airplane;
import mx.iteso.mediator.commandCenter.Mediator;
import mx.iteso.mediator.commandCenter.impl.ControlTower;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

/**
 * Created by fernando on 13/11/16.
 */
public class AirplaneTest {
    private Mediator tower;
    private Airplane airplane;

    @Before
    public void setup() {
        tower = new ControlTower();
        airplane = new Airplane(tower, "Airplane1");
    }

    @Test
    public void testAirplane() {
        assertEquals("Airplane1",airplane.getName());
    }

    @Test
    public void testReceiveMessage() {
        assertEquals("Airplane receive: Im leaving!",airplane.receiveMessage("Im leaving!"));
    }
}
