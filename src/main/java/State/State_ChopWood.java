package State;

import World.*;

public class State_ChopWood extends State {
    @Override
    public void ExecuteAction() {
        WorldParameter.LumberjackStamina = WorldConstante.LumberjackStaminaMaximum;
        WorldParameter.WoodQuantity++;
        actionState = ActionState.Finished;
        System.out.println("State.State_ChopWood");
    }
}
