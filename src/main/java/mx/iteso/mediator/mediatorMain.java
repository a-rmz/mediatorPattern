package mx.iteso.mediator;

import mx.iteso.mediator.aircrafts.Aircraft;
import mx.iteso.mediator.aircrafts.impl.Airplane;
import mx.iteso.mediator.commandCenter.Mediator;
import mx.iteso.mediator.commandCenter.impl.ControlTower;

/**
 * Created by a-rmz on 11/3/16.
 */
public class mediatorMain {

    public static void main(String[] args) {
        Mediator tower = new ControlTower();

        Aircraft boeing = new Airplane(tower, "Boeing 747");
        Aircraft airbus = new Airplane(tower, "Airbus A380");
        Aircraft airforce = new Airplane(tower, "AirForce 1");

        tower.registerAircraft(boeing);
        tower.registerAircraft(airbus);
        tower.registerAircraft(airforce);

        sendMessage("I'm leaving. Don't arrive yet.");
    }

}