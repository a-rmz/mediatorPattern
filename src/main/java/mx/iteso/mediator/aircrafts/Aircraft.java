package mx.iteso.mediator.aircrafts;

import mx.iteso.mediator.commandCenter.Mediator;

/**
 * Created by a-rmz on 11/10/16.
 */

// Colleague interface
public abstract class Aircraft {

    protected Mediator controlTower;
    protected String name;

    public Aircraft(Mediator controlTower) {
        this.controlTower = controlTower;
    }

    public void sendMessage(String message) {
        controlTower.distributeMessage(message, this);
    };

    public String getName() {
        return this.name;
    }

    public abstract String receiveMessage(String message);

}
