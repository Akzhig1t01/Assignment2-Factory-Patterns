package org.example.app;

import org.example.gui.Button;
import org.example.gui.Checkbox;
import org.example.gui.GUIFactory;
import org.example.transport.Logistics;

public class DeliveryApplication {
    private final Button button;
    private final Checkbox checkbox;
    private final Logistics logistics;

    public DeliveryApplication(GUIFactory guiFactory, Logistics logistics) {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
        this.logistics = logistics;
    }

    public void renderUI() {
        button.paint();
        checkbox.paint();
    }

    public void processDelivery(String cargo, String destination) {
        logistics.planDelivery(cargo, destination);
    }
}