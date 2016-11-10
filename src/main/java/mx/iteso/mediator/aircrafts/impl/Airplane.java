package mx.iteso.mediator.aircrafts.impl;

import mx.iteso.mediator.commandCenter.Mediator;
import mx.iteso.mediator.aircrafts.Aircraft;

/**
 * Created by a-rmz on 11/10/16.
 */
public class Airplane extends Aircraft {

    public Airplane(Mediator controlTower, String name) {
        super(controlTower);
        this.name = name;
    }

    public void receiveMessage(String message) {
        System.out.println(this.getName() + " received: " + message);
    }

}
