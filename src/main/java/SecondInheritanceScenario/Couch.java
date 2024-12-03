package SecondInheritanceScenario;

public class Couch extends Furniture {
    public int numberOfHeadRests;
    public String fabricType;

    public static void main(String[] args) {
        Couch sofa = new Couch();
        sofa.color = "black";
        sofa.type = "couch";
        sofa.numberOfLegs = 4;
        sofa.numberOfHeadRests = 3;
        sofa.fabricType = "Leather";
    }
}
