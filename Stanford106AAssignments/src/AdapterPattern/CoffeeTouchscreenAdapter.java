package AdapterPattern;

public class CoffeeTouchscreenAdapter implements CoffeeMachineInterface {

    public OldCoffeeMachine theMachine;

    public static void main(String[] arg) {
        OldCoffeeMachine theMachine = new OldCoffeeMachine();
        CoffeeTouchscreenAdapter newCofeeM = new CoffeeTouchscreenAdapter(theMachine);
        newCofeeM.chooseFirstSelection();
        newCofeeM.chooseSecondSelection();
    }

    public CoffeeTouchscreenAdapter(OldCoffeeMachine newMachine) {
        this.theMachine = newMachine;
    }

    public void chooseFirstSelection() {
        theMachine.selectA();
    }

    public void chooseSecondSelection() {
        theMachine.selectB();
    }
}