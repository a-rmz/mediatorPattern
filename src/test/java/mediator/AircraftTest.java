package mediator;

import mx.iteso.mediator.aircrafts.impl.Airplane;
import mx.iteso.mediator.aircrafts.impl.Helicopter;
import mx.iteso.mediator.aircrafts.impl.Jet;
import mx.iteso.mediator.commandCenter.Mediator;
import mx.iteso.mediator.commandCenter.impl.ControlTower;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by fernando on 13/11/16.
 */
public class AircraftTest {
    private Mediator tower;
    private Airplane plane;
    private Jet jet;
    private Helicopter helicopter;

    @Before
    public void setup () {
        tower = new ControlTower();
        plane = new Airplane(tower,"Plane1");
        jet = new Jet(tower,"Jet1");
        helicopter = new Helicopter(tower,"Helicopter1");
    }

    @Test
    public void TestsendMessage() {

    }

    @Test
    public void TestgetName() {

    }


}
