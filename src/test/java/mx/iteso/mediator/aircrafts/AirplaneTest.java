package mx.iteso.mediator.aircrafts;

import mx.iteso.mediator.aircrafts.impl.Airplane;
import mx.iteso.mediator.commandCenter.Mediator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

/**
 * Created by fernando on 13/11/16.
 */
public class AirplaneTest {
    private Mediator tower;
    private Airplane airplane;

    @Before
    public void setup() {
        tower = mock(Mediator.class);
        airplane = new Airplane(tower, "Airplane1");
    }


    @Test
    public void testAirplane() {
        assertEquals("Airplane1", airplane.getName());
    }


    @Test
    public void testSendMessage() {
        String MESSAGE = "Message";
        airplane.sendMessage(MESSAGE);

        verify(tower, times(1)).distributeMessage(MESSAGE, airplane);
    }
}
