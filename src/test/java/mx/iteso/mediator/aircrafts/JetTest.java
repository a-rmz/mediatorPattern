package mx.iteso.mediator.aircrafts;

import mx.iteso.mediator.aircrafts.impl.Jet;
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
public class JetTest {
    private Mediator tower;
    private Jet jet;

    @Before
    public void setup() {
        tower = mock(Mediator.class);
        jet = new Jet(tower, "Jet1");
    }

    @Test
    public void testAirplane() {
        assertEquals("Jet1",jet.getName());
    }

    @Test
    public void testSendMessage() {
        String MESSAGE = "Message";
        jet.sendMessage(MESSAGE);

        verify(tower, times(1)).distributeMessage(MESSAGE, jet);
    }
}
