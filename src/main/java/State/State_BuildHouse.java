package State;

import World.*;

public class State_BuildHouse extends State {
    @Override
    public void ExecuteAction() {
        WorldParameter.WoodQuantity -= WorldConstante.HouseWoodNeededQuantity;
        WorldParameter.LumberjackStamina = 0.;
        actionState = ActionState.Finished;
        System.out.println("State.State_BuildHouse");
    }
}
