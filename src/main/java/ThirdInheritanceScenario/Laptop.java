package ThirdInheritanceScenario;

public class Laptop extends Computer {
    public boolean lidSelfClose;

    public static void main(String[] args) {
        Laptop Dell = new Laptop();
        // Electronic class attribute values assignments
        Dell.hasCircuitBoard = true;
        Dell.personalDevice = true;
        Dell.hasBattery = true;
        // Computer class attribute values assignments
        Dell.screenType = "LED";
        Dell.keyboardColor = "blue";
        Dell.numberOfUSBPorts = 4;
        // Laptop class attribute value assignment
        Dell.lidSelfClose = true;
    }
}
