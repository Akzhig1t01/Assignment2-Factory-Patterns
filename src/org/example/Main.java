package org.example;

import org.example.app.DeliveryApplication;
import org.example.gui.GUIFactory;
import org.example.gui.MacOSFactory;
import org.example.gui.WindowsFactory;
import org.example.transport.Logistics;
import org.example.transport.RoadLogistics;
import org.example.transport.SeaLogistics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String modeInput = "";
        String platformInput = "";

        if (args.length >= 2) {
            modeInput = args[0];
            platformInput = args[1];
        } else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter delivery mode (ROAD/SEA): ");
            if (scanner.hasNextLine()) modeInput = scanner.nextLine().trim();
            System.out.print("Enter UI platform (WINDOWS/MACOS): ");
            if (scanner.hasNextLine()) platformInput = scanner.nextLine().trim();
        }

        Logistics logistics = null;
        if ("ROAD".equalsIgnoreCase(modeInput)) {
            logistics = new RoadLogistics();
        } else if ("SEA".equalsIgnoreCase(modeInput)) {
            logistics = new SeaLogistics();
        } else {
            System.err.println("Error: Unsupported or missing delivery mode: '" + modeInput + "'. Expected ROAD or SEA.");
            return;
        }

        GUIFactory guiFactory = null;
        if ("WINDOWS".equalsIgnoreCase(platformInput)) {
            guiFactory = new WindowsFactory();
        } else if ("MACOS".equalsIgnoreCase(platformInput)) {
            guiFactory = new MacOSFactory();
        } else {
            System.err.println("Error: Unsupported or missing UI platform: '" + platformInput + "'. Expected WINDOWS or MACOS.");
            return;
        }

        DeliveryApplication app = new DeliveryApplication(guiFactory, logistics);
        app.renderUI();
        app.processDelivery("laboratory equipment", "Aktau warehouse");
    }
}