package State;

import State.State;
import World.*;

public class State_Sleep extends State {
    @Override
    public void ExecuteAction() {
        WorldParameter.LumberjackStamina = WorldConstante.LumberjackStaminaMaximum;
        actionState = ActionState.Finished;
        System.out.println("State.State_Sleep, LumberjackStamina set to World.WorldParameter.LumberjackStamina");
    }
}
