package State;

import World.WorldParameter;

public class State_IDLE extends State {

    @Override
    public void ExecuteAction() {
        WorldParameter.LumberjackStamina--;
        actionState = ActionState.Finished;
        System.out.println("State.State_IDLE, doing nothing");
    }
}
