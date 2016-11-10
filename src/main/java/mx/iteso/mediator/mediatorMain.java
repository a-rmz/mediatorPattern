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

        Aircraft airplane = new Airplane(tower, "Plane 257");
        Aircraft helicopter = new Airplane(tower, "Helicopter A380");
        Aircraft jet = new Airplane(tower, "Jet F1");

        tower.registerAircraft(airplane);
        tower.registerAircraft(helicopter);
        tower.registerAircraft(jet);

        airplane.sendMessage("I'm leaving. Don't arrive yet.");
    }

}