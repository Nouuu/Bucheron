package State;

import World.WorldParameter;

public class State_HarvestWood extends State {

    @Override
    public void ExecuteAction() {
        WorldParameter.LumberjackStamina--;
        actionState = ActionState.Finished;
        System.out.println("State.State_HarvestWood");
    }
}
