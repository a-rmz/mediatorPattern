package mediator;

import mx.iteso.mediator.aircrafts.impl.Airplane;
import mx.iteso.mediator.aircrafts.impl.Jet;
import mx.iteso.mediator.commandCenter.Mediator;
import mx.iteso.mediator.commandCenter.impl.ControlTower;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

/**
 * Created by fernando on 13/11/16.
 */
public class ControlTowerTest {
    private ControlTower tower;
    private Airplane plane;
    private Jet jet;

    @Before
    public void setup() {
        tower = new ControlTower();
        plane = new Airplane(tower,"Plane");
        jet = new Jet(tower,"Jet");
    }

    @Test
    public void testDistributeMessage() {
        tower.distributeMessage("Im Leaving!",plane);

    }

    @Test
    public void testRegisterAircraft() {
        tower.registerAircraft(plane);

    }


}
