package mx.iteso.mediator.aircrafts;

import mx.iteso.mediator.aircrafts.impl.Helicopter;
import mx.iteso.mediator.commandCenter.Mediator;
import mx.iteso.mediator.commandCenter.impl.ControlTower;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by fernando on 13/11/16.
 */
public class HelicopterTest {
    private Mediator tower;
    private Helicopter helicopter;

    @Before
    public void setup() {
        tower = mock(Mediator.class);
        helicopter = new Helicopter(tower, "Helicopter1");
    }

    @Test
    public void testAirplane() {
        assertEquals("Helicopter1", helicopter.getName());
    }

    @Test
    public void testSendMessage() {
        String MESSAGE = "Message";
        helicopter.sendMessage(MESSAGE);

        verify(tower, times(1)).distributeMessage(MESSAGE, helicopter);
    }
}
