package mx.iteso.mediator.commandCenter.impl;

import mx.iteso.mediator.aircrafts.Aircraft;
import mx.iteso.mediator.commandCenter.Mediator;

import java.util.ArrayList;

/**
 * Created by a-rmz on 11/10/16.
 */
public class ControlTower implements Mediator {

    public ArrayList<Aircraft> aircraftList = new ArrayList<Aircraft>();

    public void distributeMessage(String message, Aircraft sender) {
        for(Aircraft aircraft : aircraftList) {
            if(aircraft != sender) {
                aircraft.receiveMessage(message);
            }
        }
    }

    public void registerAircraft(Aircraft aircraft) {
        aircraftList.add(aircraft);
    }

}
