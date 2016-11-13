package mx.iteso.mediator;

import mx.iteso.mediator.aircrafts.Aircraft;
import mx.iteso.mediator.commandCenter.impl.ControlTower;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

/**
 * Created by fernando on 13/11/16.
 */
public class ControlTowerTest {
    private ControlTower tower;
    private Aircraft plane;
    private Aircraft jet;

    @Before
    public void setup() {
        tower = new ControlTower();

        plane = mock(Aircraft.class);
        jet = mock(Aircraft.class);

        when(plane.receiveMessage(anyString())).then(returnsFirstArg());
        when(jet.receiveMessage(anyString())).then(returnsFirstArg());

        tower.registerAircraft(plane);
        tower.registerAircraft(jet);
    }

    @Test
    public void testDistributeMessage() {
        String MESSAGE = "Im Leaving!";

        tower.distributeMessage(MESSAGE, plane);
        verify(jet, times(1)).receiveMessage(MESSAGE);
    }

    @Test
    public void testDistributeMessage1() {
        String MESSAGE = "Im Leaving!";

        tower.distributeMessage(MESSAGE, plane);
        verify(plane, times(0)).receiveMessage(MESSAGE);
    }

}
